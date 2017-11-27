package step01;

class Parent2 {
	String msg;
	void printAll(){
		System.out.println(msg);
	}
}
public class Child2 extends Parent2{
	String no;
	
	void printAll(){
		super.printAll();
		System.out.println(no);
	}
/* 1. 컴파일 시점엔 어떤 클래스 부터 컴파일 될까요? parent 2부터
 * 2. 실행 시점는 어떤 클래스의 byte code를 실행할까 ? Child2 
 * 	
 */
	
	public static void main(String[] args) {
		//다형성 생성 문법 단, 부모타입 변수는 상속시킨 멤버에만 access 가능
		Parent2 p = new Child2();//조상 또는 부모는 자식 또는 자손 객체 대입 받음
		p.msg = "값";
		// p.no = "y"; error
		Child2 c = (Child2)p; //객체 타입같의 형변환 (down casting)
		c.no = "new data";
		
		p.printAll();
	}

}
