package de.dhbw.db2.youdb.access;

import java.util.HashMap;
import java.util.Vector;

import de.dhbw.db2.youdb.storage.AbstractPage;
import de.dhbw.db2.youdb.storage.AbstractRecord;
import de.dhbw.db2.youdb.storage.PageManager;

public class HeapTable extends AbstractTable {
	
	//metadata 
	Vector<Integer> pageNumbers = new Vector<Integer>();
	
	//data
	protected AbstractPage lastPage;
	protected HashMap<Integer, AbstractPage> pages = new HashMap<Integer, AbstractPage>(); 
		
	/**
	 * Iterator for a table
	 * @author cbinnig
	 *
	 */
	private class Iterator implements java.util.Iterator<AbstractRecord> {
		private int pagePos;
		private int pageNumber;
		private int slotNumber;
		private AbstractPage currentPage;
		
		private Iterator(){
			this.pagePos=0;
			this.pageNumber = HeapTable.this.pageNumbers.get(this.pagePos);
			this.slotNumber=0;
			this.currentPage = HeapTable.this.getPage(this.pageNumber);
		}
		
		@Override
		public boolean hasNext() {
			
			if(pagePos>=HeapTable.this.pageNumbers.size())
				return false;
			
			if(slotNumber>=this.currentPage.getNumRecords() && (pagePos+1)>=HeapTable.this.pageNumbers.size())
				return false;
			
			return true;
		}
		
		@Override
		public AbstractRecord next() {
			if(slotNumber>=this.currentPage.getNumRecords()){
				this.pagePos++;
				this.pageNumber = HeapTable.this.pageNumbers.get(this.pagePos);
				this.slotNumber=0;
				this.currentPage = HeapTable.this.pages.get(pageNumber);
				slotNumber = 0;
			}
			
			AbstractRecord record = HeapTable.this.prototype.clone();
			this.currentPage.read(slotNumber++, record);
			return record;
		}
		
		@Override
		public void remove() {
			//Nothing to do at the moment
		}
	}
	
	/**
	 * 
	 * Constructs table from record prototype
	 * @param prototypeRecord
	 */
	public HeapTable(AbstractRecord prototypeRecord) {
		super(prototypeRecord);
		
		//create first empty page
		this.lastPage = PageManager.createDefaultPage(this.prototype.getFixedLength());
		this.addPage(lastPage);
	}
	
	/**
	 * Creates an iterator
	 * @return Java iterator
	 */
	public java.util.Iterator<AbstractRecord> iterator(){
		return new Iterator();
	}
	
	/**
	 * Adds a new page to container and creates unique page number
	 * @param page Page to ba added to container
	 */
	private void addPage(AbstractPage page){
		Integer pageNumber = page.getPageNumber();
		this.pageNumbers.add(pageNumber);
		this.pages.put(pageNumber, page);
	}
	
	/**
	 * Returns page by page number
	 * @param pageNumber Page number
	 * @return page for a given pagenumber
	 */
	private AbstractPage getPage(int pageNumber){
		return this.pages.get(pageNumber);
	}
	

	@Override
	public RowIdentifier insert(AbstractRecord record) {
		//create new page if necessary
		if(!this.lastPage.recordFitsIntoPage(record)){
			this.lastPage = PageManager.createDefaultPage(this.prototype.getFixedLength());
			this.addPage(lastPage);
		}
		
		//insert record into last page
		int slotNumber = this.lastPage.insert(record);
		
		//increase record counter
		this.recordCount++;
		
		return new RowIdentifier(this.lastPage.getPageNumber(), slotNumber);
	}

	@Override
	public AbstractRecord lookup(int pageNumber, int slotNumber) {
		AbstractRecord record = this.prototype.clone();
		this.getPage(pageNumber).read(slotNumber, record);
		return record;
	}
	
	@Override
	public AbstractRecord lookup(RowIdentifier rid) {
		AbstractRecord record = this.prototype.clone();
		this.getPage(rid.getPageNumber()).read(rid.getSlotNumber(), record);
		return record;
	}
}
