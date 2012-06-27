package de.dhbw.db2.youdb.sql.operator;

import java.util.Iterator;

import de.dhbw.db2.youdb.access.AbstractTable;
import de.dhbw.db2.youdb.storage.AbstractRecord;

@SuppressWarnings("unused")
public class TableScan extends Operator {
	private AbstractTable table;	
	private Iterator<AbstractRecord> tableIter;
	
	public TableScan(AbstractTable table){
		super();
		
		this.table = table;
	}

	@Override
	public void open() {
		this.tableIter = this.table.iterator();
	}

	@Override
	public AbstractRecord next() {
		//TODO: implement this method
		
		while(table.iterator().hasNext()){
			return table.iterator().next();
		}
		
		
		
		return null;
	}

	@Override
	public void close() {
		this.tableIter = null;
	}
}
