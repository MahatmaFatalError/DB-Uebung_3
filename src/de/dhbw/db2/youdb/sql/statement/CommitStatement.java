package de.dhbw.db2.youdb.sql.statement;

import de.dhbw.db2.youdb.sql.error.Error;

public class CommitStatement extends Statement {

	@Override
	public Error compile() {
		return Error.NO_ERROR;
	}

	@Override
	public Error execute() {
		return Error.NO_ERROR;
	}

}
