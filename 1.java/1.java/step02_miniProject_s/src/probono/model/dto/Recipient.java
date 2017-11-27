/*
 * ��� ������ 
 */
package probono.model.dto;

public class Recipient{
	private String id;
	private String name;
	private String password;
	private String receiveContent;

	/* ���� 2��
	 * 1) �⺻ ������ ����
	 * 2) �Ķ���Ͱ� �޴� ������ ����
	 * 3) get/set �޼ҵ� ����
	 */
	Recipient(){}
	
	public Recipient(String id, String name, String password, String receiveContent){
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.receiveContent = receiveContent;
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
	public String getReceiveContent() {
		return receiveContent;
	}
	public void setReceiveContent(String receiveContent) {
		this.receiveContent = receiveContent;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[��� ������ ���̵� : ");
		builder.append(id);
		builder.append(", �̸� : ");
		builder.append(name);
		builder.append(", ��й�ȣ : ");
		builder.append(password);
		builder.append(", �����޴� ����ڰ� �����޴� ���� : ");
		builder.append(receiveContent);
		builder.append("]");
		return builder.toString();
	}
}
