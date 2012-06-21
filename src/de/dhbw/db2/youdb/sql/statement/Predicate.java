package de.dhbw.db2.youdb.sql.statement;

import java.util.Vector;

public class Predicate {
	private Vector<SimplePredicate> terms = new Vector<SimplePredicate>();
	
	public void addTerm(SimplePredicate term){
		this.terms.add(term);
	}
	
	public Vector<SimplePredicate> getTerms(){
		return this.terms;
	}
}
