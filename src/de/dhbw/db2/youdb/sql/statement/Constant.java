package de.dhbw.db2.youdb.sql.statement;

import de.dhbw.db2.youdb.storage.types.SQLType;

public class Constant {
	private String value;
	private SQLType type;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public SQLType getType() {
		return type;
	}

	public void setType(SQLType type) {
		this.type = type;
	}
}
