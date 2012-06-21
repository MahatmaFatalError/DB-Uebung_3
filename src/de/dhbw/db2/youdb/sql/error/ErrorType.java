package de.dhbw.db2.youdb.sql.error;

public enum ErrorType {
	NO_ERROR,
	TABLE_EXISTS,
	TABLE_NOT_EXISTS,
	TABLE_NOT_EMPTY,
	INSERT_NUM_VALUES,
	INSERT_PK_VIOLATED,
	INDEX_ON_PK_ONLY_SUPPORTED,
	SINGLE_PK_ONLY_SUPPORTED,
	ATTRIBUTE_NAME_DUPLICATE,
	UNIQUE_IDX_ONLY_SUPPORTED,
	STMT_COMPILE_ERROR,
	SELECT_ATTRIBUTE_NO_TABLE,
	SELECT_ATTRIBUTE_AMB_TABLE,
	SELECT_TABLE_NOT_EXISTS,
	SELECT_ATT_TYPE_MISMATCH,
	SELECT_ONLY_ONE_JOIN_SUPPORTED,
	SELECT_ONLY_TWO_TABLES_SUPPORTED;
	
	public static String toString(ErrorType error, String[] args){
		String msg = "";
		
		switch(error){
		case SELECT_ONLY_TWO_TABLES_SUPPORTED:
			msg =  "SELECT statements currently only support at maximum 2 tables!";
			break;
		case SELECT_ATTRIBUTE_NO_TABLE:
			msg =  "Table for attribute \"<arg0>\" not found!";
			break;
		case SELECT_ATTRIBUTE_AMB_TABLE:
			msg =  "More than one table for attribute \"<arg0>\" found!";
			break;
		case SELECT_TABLE_NOT_EXISTS:
			msg =  "Table \"<arg0>\" not in FROM clause!";
			break;
		case SELECT_ATT_TYPE_MISMATCH:
			msg =  "Types of attribute \"<arg0>\" in WHERE clause do not match!";
			break;
		case SELECT_ONLY_ONE_JOIN_SUPPORTED:
			msg =  "SELECT statement supports only one join currently!";
			break;
		case TABLE_EXISTS:
			msg =  "Table \"<arg0>\" already exists!";
			break;
		case TABLE_NOT_EXISTS:
			msg =  "Table \"<arg0>\" does not exists!";
			break;
		case TABLE_NOT_EMPTY:
			msg =  "Table \"<arg0>\" not empty!";
			break;
		case INSERT_NUM_VALUES:
			msg =  "Insert into table \"<arg0>\" needs a <arg1> values!";
			break;
		case INSERT_PK_VIOLATED:
			msg =  "Primary key attribute value \"<arg0>\" of table \"<arg1>\" not unique!";
			break;
		case SINGLE_PK_ONLY_SUPPORTED:
			msg =  "Tables with more than one primary key attribute are currently not supported!";
			break;
		case ATTRIBUTE_NAME_DUPLICATE:
			msg =  "Attribute name \"<arg0>\" must be unique!";
			break;
		case INDEX_ON_PK_ONLY_SUPPORTED:
			msg =  "Ixdex attribute \"<arg0>\" must be a primary key of table \"<arg1>\"!";
			break;
		case UNIQUE_IDX_ONLY_SUPPORTED:
			msg =  "Non-unique indexes are currently not supported!";
			break;
		case STMT_COMPILE_ERROR:
			msg =  "Statement compilation error: \"<arg0>\" !";
			break;	
		}
		
		//replace args
		if(args!=null){
			for(int i=0; i<args.length; ++i){
				msg = msg.replaceAll("<arg"+i+">", args[i]);
			}
		}
		
		return msg;
	}
}
