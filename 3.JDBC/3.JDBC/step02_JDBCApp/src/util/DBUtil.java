/* 1.JDBC?
 * 	- Java Database Connectivity
 *  - DB 종류와 무관하게 DB연동 표준 API
 * 2. 개발을 환경 설정
 * 	- db별 driver 제공
 * 	- 제공하는 주 목적 : db를 편리하게 사용 가능하게 벤더사가 제공
 * 3. 개발 단계
 * 	1단계 :  driver를 메모리에 로딩
 * 	2단계 : 접속 객체 생성(connection)
 *  3단계 : sql 문장들 실행(Statement or PreparedStatement)
 *  		ResultSet execuQuery(String select){}
 *  4단계 : 실행 결과값 활용
 *  	ResultSet 의 주요 API
 *  	1. boolean next() : 검색된 다음 row가 존재하나 확인
 *  	2. 타입 getXxx("컬럼명" or 검색된 컬림의 위치 번호)
 *  		: 해당 컬럼의 데이터값 반환
 *  5단계 : db 접속 해제와 같은 자원 반환
 *  
 */

package util;

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

	/* 1. file read : load
	 * 2. key로 value : getProperty()
	*/ 
	
	static {
		try {
			dbInfo.load(new FileReader("dbInfo.properties"));
			sql.load(new FileReader("sql.properties"));

			Class.forName(dbInfo.getProperty("jdbc.driver"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Properties getProperties(){
		return sql;
	}
	
	

	// 접속이 안될때는 예외를 던져서 클라이언트들이 뭐가 문제인지 알 수 있게 해줘야함
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
	}

	// 자원반환은 클라이언트들이 알필요 없으니까 굳이 예외 안던져줘도 됨....서버에서 알아서 처리
	// query == select 용 자원반환
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try { // 자원 반환 순서 매우 중요

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

	// dml 용 자원반환
	public static void close(Connection con, Statement stmt) {
		try { // 자원 반환 순서 매우 중요

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
	
	public static void main(String[] args){
		try{
			System.out.println(getConnection());
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

}
