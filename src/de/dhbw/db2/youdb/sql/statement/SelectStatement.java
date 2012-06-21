package de.dhbw.db2.youdb.sql.statement;

import java.util.HashMap;
import java.util.Vector;

import de.dhbw.db2.youdb.access.AbstractTable;
import de.dhbw.db2.youdb.catalog.CatalogManager;
import de.dhbw.db2.youdb.catalog.objects.Attribute;
import de.dhbw.db2.youdb.catalog.objects.Table;
import de.dhbw.db2.youdb.sql.error.Error;
import de.dhbw.db2.youdb.sql.error.ErrorType;
import de.dhbw.db2.youdb.sql.operator.EquiJoin;
import de.dhbw.db2.youdb.sql.operator.Operator;
import de.dhbw.db2.youdb.sql.operator.Projection;
import de.dhbw.db2.youdb.sql.operator.Selection;
import de.dhbw.db2.youdb.sql.operator.TableScan;
import de.dhbw.db2.youdb.storage.AbstractRecord;
import de.dhbw.db2.youdb.storage.types.AbstractSQLValue;
import de.dhbw.db2.youdb.storage.types.SQLType;

public class SelectStatement extends Statement {
	private Vector<Attribute> selectAttributes = new Vector<Attribute>();
	private Vector<Table> fromTables = new Vector<Table>();
	private Predicate wherePredicate;

	private HashMap<String, AbstractTable> tables = new HashMap<String, AbstractTable>();
	private Operator root = null;
	private SimplePredicate joinPredicate;
	private Vector<AbstractRecord> resultSet;

	public void addSelectAttribute(Attribute attribute) {
		this.selectAttributes.add(attribute);
	}

	public Vector<Attribute> getSelectAttributes() {
		return selectAttributes;
	}

	public void addFromTable(Table table) {
		this.fromTables.add(table);
	}

	public Vector<Table> getFromTables() {
		return fromTables;
	}

	public void setWherePredicate(Predicate wherePredicates) {
		this.wherePredicate = wherePredicates;
	}

	public Predicate getWherePredicate() {
		return wherePredicate;
	}

	@Override
	public Error compile() {
		Error error = analyze();
		if (error.isError())
			return error;

		error = generate();
		if (error.isError())
			return error;

		return Error.NO_ERROR;
	}

	private Error generate() {
		// left table scan
		Table leftTableDesc = this.fromTables.get(0);
		AbstractTable leftTable = this.tables.get(leftTableDesc.getName());
		Operator leftOp = new TableScan(leftTable);
		AbstractTable rightTable = null;
		Table rightTableDesc = null;

		// selection
		if (this.wherePredicate != null) {
			for (SimplePredicate pred : this.wherePredicate.getTerms()) {
				if (pred.isJoinPredicate())
					continue;

				if (pred.getAttribute().getTable().getName()
						.equals(leftTableDesc.getName())) {
					int attribute = leftTable.getColumnNumber(pred
							.getAttribute().getName());
					AbstractSQLValue constant = pred.getConstant().getType()
							.getInstance(0);
					constant.parseValue(pred.getConstant().getValue());

					leftOp = new Selection(leftOp, attribute, constant);
				}
			}
		}

		// join
		if (this.joinPredicate != null) {
			rightTableDesc = this.fromTables.get(1);
			rightTable = this.tables.get(rightTableDesc.getName());
			Operator rightOp = new TableScan(rightTable);

			// selection
			for (SimplePredicate pred : this.wherePredicate.getTerms()) {
				if (pred.isJoinPredicate())
					continue;

				if (pred.getAttribute().getTable().getName()
						.equals(rightTableDesc.getName())) {
					int attribute = rightTable.getColumnNumber(pred
							.getAttribute().getName());
					AbstractSQLValue constant = pred.getConstant().getType()
							.getInstance(0);
					constant.parseValue(pred.getConstant().getValue());

					rightOp = new Selection(rightOp, attribute, constant);
				}
			}

			int leftAtt = leftTable.getColumnNumber(this.joinPredicate
					.getAttribute().getName());
			int rightAtt = rightTable.getColumnNumber(this.joinPredicate
					.getAttribute2().getName());

			leftOp = new EquiJoin(leftOp, rightOp, leftAtt, rightAtt);
		}

		// projection
		Vector<Integer> projAtts = new Vector<Integer>();
		for (Attribute projAtt : this.selectAttributes) {
			if (projAtt.getTable().getName().equals(leftTableDesc.getName())) {
				projAtts.add(leftTable.getColumnNumber(projAtt.getName()));
			} else {
				projAtts.add(leftTable.getAttributes().size()
						+ rightTable.getColumnNumber(projAtt.getName()));
			}
		}

		this.root = new Projection(leftOp, projAtts);

		return Error.NO_ERROR;
	}

