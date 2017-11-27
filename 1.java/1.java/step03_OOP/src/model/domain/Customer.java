package model.domain;

public class Customer {
	private String name;
	private int age;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	/* 
	 *1.  equal() : ��ü �ּҰ� �� 
	 * customer Ÿ�� ��
	 * ������ customer�� ��쿡 ��� ������ ��
	 * �⺻ Ÿ�� �� ==
	 * ��ü Ÿ�� �� equals()
	 * 
	 * 2. �� �޼ҵ��� ���� ���� Ȯ�� �ڵ带 PolyTest2 ���� �����غ��� 
	 */
	
	
	
	public boolean equals(Object o){
		if (o instanceof Customer){
			Customer c = (Customer)o;
			 if ((c.getName().equals(name)) && (c.getAge()==age)){
				 return true;
			 } 
			 return false;
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
	

}
