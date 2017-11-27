/* ???
 * 1. JDBC URL - oracle.jdbc.driver.OracleDriver
 */
package probono.model.util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	
	static Properties dbInfo = new Properties();
	static Properties sql = new Properties();
	
	
	static {
		try {
			dbInfo.load(new FileReader("dbInfo.properties"));
			sql.load(new FileReader("sql.properties"));
			
			Class.forName(dbInfo.getProperty("jdbc.driver"));
			System.out.println(dbInfo.getProperty("jdbc.driver"));
		} catch (Exception c) {
			c.printStackTrace();
		}
	}

	public static Properties getProperties(){
		return sql;
	}
	
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
	}

	// DML¿ë
	public static void close(Connection con, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	// SELECT¿ë
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if (rset != null) {
				rset.close();
				rset = null;
			}
			close(con, stmt);
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
}
