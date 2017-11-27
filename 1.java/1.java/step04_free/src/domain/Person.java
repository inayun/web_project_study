package domain;

public class Person extends Object {
	public String name;
	public int age;
	public String major;

	public Person() {
		super();
	}
	public Person(String name, int age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", major=" + major + "]";
	}

}
