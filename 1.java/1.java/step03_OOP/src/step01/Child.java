package step01;

class Parent extends Object {
	String id; // private 으로 지정하면 상속 받을 수 없음
	int pw;

	Parent() {
		super();
		System.out.println("부모");
	}

	void printAll() {
		System.out.println(id);
		System.out.println(pw);
	}
}

public class Child extends Parent {
	String name;

	Child() {
		super(); //부모 생성자 호출
		System.out.println("자식");
	}

	void printAll() {
		super.printAll();
		System.out.println(name);
	}

	/*
	 * java.lang.Object의 toString() 반환값 객체명 @위치값을 문자열로 반환
	 * 
	 * API 존재하는 하위 클래스 또는 개발자가 개발하는 데이터용 클래스들 (domain)들은 재정의 권장
	 */
	// 재정의
	public String toString() {
		return "이태현";

	}

	public static void main(String[] args) {
		Child c = new Child(); // object 객체 -> Parent 객체 -> Child 객체 순으로 생성
		System.out.println(c.toString());
		System.out.println("An"); //객체가 생성된거..
		System.out.println("An".toString());
	}
}
