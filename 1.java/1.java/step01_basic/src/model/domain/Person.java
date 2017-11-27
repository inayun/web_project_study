package model.domain;

public class Person {
	private String id; // 인스턴스 변수 - 객체 생성시 무조건 새롭게 생성 절대 공유안함
	private String pw; // 스태틱 변수  - 생성되는 모든 객체가 공유하는 변수
	
	public Person(){}
	
	public Person(String i, String p){
		id = i;
		pw = p;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pw=" + pw + "]";
	}
	
}