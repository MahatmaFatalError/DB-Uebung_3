package de.dhbw.db2.youdb.sql.statement;

import de.dhbw.db2.youdb.access.AbstractTable;
import de.dhbw.db2.youdb.catalog.CatalogManager;
import de.dhbw.db2.youdb.catalog.objects.Attribute;
import de.dhbw.db2.youdb.catalog.objects.Index;
import de.dhbw.db2.youdb.catalog.objects.Table;
import de.dhbw.db2.youdb.sql.error.Error;
import de.dhbw.db2.youdb.sql.error.ErrorType;

public class CreateIndexStatement extends Statement{
	//for compilation
	private Index index;
	private Table tabDesc;
	private Attribute attribute;
	
	//for execution
	private AbstractTable table;
	
	private boolean unique;
	
	public Index getIndex() {
		return index;
	}
	
	public void setIndex(Index index) {
		this.index = index;
	}
	
	public Table getTable() {
		return tabDesc;
	}
	
	public void setTable(Table table) {
		this.tabDesc = table;
	}
	
	public Attribute getAttribute() {
		return attribute;
	}
	
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	public boolean isUnique() {
		return unique;
	}
	
	public void setUnique(boolean unique) {
		this.unique = unique;
	}
	
	@Override
	public Error compile() {
		//1. check unique index
		if(!this.unique){
			return new Error(ErrorType.UNIQUE_IDX_ONLY_SUPPORTED, null );
		}
		
		//2. check if table already exists
		table = CatalogManager.getTable(this.tabDesc.getName());
		if(table==null){
			String[] args = {this.tabDesc.getName()};
			return new Error(ErrorType.TABLE_NOT_EXISTS, args );
		}
		
		//3. check if attribute in table is a primary key attribute
		if(!table.getPrimaryKeys().contains(this.attribute)){
			String[] args = {this.attribute.getName(), this.tabDesc.getName()};
			return new Error(ErrorType.INDEX_ON_PK_ONLY_SUPPORTED, args );
		}
		
		//4. check if table is empty
		if(table.getRecordCount()>0){
			String[] args = {this.tabDesc.getName()};
			return new Error(ErrorType.TABLE_NOT_EMPTY, args );
		}
		
		return Error.NO_ERROR;
	}
	
	@Override
	public Error execute() {
		//create new index
		CatalogManager.createUniqueIndex(index, tabDesc, attribute);
		
		return Error.NO_ERROR;
	}
}
