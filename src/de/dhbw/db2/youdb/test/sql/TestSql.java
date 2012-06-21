package de.dhbw.db2.youdb.test.sql;

import junit.framework.Assert;
import de.dhbw.db2.youdb.access.AbstractTable;
import de.dhbw.db2.youdb.access.AbstractUniqueIndex;
import de.dhbw.db2.youdb.catalog.CatalogManager;
import de.dhbw.db2.youdb.sql.SQLCompiler;
import de.dhbw.db2.youdb.sql.error.Error;
import de.dhbw.db2.youdb.sql.statement.SelectStatement;
import de.dhbw.db2.youdb.sql.statement.Statement;
import de.dhbw.db2.youdb.storage.AbstractRecord;
import de.dhbw.db2.youdb.storage.types.SQLInteger;
import de.dhbw.db2.youdb.test.TestCase;


public class TestSql extends TestCase{
	private Statement compile(String sql){
		SQLCompiler compiler = new SQLCompiler();
		Statement stmt = compiler.compile(sql);
		
		if(compiler.getLastError().isError()){
			Assert.assertTrue("Execute failed: "+compiler.getLastError(), false);
		}
		
		return stmt;
	}
	
	private void execute(Statement stmt){
		Error lastError = stmt.execute();
		
		if(lastError.isError()){
			Assert.assertTrue("Execute failed: "+lastError, false);
		}
	}
	
	public void testCreateSimpleTable(){
		Statement stmt = this.compile("CREATE TABLE t0 ( a int, b int )");
		this.execute(stmt);
		
		AbstractTable table = CatalogManager.getTable("T0");
		
		Assert.assertEquals(0, table.getColumnNumber("A"));
		Assert.assertEquals(1, table.getColumnNumber("B"));
	}
	
	public void testInsertSimpleTable(){
		Statement createStmt = this.compile("CREATE TABLE t1 ( a int primary key, b int )");
		this.execute(createStmt);
		
		Statement insertStmt = this.compile("INSERT INTO t1 VALUES (1,1)");
		this.execute(insertStmt);
		insertStmt = this.compile("INSERT INTO t1 VALUES (2,1)");
		this.execute(insertStmt);
		
		AbstractTable table = CatalogManager.getTable("T1");
		Assert.assertEquals(2, table.getRecordCount());
	}
	
	
	@SuppressWarnings("unchecked")
	public void testCreateSimpleTableWithIndex(){
		Statement stmt = this.compile("CREATE TABLE t2 ( a int primary key, b int )");
		this.execute(stmt);
		
		stmt = this.compile("CREATE UNIQUE INDEX i2 ON t2 ( a )");
		this.execute(stmt);
		
		AbstractUniqueIndex<SQLInteger> index = CatalogManager.getUniqueIndex("I2");
		AbstractTable table = index.getTable();
		
		Assert.assertEquals(0, table.getColumnNumber("A"));
		Assert.assertEquals(1, table.getColumnNumber("B"));
	}
	
	//@SuppressWarnings("unchecked")
	public void testInsertSimpleTableWithIndex(){
		Statement stmt = this.compile("CREATE TABLE t3 ( a int primary key, b int )");
		this.execute(stmt);
		
		stmt = this.compile("CREATE UNIQUE INDEX i3 ON t3 ( a )");
		this.execute(stmt);
		
		Statement insertStmt = this.compile("INSERT INTO t3 VALUES (1,1)");
		this.execute(insertStmt);
		insertStmt = this.compile("INSERT INTO t3 VALUES (2,1)");
		this.execute(insertStmt);
		
		AbstractTable table = CatalogManager.getTable("T3");
		Assert.assertEquals(2, table.getRecordCount());
	}
	
	
	public void testSimpleSelect(){
		//CREATE TABLE statements and INSERT statements
		Statement stmt = this.compile("CREATE TABLE t4 ( a int, b int )");
		this.execute(stmt);
		
		stmt = this.compile("INSERT INTO t4 VALUES (1,1)");
		this.execute(stmt);
		stmt = this.compile("INSERT INTO t4 VALUES (2,1)");
		this.execute(stmt);
		stmt = this.compile("INSERT INTO t4 VALUES (3,2)");
		this.execute(stmt);
		
		stmt = this.compile("CREATE TABLE t5 ( c int, d int )");
		this.execute(stmt);
		
		stmt = this.compile("INSERT INTO t5 VALUES (1,1)");
		this.execute(stmt);
		stmt = this.compile("INSERT INTO t5 VALUES (1,2)");
		this.execute(stmt);
		stmt = this.compile("INSERT INTO t5 VALUES (2,2)");
		this.execute(stmt);
		
		//first SELECT statement
		SelectStatement selectStmt = (SelectStatement)this.compile("SELECT a, c FROM t4, t5 WHERE b=c AND d=2");
		this.execute(selectStmt);
		
		for(AbstractRecord rec: selectStmt.getResultSet()){
			System.out.println(rec);
		}
		
		Assert.assertEquals(3, selectStmt.getResultSet().size());
		
		//second SELECT statement
		selectStmt = (SelectStatement)this.compile("SELECT a,b FROM t4 WHERE a=2");
		this.execute(selectStmt);
		
		for(AbstractRecord rec: selectStmt.getResultSet()){
			System.out.println(rec);
		}
		
		Assert.assertEquals(1, selectStmt.getResultSet().size());
	}
}
