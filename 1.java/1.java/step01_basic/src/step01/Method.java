package step01;

public class Method {
	String name;
	String gender;
	int age;
	
	public Method() {}
	public Method(String name2, String gender, int age) {
		this.name = name2;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Method m = new Method();
		Method m1 = new Method("ȫ�浿","��",25);
		m1.setName("������");
		System.out.println(m.getName());
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
		// �޼ҵ� ȣ�� �� �� ���
		
	}

}
