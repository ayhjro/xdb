package org.xdb.test.tpch.tracker;

import org.xdb.test.tpch.tracker.TestTPCHQ3;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteDistributedTPCH extends TestSuite
{
  public static Test suite()
  {
    TestSuite suite = new TestSuite( TestSuiteDistributedTPCH.class.getPackage().getName() );
    suite.addTestSuite( TestTPCHQ3.class );
    suite.addTestSuite( TestTPCHQ5.class );
    return suite;
  }
}