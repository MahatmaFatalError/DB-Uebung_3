package de.dhbw.db2.youdb.sql;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import de.dhbw.db2.youdb.sql.error.Error;
import de.dhbw.db2.youdb.sql.error.ErrorType;
import de.dhbw.db2.youdb.sql.statement.Statement;

public class SQLCompiler {
	private Error lastError = Error.NO_ERROR;
	
	public Statement compile(String sql){
		FirstSQLLexer lex = new FirstSQLLexer(new ANTLRStringStream(sql));
       	CommonTokenStream tokens = new CommonTokenStream(lex);

       	FirstSQLParser parser = new FirstSQLParser(tokens);
       	
        try {
            Statement statement =  parser.statement();
            this.lastError = statement.compile();
            
            if(lastError.isError())
            	return null;
            
            return statement;
            
        } catch (RecognitionException e)  {
        	String[] args = {e.getMessage()};
			this.lastError = new Error(ErrorType.TABLE_NOT_EXISTS, args );
        }
        
        return null;
	}

	public Error getLastError() {
		return lastError;
	}
}
