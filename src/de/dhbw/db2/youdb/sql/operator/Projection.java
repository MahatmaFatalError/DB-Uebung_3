package de.dhbw.db2.youdb.sql.operator;

import java.util.Vector;

import de.dhbw.db2.youdb.storage.AbstractRecord;

@SuppressWarnings("unused")
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
		
		return null;
	}

	@Override
	public void close() {
		this.child.close();
	}
}
