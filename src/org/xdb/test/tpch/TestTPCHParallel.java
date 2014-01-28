package org.xdb.test.tpch;

import org.xdb.client.CompileClient;
import org.xdb.error.Error;
import org.xdb.test.DistributedXDBTestCase;

/**
 * Test case with partitioned TPC-H schema
 * @author cbinnig
 *
 */
public class TestTPCHParallel extends DistributedXDBTestCase {
	
	public TestTPCHParallel() {
		super(2);
	}


	private CompileClient client = new CompileClient();
	
	private String[] schemaDDLs = {
			"CREATE CONNECTION TPCH1 " +
			"URL 'jdbc:mysql://127.0.0.1/tpch_s01' " + 
			"USER 'xroot' " +
			"PASSWORD 'xroot' " +
			"STORE 'XDB';", 
			
			"CREATE CONNECTION TPCH2 " +
			"URL 'jdbc:mysql://127.0.0.1/tpch_s01' " + 
			"USER 'xroot' " +
			"PASSWORD 'xroot' " +
			"STORE 'XDB';", 
			
			"CREATE TABLE LINEITEM ( " +
			"L_ORDERKEY    		INTEGER," +
			"L_PARTKEY     		INTEGER," +
			"L_SUPPKEY     		INTEGER," +
			"L_LINENUMBER  		INTEGER," +
			"L_QUANTITY    		DECIMAL," +
			"L_EXTENDEDPRICE  	DECIMAL," +
			"L_DISCOUNT    		DECIMAL," +
			"L_TAX         		DECIMAL," +
			"L_RETURNFLAG  		VARCHAR," +
			"L_LINESTATUS  		VARCHAR," +
			"L_SHIPDATE    		DATE," +
			"L_COMMITDATE  		DATE," +
			"L_RECEIPTDATE 		DATE," +
			"L_SHIPINSTRUCT 	VARCHAR," +
			"L_SHIPMODE     	VARCHAR," +
			"L_COMMENT      	VARCHAR" +
			") PARTIONED BY HASH ( L_ORDERKEY ) ( " +
			" P0 IN CONNECTION TPCH1," +
			" P1 IN CONNECTION TPCH2 )",
			
			"CREATE TABLE ORDERS  ( " +
			"O_ORDERKEY       INTEGER, " +
			"O_CUSTKEY        INTEGER, " +
			"O_ORDERSTATUS    VARCHAR, " +
			"O_TOTALPRICE     DECIMAL, " +
			"O_ORDERDATE      DATE, " +
			"O_ORDERPRIORITY  VARCHAR, " +
			"O_CLERK          VARCHAR,  " +
			"O_SHIPPRIORITY   INTEGER, " +
			"O_COMMENT        VARCHAR" +
			") PARTIONED BY RREF ( O_ORDERKEY REFERENCES LINEITEM.L_ORDERKEY ) ",
			
			
			"CREATE TABLE  CUSTOMER ( " +
			"C_CUSTKEY     INTEGER, " +
			"C_NAME        VARCHAR, " +
			"C_ADDRESS     VARCHAR, " +
			"C_NATIONKEY   INTEGER, " +
			"C_PHONE       VARCHAR, " +
			"C_ACCTBAL     DECIMAL  , " +
			"C_MKTSEGMENT  VARCHAR, " +
			"C_COMMENT     VARCHAR" +
			") PARTIONED BY RREF ( C_CUSTKEY REFERENCES ORDERS.O_CUSTKEY )",
			

			"CREATE TABLE SUPPLIER ( " +
			"S_SUPPKEY INTEGER, " +
			"S_NAME VARCHAR, " +
			"S_ADDRESS VARCHAR, " +
			"S_NATIONKEY INTEGER, " +
			"S_PHONE VARCHAR, " +
			"S_ACCTBAL DECIMAL, " +
			"S_COMMENT VARCHAR" +
			") PARTIONED BY RREF ( S_SUPPKEY REFERENCES LINEITEM.L_SUPPKEY )",
			
			"CREATE TABLE NATION (  " +
			"N_NATIONKEY INTEGER, " +
			"N_NAME VARCHAR," +
			"N_REGIONKEY INTEGER," +
			"N_COMMENT VARCHAR" +
			") REPLICATED IN CONNECTION TPCH1, TPCH2;",
			
			"CREATE TABLE REGION ( " +
			"R_REGIONKEY INTEGER," +
			"R_NAME VARCHAR," +
			"R_COMMENT VARCHAR" +
			") REPLICATED IN CONNECTION TPCH1, TPCH2;"
	};
	
