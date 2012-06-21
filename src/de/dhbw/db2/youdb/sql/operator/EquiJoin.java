package de.dhbw.db2.youdb.sql.operator;

import de.dhbw.db2.youdb.storage.AbstractRecord;

@SuppressWarnings("unused")
public class EquiJoin extends BinaryOperator {
	
	private int leftAtt=0;
	private int rightAtt=0;
	
	public EquiJoin(Operator leftChild, Operator rightChild, int leftAtt, int rightAtt) {
		super(leftChild, rightChild);
		this.leftAtt = leftAtt;
		this.rightAtt = rightAtt;
	}

	@Override
	public void open() {
		this.leftChild.open();
		this.rightChild.open();
	}

	@Override
	public AbstractRecord next() {
		//TODO: implement this method
		
		return null;
	}

	@Override
	public void close() {
		this.leftChild.close();
		this.rightChild.close();
	}

}
