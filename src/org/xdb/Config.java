package org.xdb;

import java.io.Serializable;
import java.util.logging.Level;

import org.xdb.utils.Identifier;

/**
 * XDB central configuration
 * 
 * @author cbinnig
 * 
 */
public class Config implements Serializable {

	private static final long serialVersionUID = -769530083761951611L;

	public static final String COMPUTE_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static final String COMPUTE_DB_URL = "jdbc:mysql://127.0.0.1/";
	public static final String COMPUTE_DB_NAME = "xdb_tmp";
	public static final String COMPUTE_DB_USER = "xroot";
	public static final String COMPUTE_DB_PASSWD = "xroot";
	public static final Identifier COMPUTE_NOOP_ID = new Identifier("NOOP");
	public static final int COMPUTE_PORT = 55555;
	public static final Integer COMPUTE_MAX_FETCHSIZE = Integer.MAX_VALUE;

	public static final String METADATA_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static final String METADATA_DB_URL = "jdbc:mysql://127.0.0.1/xdb_schema";
	public static final String METADATA_SCHEMA = "xdb_schema";
	public static final String METADATA_USER = "xroot";
	public static final String METADATA_PASSWORD = "xroot";
	public static final String METADATA_OID_NAME = "OID";
	public static final int METADATA_PORT = 55556;
	public static final String XDB_DEFAULT_SCHEMA = "PUBLIC";

	public static final int QUERYTRACKER_PORT = 55557;

	public static final String LOG_FILE = "./log/xdb.log";
	public static final Level LOG_LEVEL = Level.INFO;
}
