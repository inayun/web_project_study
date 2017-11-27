/**
 * 재능 기부자
 */
package probono.model.dto;

public class Activist{
	private String id;
	private String name;
	private String password;
	private String major;
	
	/* 문제 1번
	 * 1) 기본 생성자 생성
	 * 2) 파라미터값 받는 생성자 생성
	 * 3) get/set 메소드 생성
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
		builder.append("[재능 기부자 아이디 : ");
		builder.append(id);
		builder.append(", 이름 : ");
		builder.append(name);
		builder.append(", 비밀번호 : ");
		builder.append(password);
		builder.append(", 재능 기부 분야 : ");
		builder.append(major);		
		builder.append("]");
		return builder.toString();
	}
}
