/* 1. �����Ϳ� ���� Ŭ����
 * 2. �����ͷ� ��ü �����Ŀ� �پ��� �޼ҵ� ��ȯ, parameter�� 
 * 		- ���� ���� ����
 * 3. ���
 * 	- Value Object Pattern
 * 	- Data Transfer Object Pattern
 * 	- Java Bean
 * 4. Ŭ������ ����
 * 	- Dept/DeptVO/DeptDTO/DeptBean
 * 
 * */



package model.domain;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DeptDTO [deptno=");
		builder.append(deptno);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", loc=");
		builder.append(loc);
		builder.append("]");
		return builder.toString();
	}


}
