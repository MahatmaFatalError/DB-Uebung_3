package de.dhbw.db2.youdb.sql.statement;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import de.dhbw.db2.youdb.catalog.CatalogManager;
import de.dhbw.db2.youdb.catalog.objects.Attribute;
import de.dhbw.db2.youdb.catalog.objects.DataType;
import de.dhbw.db2.youdb.catalog.objects.Table;
import de.dhbw.db2.youdb.sql.error.Error;
import de.dhbw.db2.youdb.sql.error.ErrorType;

public class CreateTableStatement extends Statement{
	//for comilation and execution
	private Table table;
	private Vector<Attribute> attributes = new Vector<Attribute>();
	private Vector<DataType> types = new Vector<DataType>();
	private Vector<Attribute> primaryKeys = new Vector<Attribute>();
	
	public void addAttribute(Attribute attribute){
		this.attributes.add(attribute);
	}

	public Vector<Attribute> getAttributes() {
		return attributes;
	}
	
	public void addType(DataType type){
		this.types.add(type);
	}
	
	public Vector<DataType> getTypes() {
		return types;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	
	public Vector<Attribute> getPrimaryKeys() {
		return primaryKeys;
	}

	public void addPrimaryKey(Attribute primaryKey) {
		this.primaryKeys.add(primaryKey);
	}

	@Override
	public Error compile() {
		//1. check if table already exists
		if(CatalogManager.getTable(table.getName())!=null){
			String[] args = {table.getName()};
			return new Error(ErrorType.TABLE_EXISTS, args );
		}
		
		//2. check primary key
		if(this.primaryKeys.size()>1){
			return new Error(ErrorType.SINGLE_PK_ONLY_SUPPORTED, null );
		}
		
		//3. check attributes
		Set<String> attSet = new HashSet<String>();
		for(Attribute att: this.attributes){
			if(attSet.contains(att.getName())){
				String[] args = {att.getName()};
				return new Error(ErrorType.ATTRIBUTE_NAME_DUPLICATE, args );
			}
		}
		return Error.NO_ERROR;
	}

	@Override
	public Error execute() {		
		//execute statement
		CatalogManager.createTable(this.table, this.attributes, this.types, this.primaryKeys);
		
		return Error.NO_ERROR;
	}
}
