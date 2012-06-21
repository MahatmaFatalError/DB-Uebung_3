package de.dhbw.db2.youdb.sql.operator;

import de.dhbw.db2.youdb.storage.AbstractRecord;

public abstract class Operator {
	public abstract void open();
	
	public abstract AbstractRecord next();
	
	public abstract void close();
}
