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
			if(constant instanceof SQLInteger && tmp.getValue(attribute) instanceof SQLInteger){
				SQLInteger sqlint = (SQLInteger) constant;
				SQLInteger sqlatribute = (SQLInteger) tmp.getValue(attribute);
				if(sqlatribute.getValue() == sqlint.getValue()){
					return tmp;
				}
			} else if(constant instanceof SQLInteger && tmp.getValue(attribute) instanceof SQLInteger){
				SQLVarchar sqlvarchar = (SQLVarchar) constant;
				SQLVarchar sqlatribute = (SQLVarchar) tmp.getValue(attribute);
				if(sqlatribute.getValue().equals(sqlvarchar.getValue())){
					return tmp;
				}
			}
			
		}
//		if(tmp.getValue(attribute).equals(constant)){
//			return tmp;
//		}
		
		
		
		
		return null;
	}

	@Override
	public void close() {
		this.child.close();
	}

}