	@Override
	public void setUp(){
		super.setUp();
		this.createSchema();
	}
	
	private void createSchema(){
		for(String schemaDDL: this.schemaDDLs){
			executeStmt(schemaDDL);
		}
	}
	
	private void executeStmt(String stmt){
		Error error = client.executeStmt(stmt);
		this.assertNoError(error);
	}
	
	/*
	select
		l_returnflag,
		l_linestatus,
		sum(l_quantity) as sum_qty,
		sum(l_extendedprice) as sum_base_price,
		sum(l_extendedprice * (1 - l_discount)) as sum_disc_price,
		sum(l_extendedprice * (1 - l_discount) * (1 + l_tax)) as sum_charge,
		avg(l_quantity) as avg_qty,
		avg(l_extendedprice) as avg_price,
		avg(l_discount) as avg_disc,
		count(*) as count_order
	from
		lineitem
	where
		l_shipdate <= date '1998-12-01' - interval ':1' day (3)
	group by
		l_returnflag,
		l_linestatus
	order by
		l_returnflag,
		l_linestatus;
		 */
	/*public void testQ1() {
		String q1 = "select	l_returnflag,	"
				+ "l_linestatus,	"
				+ "sum(l_quantity) as sum_qty,	"
				+ "sum(l_extendedprice) as sum_base_price,	"
				+ "sum(l_extendedprice * (1 - l_discount)) as sum_disc_price,	"
				+ "sum(l_extendedprice * (1 - l_discount) * (1 + l_tax)) as sum_charge,	"
				+ "avg(l_quantity) as avg_qty,	"
				+ "avg(l_extendedprice) as avg_price,	"
				+ "avg(l_discount) as avg_disc,	"
				+ "count(l_orderkey) as count_order " + "from	lineitem "
				+ "where l_shipdate <= date '1998-12-01' "
				+ "group by l_returnflag, l_linestatus";

		executeStmt(q1);
	}*/

	public void testQ3(){
		String q3 = "" +
				"select l_orderkey, " +
				"sum(l_extendedprice*(1-l_discount)) as revenue, " +
				"o_orderdate, " +
				"o_shippriority " +
				"from customer, " +
				"orders, " +
				"lineitem " +
				"where c_mktsegment = 'BUILDING' and " +
				"c_custkey = o_custkey and " +
				"l_orderkey = o_orderkey and " +
				"o_orderdate < date '1995-03-15' and " +
				"l_shipdate > date '1995-03-15' " +
				"group by l_orderkey, o_orderdate, o_shippriority";
		
		this.executeStmt(q3);
	}
	
	public void testQ5WithAvg(){
		
		/*
		 * 
		 * Select 
n_name,
sum(l_extendedprice * (1-l_discount)) as revenue,
avg(l_extendedprice * (1-l_discount)) as avgrevenue
from 
customer,
orders,
lineitem,
supplier,
nation,
region
where c_custkey = o_custkey
and l_orderkey = o_orderkey
and l_suppkey = s_suppkey
and c_nationkey = s_nationkey
and s_nationkey = n_nationkey
and r_regionkey = n_regionkey
and r_name = 'ASIA'
and o_orderdate > DATE('1994-01-01 00:00:00')
and o_orderdate < DATE('1995-01-01 00:00:00')
group by n_nationkey, n_name;
		 */
		String q5 = "Select n_name, " +
					"sum(l_extendedprice * (1-l_discount)) as revenue, " +
					"avg(l_extendedprice * (1-l_discount)) as avgrevenue " +
					"from customer, orders, lineitem, supplier, nation, region " +
					"where c_custkey = o_custkey " +
					"and l_orderkey = o_orderkey " +
					"and l_suppkey = s_suppkey  " +
					"and n_nationkey = s_nationkey " +
					"and r_regionkey = n_regionkey " +
					"and s_nationkey = c_nationkey " +
					"and r_name = 'ASIA' " +
					"and o_orderdate > date '1994-01-01' "+
					"and o_orderdate < date '1995-01-01' "+
					"group by n_nationkey, n_name;";
		this.executeStmt(q5);
	}
	
	
	@Override
	public void tearDown(){
		super.tearDown();
	}
}