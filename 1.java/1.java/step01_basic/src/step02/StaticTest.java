package step02;

public class StaticTest {
	int no = 10; //객체 생성후에만 사용 가능한 변수
	static int no2 = 20; //static 객체 생성  없어도 무관하게 아무때나  사용 가능 . byte code가 로딩되면서 객체 생성
	
	int getNo(){
		return no; 
	}
	static int getNo2() {
		return no2;
	}
	
	public static void main(String[] args) {
		StaticTest s = new StaticTest(); //객체 생성
		System.out.println(s.getNo()); //10
		System.out.println(StaticTest.getNo2()); //20 스태틱으로 설정된 데이터들은 객체 생성 없이도 사용 가능!!!여러 클래스들이 유기적으로 사용가능
	}

}
 