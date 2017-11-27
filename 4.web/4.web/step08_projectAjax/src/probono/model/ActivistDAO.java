/* CREATE TABLE activist (
       activist_id          VARCHAR2(20)  PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       major                VARCHAR2(50) NULL
);  */
package probono.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import probono.model.dto.ActivistDTO;
import probono.model.util.DBUtil;

public class ActivistDAO {
	static ResourceBundle sql = DBUtil.getResourceBundle();

	public static boolean addActivist(ActivistDTO activist) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean result = false;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getString("addActivist"));
			pstmt.setString(1, activist.getId());
			pstmt.setString(2, activist.getName());
			pstmt.setString(3, activist.getPassword());
			pstmt.setString(4, activist.getMajor());

			int count = pstmt.executeUpdate();

			if (count != 0) {
				result = true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	}

	public static boolean updateActivist(String activistId, String major) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean result = false;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getString("updateActivist"));
			pstmt.setString(1, major);
			pstmt.setString(2, activistId);

			int count = pstmt.executeUpdate();

			if (count != 0) {
				result = true;
			}

		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	}

	public static boolean deleteActivist(String activistId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		Boolean result = false;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getString("deleteActivist"));
			pstmt.setString(1, activistId);

			int count = pstmt.executeUpdate();

			if (count != 0) {
				result = true;
			}

		} finally {
			DBUtil.close(con, pstmt);

		}
		return result;
	}

	// id로 해당 기부자의 모든 정보 반환
	public static ActivistDTO getActivist(String activistId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ActivistDTO activist = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getString("getActivist"));
			pstmt.setString(1, activistId);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				activist = new ActivistDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return activist;
	}

	public static ArrayList<ActivistDTO> getAllActivists() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ActivistDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getString("getAllActivists"));
			rset = pstmt.executeQuery();

			list = new ArrayList<ActivistDTO>();
			while (rset.next()) {
				list.add(new ActivistDTO(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
}
