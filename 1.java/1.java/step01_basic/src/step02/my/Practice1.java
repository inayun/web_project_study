package step02.my;

public class Practice1 {
	//멤버 변수 선언
	int day = 1;
	String title = "bigdata";
	String chapter = "java";


	Practice1(){}

	//로컬 변수 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice1 p = new Practice1(); //참조형 데이터 타입의 변수 생성. p 객체 생성 . p에 객체주소값지정
		System.out.println(p.title + " " + p.day + " " + p.chapter);
		System.out.println();

	}

}
