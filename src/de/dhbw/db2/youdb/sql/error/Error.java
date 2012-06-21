package de.dhbw.db2.youdb.sql.error;

public class Error {
	public static final Error NO_ERROR = new Error();
	
	private ErrorType type = ErrorType.NO_ERROR;
	private String[] args = null;
	
	public Error(){
	}
	
	public Error(ErrorType type, String[] args){
		this.type = type;
		this.args = args;
	}
	
	public boolean isError(){
		return this.type != ErrorType.NO_ERROR;
	}
	
	public String toString(){
		return ErrorType.toString(type, args);
	}
}