	/**
	 * Executes semantic analysis
	 * 
	 * @return
	 */
	private Error analyze() {
		// 1. Check tables in FROM clause
		if (this.fromTables.size() > 2) {
			return new Error(ErrorType.SELECT_ONLY_TWO_TABLES_SUPPORTED, null);
		}
		for (Table fromTable : fromTables) {
			AbstractTable table = CatalogManager.getTable(fromTable.getName());
			if (table == null) {
				String[] args = { fromTable.getName() };
				return new Error(ErrorType.TABLE_NOT_EXISTS, args);
			}
			tables.put(fromTable.getName(), table);
		}

		// 2. check attributes in SELECT clause
		for (Attribute selectAtt : this.selectAttributes) {
			Error error = checkAttribute(selectAtt);
			if (error.isError())
				return error;
		}

		// 3. check predicates in WHERE clause
		int joinPredCounter = 0;

		if (this.wherePredicate != null) {
			for (SimplePredicate simplePred : this.wherePredicate.getTerms()) {
				// check if max. 1 join predicate exists
				if (simplePred.isJoinPredicate()) {
					joinPredCounter++;
					this.joinPredicate = simplePred;

					if (joinPredCounter > 1) {
						return new Error(
								ErrorType.SELECT_ONLY_ONE_JOIN_SUPPORTED, null);
					}
				}
				// check left att
				Attribute att1 = simplePred.getAttribute();
				Error error = checkAttribute(att1);
				if (error.isError())
					return error;

				AbstractTable tab1 = this.tables.get(att1.getTable().getName());
				SQLType type1 = tab1.getType(tab1.getColumnNumber(att1
						.getName()));
				SQLType type2 = null;

				// check right att
				if (simplePred.isJoinPredicate()) {
					Attribute att2 = simplePred.getAttribute2();
					error = checkAttribute(att2);
					if (error.isError())
						return error;

					AbstractTable tab2 = this.tables.get(att2.getTable()
							.getName());
					type2 = tab2.getType(tab2.getColumnNumber(att2.getName()));
				}
				// check right const
				else {
					type2 = simplePred.getConstant().getType();
				}

				// check if types of lhs and rhs are comparable
				if (type1 != type2) {
					String[] args = { att1.getName() };
					return new Error(ErrorType.SELECT_ATT_TYPE_MISMATCH, args);
				}
			}
		}
		return Error.NO_ERROR;
	}

	private Error checkAttribute(Attribute selectAtt) {
		if (selectAtt.getTable() == null) {
			Table tableDesc = null;
			int attCounter = 0;

			for (Table fromTable : this.fromTables) {
				if (this.tables.get(fromTable.getName()).getColumnNumber(
						selectAtt.getName()) != -1) {
					tableDesc = fromTable;
					attCounter++;
				}
			}

			if (attCounter == 0) {
				String[] args = { selectAtt.getName() };
				return new Error(ErrorType.SELECT_ATTRIBUTE_NO_TABLE, args);
			} else if (attCounter > 1) {
				String[] args = { selectAtt.getName() };
				return new Error(ErrorType.SELECT_ATTRIBUTE_AMB_TABLE, args);
			}

			selectAtt.setTable(tableDesc);
		} else {
			Table tableDesc = selectAtt.getTable();
			AbstractTable table = this.tables.get(tableDesc.getName());
			if (table == null) {
				String[] args = { tableDesc.getName() };
				return new Error(ErrorType.SELECT_TABLE_NOT_EXISTS, args);
			}
		}

		return Error.NO_ERROR;
	}

	@Override
	public Error execute() {
		// execute statement
		this.root.open();
		this.resultSet = new Vector<AbstractRecord>();
		AbstractRecord rec = this.root.next();

		while (rec != null) {
			this.resultSet.add(rec);
			rec = this.root.next();
		}

		this.root.close();

		return Error.NO_ERROR;
	}

	public Vector<AbstractRecord> getResultSet() {
		return resultSet;
	}
}
