/* �н�����
 *  1. �� �޼ҵ庰�� ��� ����
 *   select (��ü, �μ������ �ش� �μ���)
 *   insert / update / delete
 *  2. ȿ������ �ڵ� ����
 */

package step01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {

	// �μ� ��ȣ�� �ش� �μ��� ��� ���� �˻�
	// �˻��ؼ� �ܼ� ���? ��ȯ�ؼ� ��û�� ������ ������ ������
	/*
	 * ����� �� 1. SQLException 2. ���� ����
	 * 
	 */
	static DeptDTO selectDept(int deptno) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rset = stmt.executeQuery("select * from dept where deptno=" + deptno);
			// �����Ͱ� ���ٰ� �ص� null �� �Ѿ���� ����
			while (rset.next()) {
				return new DeptDTO(rset.getInt(1), rset.getString(2), rset.getString(3));
			}
		} finally { // ������ ��������� �ڿ���ȯ
			DBUtil.close(con, stmt, rset);
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
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<DeptDTO> all = null;

		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rset = stmt.executeQuery("select * from dept");
			all = new ArrayList<DeptDTO>();

			// �����Ͱ� ���ٰ� �ص� null �� �Ѿ���� ����
			while (rset.next()) {
				all.add(new DeptDTO(rset.getInt(1), rset.getString(2), rset.getString(3)));
			}
		} finally { // ������ ��������� �ڿ���ȯ
			DBUtil.close(con, stmt, rset);
		}
		return all;
	}

	/*
	 * insert �õ��� �߻� ������ ����� ��
	 *
	 * 
	 */

	static void insertDept(DeptDTO dept) throws SQLException {
		Connection con = null;
		// �ϳ��� �� ��ü�� �ټ��� �پ��� sql ���� ���� ����
		Statement stmt = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			int result = stmt.executeUpdate("insert into dept values(" + dept.getDeptno() + ",'" + dept.getDname()
					+ "','" + dept.getLoc() + "')");
			if (result == 1) {
				System.out.println("success");
			}
		} finally {
			DBUtil.close(con, stmt);
		}

	}

	// ���� �������� ������ sql ���常 �����ϰ��� �Ҷ� ����
	// ��? ���ߵ� ���ϰ� DB ��ü������ ���� �ӵ��� ���� API
	// ���� : �ϳ��� ���� ���� ��ü�� �پ��� sql ���� �Ұ�
	static void insertDept2(DeptDTO dept) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into dept values(?,?,?)");
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
			} else

			{
				System.out.println("�ش� �μ� ������ �������� �ʽ��ϴ�.");

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�μ� ��ȣ�� �˻��� ���� �߻�");
		}
	}

}
