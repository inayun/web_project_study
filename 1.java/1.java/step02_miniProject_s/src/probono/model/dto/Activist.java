/**
 * ��� �����
 */
package probono.model.dto;

public class Activist{
	private String id;
	private String name;
	private String password;
	private String major;
	
	/* ���� 1��
	 * 1) �⺻ ������ ����
	 * 2) �Ķ���Ͱ� �޴� ������ ����
	 * 3) get/set �޼ҵ� ����
	 */
	
	Activist(){}
	
	public Activist(String id,String name,String password,String major){
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.major = major;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[��� ����� ���̵� : ");
		builder.append(id);
		builder.append(", �̸� : ");
		builder.append(name);
		builder.append(", ��й�ȣ : ");
		builder.append(password);
		builder.append(", ��� ��� �о� : ");
		builder.append(major);		
		builder.append("]");
		return builder.toString();
	}
}
