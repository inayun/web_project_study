// �ټ��� DAO Ŭ�������� ������ ��� ���� �ڵ�鸸 �и�
package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {
	//web ���� �������� properties �ν� ������ API
	//���ǻ��� : Ȯ���� ���� �ڵ� �Ұ�
	static ResourceBundle resource = null;
	//Connection pooling  ��� Ȱ�밡���� API
	static DataSource source = null;
	
	static{		 
		try {
			Context initContext = new InitialContext();		
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			source = (DataSource)envContext.lookup("jdbc/myoracle");
			resource = ResourceBundle.getBundle("conf/sql");
		} catch (Exception e) {			
			e.printStackTrace();
		}	
	}
	
	public static ResourceBundle getResourceBundle(){
		return resource;
	}
	
	public static Connection getConnection() throws SQLException{
		return source.getConnection();
	}
		
	public  static void close(Statement stmt, Connection con){
		try{
			if(stmt != null){
				stmt.close();
				stmt = null;
			}
			if(con != null){
				con.close();
				con = null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public  static void close(ResultSet rset, Statement stmt, Connection con){
		try{
			if(rset != null){
				rset.close();	
				rset = null;
			}
			if(stmt != null){
				stmt.close();	
				stmt = null;
			}
			if(con != null){
				con.close();		
				con = null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}


