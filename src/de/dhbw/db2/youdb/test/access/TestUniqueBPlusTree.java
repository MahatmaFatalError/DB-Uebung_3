package de.dhbw.db2.youdb.test.access;

import org.junit.Assert;

import de.dhbw.db2.youdb.access.AbstractTable;
import de.dhbw.db2.youdb.access.AbstractUniqueIndex;
import de.dhbw.db2.youdb.access.HeapTable;
import de.dhbw.db2.youdb.access.UniqueBPlusTree;
import de.dhbw.db2.youdb.storage.AbstractRecord;
import de.dhbw.db2.youdb.storage.Record;
import de.dhbw.db2.youdb.storage.types.SQLInteger;
import de.dhbw.db2.youdb.storage.types.SQLVarchar;
import de.dhbw.db2.youdb.test.TestCase;

public class TestUniqueBPlusTree extends TestCase{
	
	/**
	 * Insert three records and reads them again using a SQLInteger index
	 */
	public void testIndexSimple(){
		AbstractRecord record1 = new Record(2);
		record1.setValue(0, new SQLInteger(1));
		record1.setValue(1, new SQLVarchar("Hello111", 10));
		
		AbstractRecord record2 = new Record(2);
		record2.setValue(0, new SQLInteger(2));
		record2.setValue(1, new SQLVarchar("Hello112", 10));
		
		AbstractRecord record3 = new Record(2);
		record3.setValue(0, new SQLInteger(3));
		record3.setValue(1, new SQLVarchar("Hello113", 10));
		
		AbstractTable table = new HeapTable(record1.clone());
		
		AbstractUniqueIndex<SQLInteger> index = new UniqueBPlusTree<SQLInteger>(table, 0, 1);
		index.insert(record1);
		index.insert(record2);
		index.insert(record3);
		//index.print();
		
		AbstractRecord record1Cmp = index.lookup((SQLInteger) record1.getValue(0));
		Assert.assertEquals(record1, record1Cmp);
		
		AbstractRecord record2Cmp = index.lookup((SQLInteger) record2.getValue(0));
		Assert.assertEquals(record2, record2Cmp);
		
		AbstractRecord record3Cmp = index.lookup((SQLInteger) record3.getValue(0));
		Assert.assertEquals(record3, record3Cmp);
	}
	
	/**
	 * Insert three records and reads them again using a SQLVarchar index
	 */
	public void testIndexSimple2(){
		AbstractRecord record1 = new Record(2);
		record1.setValue(0, new SQLInteger(1));
		record1.setValue(1, new SQLVarchar("Hello111", 10));
		
		AbstractRecord record2 = new Record(2);
		record2.setValue(0, new SQLInteger(2));
		record2.setValue(1, new SQLVarchar("Hello112", 10));
		
		AbstractRecord record3 = new Record(2);
		record3.setValue(0, new SQLInteger(3));
		record3.setValue(1, new SQLVarchar("Hello113", 10));
		
		AbstractTable table = new HeapTable(record1.clone());
		
		AbstractUniqueIndex<SQLVarchar> index = new UniqueBPlusTree<SQLVarchar>(table, 1, 1);
		index.insert(record1);
		index.insert(record2);
		index.insert(record3);
		//index.print();
		
		AbstractRecord record1Cmp = index.lookup((SQLVarchar) record1.getValue(1));
		Assert.assertEquals(record1, record1Cmp);
		
		AbstractRecord record2Cmp = index.lookup((SQLVarchar) record2.getValue(1));
		Assert.assertEquals(record2, record2Cmp);
		
		AbstractRecord record3Cmp = index.lookup((SQLVarchar) record3.getValue(1));
		Assert.assertEquals(record3, record3Cmp);
	}
	
	/**
	 * Insert many records with increasing keys and do loopup for each key afterwards
	 */
	public void testIndexForwardInsert(){
		int size = 100000;
		int fillGrade = 2500;
		AbstractRecord record = new Record(2);
		record.setValue(0, new SQLInteger());
		record.setValue(1, new SQLVarchar(100));
		
		AbstractTable table = new HeapTable(record);
		AbstractUniqueIndex<SQLInteger> index = new UniqueBPlusTree<SQLInteger>(table, 0, fillGrade);
		
		//insert
		for(int i=0; i<size; i++){
			record.setValue(0, new SQLInteger(i));
			record.setValue(1, new SQLVarchar("Hello"+i, 100));
			index.insert(record);
		}
		
		//index.print();
		
		//lookup
		for(int i=0; i<size; i++){
			record.setValue(0, new SQLInteger(i));
			record.setValue(1, new SQLVarchar("Hello"+i, 100));
			AbstractRecord recordCmp = index.lookup((SQLInteger) record.getValue(0));
			Assert.assertEquals(record, recordCmp);
		}
	}
	
	/**
	 * Insert many records with decreasing keys and do loopup for each key afterwards
	 */
	public void testIndexReverseInsert(){
		int size = 100000;
		int fillGrade = 2500;
		
		AbstractRecord record = new Record(2);
		record.setValue(0, new SQLInteger());
		record.setValue(1, new SQLVarchar(100));
		
		AbstractTable table = new HeapTable(record);
		AbstractUniqueIndex<SQLInteger> index = new UniqueBPlusTree<SQLInteger>(table, 0, fillGrade);
		
		//insert
		for(int i=size; i>0; i--){
			record.setValue(0, new SQLInteger(i));
			record.setValue(1, new SQLVarchar("Hello"+i, 100));
			index.insert(record);
		}
		
		//index.print();
		
		//lookup
		for(int i=size; i>0; i--){
			record.setValue(0, new SQLInteger(i));
			record.setValue(1, new SQLVarchar("Hello"+i, 100));
			AbstractRecord recordCmp = index.lookup((SQLInteger) record.getValue(0));
			Assert.assertEquals(record, recordCmp);
		}
	}
}
