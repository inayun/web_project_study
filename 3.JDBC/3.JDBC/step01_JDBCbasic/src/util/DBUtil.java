/* 1.JDBC?
 * 	- Java Database Connectivity
 *  - DB ������ �����ϰ� DB���� ǥ�� API
 * 2. ������ ȯ�� ����
 * 	- db�� driver ����
 * 	- �����ϴ� �� ���� : db�� ���ϰ� ��� �����ϰ� �����簡 ����
 * 3. ���� �ܰ�
 * 	1�ܰ� :  driver�� �޸𸮿� �ε�
 * 	2�ܰ� : ���� ��ü ����(connection)
 *  3�ܰ� : sql ����� ����(Statement or PreparedStatement)
 *  		ResultSet execuQuery(String select){}
 *  4�ܰ� : ���� ����� Ȱ��
 *  	ResultSet �� �ֿ� API
 *  	1. boolean next() : �˻��� ���� row�� �����ϳ� Ȯ��
 *  	2. Ÿ�� getXxx("�÷���" or �˻��� �ø��� ��ġ ��ȣ)
 *  		: �ش� �÷��� �����Ͱ� ��ȯ
 *  5�ܰ� : db ���� ������ ���� �ڿ� ��ȯ
 *  
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ������ �ȵɶ��� ���ܸ� ������ Ŭ���̾�Ʈ���� ���� �������� �� �� �ְ� �������
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbInfo.getProperty("jdbc.url"),
				dbInfo.getProperty("jdbc.id"),
				dbInfo.getProperty("jdbc.password"));
	}

	// �ڿ���ȯ�� Ŭ���̾�Ʈ���� ���ʿ� �����ϱ� ���� ���� �ȴ����൵ ��....�������� �˾Ƽ� ó��
	// query == select �� �ڿ���ȯ
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try { // �ڿ� ��ȯ ���� �ſ� �߿�

			if (rset != null) {
				rset.close();
				rset = null;
			}

			if (stmt != null) {
				stmt.close();
				stmt = null;
			}

			if (con != null) {
				con.close();
				con = null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// dml �� �ڿ���ȯ
	public static void close(Connection con, Statement stmt) {
		try { // �ڿ� ��ȯ ���� �ſ� �߿�

			if (stmt != null) {
				stmt.close();
				stmt = null;
			}

			if (con != null) {
				con.close();
				con = null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
