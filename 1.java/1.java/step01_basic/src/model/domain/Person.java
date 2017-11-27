package model.domain;

public class Person {
	private String id; // �ν��Ͻ� ���� - ��ü ������ ������ ���Ӱ� ���� ���� ��������
	private String pw; // ����ƽ ����  - �����Ǵ� ��� ��ü�� �����ϴ� ����
	
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