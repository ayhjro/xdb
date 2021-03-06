package org.xdb.test.server;

import org.junit.Test;
import org.xdb.client.CompileClient;
import org.xdb.test.XDBTestCase;

public class TestCompileServer extends XDBTestCase {
	@Test
	public void testSimpleCreate() {
		CompileClient client = new CompileClient();
		
		//create connection -> no error
		String createConnStmt = 
				"CREATE CONNECTION \"testConnection2\" " +
				"URL 'jdbc:mysql://127.0.0.1/xdb' " +
				"USER 'xroot' " +
				"PASSWORD 'xroot' " +
				"STORE 'XDB' ";
		
		this.assertNoError(client.executeStmt(createConnStmt));
		
		String dropConnSql = "DROP CONNECTION \"testConnection2\"";
		this.assertNoError(client.executeStmt(dropConnSql));
	}
}
