/* 학습내용
 *  1. 각 메소드별로 기능 구현
 *   select (전체, 부서버노로 해당 부서만)
 *   insert / update / delete
 *  2. 효율적인 코드 구현
 */

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {

	// 부서 번호로 해당 부서의 모든 정보 검색
	// 검색해서 콘솔 출력? 반환해서 요청한 곳으로 데이터 제공후
	/*
	 * 경우의 수 1. SQLException 2. 정상 실행
	 * 
	 */
	static Properties sql = DBUtil.getProperties();

	static DeptDTO selectDept(int deptno) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("selectDept"));
			pstmt.setInt(1, deptno);
			rset = pstmt.executeQuery();
			// 데이터가 없다고 해도 null 이 넘어오지 않음
			if (rset.next()) {
				return new DeptDTO(rset.getInt(1), rset.getString(2), rset.getString(3));
			}
		} finally { // 문제가 생기던말든 자원반환
			DBUtil.close(con, pstmt, rset);
		}
		return null;
	}

	// 모든부서 정보 검색
	/*
	 * 1. SQLException - DB접속문제, sql 문장오류
	 * 
	 * 2. Table 존재 및 데이터 존재 - ArrayList 를 view로 출력
	 * 
	 * 3. table 존재 데이터 무 - ArrayList 객체는 존재, 내용이 size() 0
	 */

	static ArrayList<DeptDTO> selectAll() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<DeptDTO> all = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("selectAll"));
			rset = pstmt.executeQuery();
			all = new ArrayList<DeptDTO>();

			// 데이터가 없다고 해도 null 이 넘어오지 않음
			while (rset.next()) {
				all.add(new DeptDTO(rset.getInt(1), rset.getString(2), rset.getString(3)));
			}
		} finally { // 문제가 생기던말든 자원반환
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

	// 값만 가변적인 동일한 sql 문장만 실행하고자 할때 권장
	// 왜? 개발도 편리하고 DB 자체적으로 실행 속도가 빠른 API
	// 단점 : 하나의 문장 실행 객체로 다양한 sql 실행 불가
	static void insertDept2(DeptDTO dept) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("insertDetp2"));
			// sql 문장에 단순 값 반영
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			// 실제 db에 실행
			int result = pstmt.executeUpdate();
			System.out.println(result);
			if (result == 1) {
				System.out.println("success");
			}
		} finally {
			DBUtil.close(con, pstmt);
		}

	}

	// 개발한 메소드들 확인 단계
	/*
	 * select All -> insert -> select " -> selectAll
	 * 
	 */

	public static void main(String[] args) {
		try {
			ArrayList<DeptDTO> all = selectAll();

			if (all.size() != 0) {
				for (DeptDTO v : all) {
					System.out.println(v);
				}

			} else {
				System.out.println("검색 데이터가 미 존재합니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("모든 데이터 검색시 오류");
		}

		System.out.println("-----------저장-----------");
		try {
			insertDept2(new DeptDTO(70, "영업부", "시청역"));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("저장시 오류 : 데이터 무결성 발생");
		}

		System.out.println("----------부서 검색----------");
		try {
			DeptDTO selectData = selectDept(70);

			if (selectData != null) {
				System.out.println(selectData.toString());
			} else {
				System.out.println("해당 부서 정보는 존재하지 않습니다.");

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("부서 번호로 검색시 오류 발생");
		}
	}

}
