/* �н�����
 *  1. �� �޼ҵ庰�� ��� ����
 *   select (��ü, �μ������ �ش� �μ���)
 *   insert / update / delete
 *  2. ȿ������ �ڵ� ����
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

	// �μ� ��ȣ�� �ش� �μ��� ��� ���� �˻�
	// �˻��ؼ� �ܼ� ���? ��ȯ�ؼ� ��û�� ������ ������ ������
	/*
	 * ����� �� 1. SQLException 2. ���� ����
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
			// �����Ͱ� ���ٰ� �ص� null �� �Ѿ���� ����
			if (rset.next()) {
				return new DeptDTO(rset.getInt(1), rset.getString(2), rset.getString(3));
			}
		} finally { // ������ ��������� �ڿ���ȯ
			DBUtil.close(con, pstmt, rset);
		}
		return null;
	}

	// ���μ� ���� �˻�
	/*
	 * 1. SQLException - DB���ӹ���, sql �������
	 * 
	 * 2. Table ���� �� ������ ���� - ArrayList �� view�� ���
	 * 
	 * 3. table ���� ������ �� - ArrayList ��ü�� ����, ������ size() 0
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

			// �����Ͱ� ���ٰ� �ص� null �� �Ѿ���� ����
			while (rset.next()) {
				all.add(new DeptDTO(rset.getInt(1), rset.getString(2), rset.getString(3)));
			}
		} finally { // ������ ��������� �ڿ���ȯ
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

	// ���� �������� ������ sql ���常 �����ϰ��� �Ҷ� ����
	// ��? ���ߵ� ���ϰ� DB ��ü������ ���� �ӵ��� ���� API
	// ���� : �ϳ��� ���� ���� ��ü�� �پ��� sql ���� �Ұ�
	static void insertDept2(DeptDTO dept) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.getProperty("insertDetp2"));
			// sql ���忡 �ܼ� �� �ݿ�
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			// ���� db�� ����
			int result = pstmt.executeUpdate();
			System.out.println(result);
			if (result == 1) {
				System.out.println("success");
			}
		} finally {
			DBUtil.close(con, pstmt);
		}

	}

	// ������ �޼ҵ�� Ȯ�� �ܰ�
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
				System.out.println("�˻� �����Ͱ� �� �����մϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��� ������ �˻��� ����");
		}

		System.out.println("-----------����-----------");
		try {
			insertDept2(new DeptDTO(70, "������", "��û��"));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("����� ���� : ������ ���Ἲ �߻�");
		}

		System.out.println("----------�μ� �˻�----------");
		try {
			DeptDTO selectData = selectDept(70);

			if (selectData != null) {
				System.out.println(selectData.toString());
			} else {
				System.out.println("�ش� �μ� ������ �������� �ʽ��ϴ�.");

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�μ� ��ȣ�� �˻��� ���� �߻�");
		}
	}

}
