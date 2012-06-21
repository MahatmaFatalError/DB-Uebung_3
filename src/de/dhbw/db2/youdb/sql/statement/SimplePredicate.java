package de.dhbw.db2.youdb.sql.statement;

import de.dhbw.db2.youdb.catalog.objects.Attribute;

public class SimplePredicate {
	private Attribute attribute;
	private CompareOperator op = CompareOperator.EQUAL;
	private Constant constant;
	private Attribute attribute2;

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	public void setAttribute2(Attribute attribute) {
		this.attribute2 = attribute;
	}

	public Attribute getAttribute2() {
		return attribute2;
	}
	
	public CompareOperator getOp() {
		return op;
	}

	public void setOp(CompareOperator op) {
		this.op = op;
	}

	public Constant getConstant() {
		return constant;
	}

	public void setConstant(Constant constant) {
		this.constant = constant;
	}
	
	public boolean isJoinPredicate(){
		if(this.attribute2!=null)
			return true;
		return false;
	}
}
