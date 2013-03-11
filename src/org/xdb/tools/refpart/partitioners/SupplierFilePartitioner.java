package org.xdb.tools.refpart.partitioners;

import java.util.List;

import org.xdb.logging.XDBLog;
import org.xdb.tools.refpart.AbstractFilePartitioner;
import org.xdb.tools.refpart.DefRefPart.WORK_MODE;

public class SupplierFilePartitioner extends AbstractFilePartitioner {

	public SupplierFilePartitioner(int partitionCount, String inputDir, String outputDir, String tempDir,
			String fileName) {
		super(WORK_MODE.FILE, partitionCount, inputDir, outputDir, tempDir, fileName, "supplier");

		this.logger = XDBLog.getLogger("Supplier File Partitioner");
		columnCount = 7;
		this.inputHashFile = tempDir + "lineitemSupp";
	}

	@Override
	protected String buildSQLRow(List<String> fields) {
		StringBuilder rv = new StringBuilder();
		rv.append("(");
		rv.append(fields.get(0));
		rv.append(",'");
		rv.append(fields.get(1));
		rv.append("','");
		rv.append(fields.get(2));
		rv.append("',");
		rv.append(fields.get(3));
		rv.append(",'");
		rv.append(fields.get(4));
		rv.append("',");
		rv.append(fields.get(5));
		rv.append(",'");
		rv.append(fields.get(6));
		rv.append("')");
		return rv.toString();
	}

	@Override
	protected void defineReferenceVisitors() {

	}

	@Override
	protected String getSQLEnd() {
		return "/*!40000 ALTER TABLE `SUPPLIER` ENABLE KEYS */;\n" + "UNLOCK TABLES;";
	}

	@Override
	protected String getSQLStart() {
		return "DROP TABLE IF EXISTS `SUPPLIER`;\n"
				+ "/*!40101 SET @saved_cs_client     = @@character_set_client */;\n"
				+ "/*!40101 SET character_set_client = utf8 */;\n" + "CREATE TABLE `SUPPLIER` (\n"
				+ "  `S_SUPPKEY` int(11) NOT NULL,\n" + "  `S_NAME` char(25) NOT NULL,\n"
				+ "  `S_ADDRESS` varchar(40) NOT NULL,\n" + "  `S_NATIONKEY` int(11) NOT NULL,\n"
				+ "  `S_PHONE` char(15) NOT NULL,\n" + "  `S_ACCTBAL` decimal(15,2) NOT NULL,\n"
				+ "  `S_COMMENT` varchar(101) NOT NULL,\n" + "  PRIMARY KEY (`S_SUPPKEY`)\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=latin1;\n"
				+ "/*!40101 SET character_set_client = @saved_cs_client */;\n" + "\n" + "--\n"
				+ "-- Dumping data for table `SUPPLIER`\n" + "--\n" + "\n" + "LOCK TABLES `SUPPLIER` WRITE;\n"
				+ "/*!40000 ALTER TABLE `SUPPLIER` DISABLE KEYS */;\n" + "INSERT INTO `SUPPLIER` VALUES ";
	}

}
