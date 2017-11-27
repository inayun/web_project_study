/*
 * 재능 수혜자 
 */
package probono.model.dto;

public class Recipient{
	private String id;
	private String name;
	private String password;
	private String receiveContent;

	/* 문제 2번
	 * 1) 기본 생성자 생성
	 * 2) 파라미터값 받는 생성자 생성
	 * 3) get/set 메소드 생성
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
		builder.append("[재능 수혜자 아이디 : ");
		builder.append(id);
		builder.append(", 이름 : ");
		builder.append(name);
		builder.append(", 비밀번호 : ");
		builder.append(password);
		builder.append(", 제공받는 대상자가 제공받는 서비스 : ");
		builder.append(receiveContent);
		builder.append("]");
		return builder.toString();
	}
}
