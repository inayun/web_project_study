package model;

public class Person {
	private String name;
	private String age;
	private String phone;
	public Person() {
		super();
	}
	public Person(String name, String age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", 이름 : ");
		builder.append(name);
		builder.append(", 나이 : ");
		builder.append(age);
		builder.append(", 휴대폰 번호 : ");
		builder.append(phone);
		builder.append("");
		return builder.toString();
	}
	
}
