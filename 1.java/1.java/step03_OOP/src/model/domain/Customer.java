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
	 *1.  equal() : 객체 주소값 비교 
	 * customer 타입 비교
	 * 동일한 customer인 경우에 멤버 변수값 비교
	 * 기본 타입 값 ==
	 * 객체 타입 값 equals()
	 * 
	 * 2. 이 메소드의 정상 구현 확인 코드를 PolyTest2 에서 개발해보기 
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
