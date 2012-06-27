package de.dhbw.db2.youdb.sql.operator;

import java.util.Vector;

import de.dhbw.db2.youdb.storage.AbstractRecord;
import de.dhbw.db2.youdb.storage.Record;

public class Projection extends UnaryOperator {
	
	private Vector<Integer> attributes;
	
	public Projection(Operator child, Vector<Integer> attributes) {
		super(child);
		
		this.attributes = attributes;
	}

	@Override
	public void open() {
		this.child.open();
	}

	@Override
	public AbstractRecord next() {
		//TODO: implement this method
		
		AbstractRecord record = new Record(attributes.size());
		
//		for(int i = 0; attributes.listIterator().hasNext(); i++){
//			int projection = attributes.listIterator().next().intValue();
//			child.open();
//			record.setValue(i, child.next().getValue(projection));
//			
//		}
		
		for (int i : attributes) {
			int projection = attributes.listIterator().next().intValue();
			//child.open();
			record.setValue(i, child.next().getValue(projection));
		}
		child.next();
		
		
		return record;
	}

	@Override
	public void close() {
		this.child.close();
	}
}
