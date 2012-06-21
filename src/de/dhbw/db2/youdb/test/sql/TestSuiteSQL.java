package de.dhbw.db2.youdb.test.sql;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteSQL extends TestSuite
{
  public static Test suite()
  {
    TestSuite suite = new TestSuite( "YouDB-SQL" );
    suite.addTestSuite( TestSql.class );
    return suite;
  }
}