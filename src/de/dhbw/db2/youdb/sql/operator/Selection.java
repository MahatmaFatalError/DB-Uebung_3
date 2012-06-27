package de.dhbw.db2.youdb.sql.operator;

import de.dhbw.db2.youdb.storage.AbstractRecord;
import de.dhbw.db2.youdb.storage.types.AbstractSQLValue;
import de.dhbw.db2.youdb.storage.types.SQLInteger;
import de.dhbw.db2.youdb.storage.types.SQLVarchar;

public class Selection extends UnaryOperator {
	
	private int attribute;
	private AbstractSQLValue constant;
	
	public Selection(Operator child, int attribute, AbstractSQLValue constant) {
		super(child);
		
		this.attribute = attribute;
		this.constant = constant;
	}

	@Override
	public void open() {
		this.child.open();
	}

	@Override
	public AbstractRecord next() {
		//TODO: implement this method
		
		for(AbstractRecord tmp = child.next(); tmp != null;  tmp = child.next()){

			if(tmp.getValue(attribute).compareTo(constant) == 0){
				return tmp;
			}			
		}

		return null;
	}

	@Override
	public void close() {
		this.child.close();
	}

}
