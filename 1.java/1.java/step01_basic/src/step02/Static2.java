/* 주요사항
 * 1. 생성자 호출해서 객체가 생성되는 단계
 * 	- 생성자가 호출됨
 * 	- 생성자 보유한 클래스의 각 멤버 변수들이 완벽하게 메모리에 생성됨
 * 	- 생성자 실제 실행
 * 2. 결론
 * 	- 메모리에 '멤버 변수들' 생성이 우선
 * 
 */


package step02;

public class Static2 {
	/* 1. 객체들 생성 시점은 언제?
	 * 2. 더이상의 객체 생성 없이 각 클래스가 보유한 메소드 호출 문법은?
	 */
	public static void main(String[] args){
		C c = new C(); //c 객체 생성
		//c 객체 생성 -> b 객체 생성 -> a 객체 생성 
		
		//객체 주소값 나옴 
		System.out.println(c);
		System.out.println(c.b); 
		System.out.println(c.b.a); 
		
		c.c(); //c를 호출하면서 b 객체가 생성됨
		c.b.b(); //c클래스의 b객체를 호출하면서 a객체가 생성됨
		c.b.a.a(); // C클래스의 b객체 호출 -> B클래스 a객체 호출 -> A클래스의 a메소드 호출 
		
	}
}

class A{
	A(){
		System.out.println("A 생성자");
	}
	void a() {
		System.out.println("A");
}
	static{
		System.out.println("A static 블록");
	}
	
}
class B{
	A a = new A();
	B(){
		System.out.println("B 생성자");
	}
	void b(){
		System.out.println("B");
	}
	static{
		System.out.println("B static 블록");
	}
}	
class C{
	B b = new B();
	C(){
		System.out.println("C 생성자");
	}
	void c(){
		System.out.println("C");
	}
	static{
		System.out.println("C static 블록");
	}
}
