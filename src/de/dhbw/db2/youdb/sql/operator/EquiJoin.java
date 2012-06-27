package de.dhbw.db2.youdb.sql.operator;

import java.util.Arrays;
import java.util.Iterator;

import de.dhbw.db2.youdb.storage.AbstractRecord;
import de.dhbw.db2.youdb.storage.Record;
import de.dhbw.db2.youdb.storage.types.AbstractSQLValue;

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
		AbstractRecord joinedRec = null;
		
//		for (AbstractSQLValue leftRec : this.leftChild.next().) {		//wie zun teufel Ÿber leftChild iterieren?
//			
//		}
		
		for(AbstractRecord leftRec = this.leftChild.next(); leftRec != null; leftRec = this.leftChild.next()){
			
			AbstractSQLValue leftValue = leftRec.getValue(leftAtt);
			
			for(AbstractRecord rightRec = this.rightChild.next(); rightRec != null; rightRec = this.rightChild.next()){
				
				AbstractSQLValue rightValue = rightRec.getValue(rightAtt);
				
				if(leftValue.compareTo(rightValue) == 1){
					
					AbstractSQLValue[] leftValues = leftRec.getValues();
					AbstractSQLValue[] rightValues = rightRec.getValues();
					
					AbstractSQLValue[] newValues = concat(leftValues, rightValues);
					
					joinedRec = new Record(newValues.length);
					joinedRec.append(leftRec).append(rightRec);
					
					return joinedRec;					
				}
				
			}		
			
			
		}

		
		return joinedRec;
	}

	@Override
	public void close() {
		this.leftChild.close();
		this.rightChild.close();
	}
	
	private static <T> T[] concat(T[] first, T[] second) {
		  T[] result = Arrays.copyOf(first, first.length + second.length);
		  System.arraycopy(second, 0, result, first.length, second.length);
		  return result;
		}

}
