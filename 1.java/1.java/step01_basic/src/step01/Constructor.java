/*학습내용
 * 1. 생성자
 * 	1. 선언 문법
 * 		- 클래스명과 동일([..]) {[..]}
 * 		- 참고
 * 		: 개발자가 미 코딩시 컴파일러가 자동 추가
 * 		- 결론 : 자동 추가해줄정도면 클래스의 필수 구성 요소
 * 	2. 호출 문법
 * 		- 객체 생성 시점에 호출
 * 		- 객체 생성과 동시에 멤버 변수 명시적인 초기화 
 * 		- new 생성자 ([..]) 
 * 2. 초기화 단계
 * 	*멤버 변수에만 적용되는 메카니즘
 * 	기본(값) 초기화 -> 명시적인 초기화 -> 생성자 초기화
 */
package step01;

public class Constructor {
	int no = 20; //객체 생성시 기본값인 0으로 자동 초기화
	Constructor(){} //기본생성자
	//오버로딩
	Constructor(int no){ //파라미터, 매개변수, 매개인자, 아규먼트
		this.no = no; //멤버 변수에 로컬 변수로 초기화
	}
	
	public static void main(String[] args) {
		//기본 생성자 호출
		Constructor c = new Constructor();
		
		//argument 가 있는 생성자 호출해서 10이란 값으로 초기화
		/* c2의 no 는 0(기본초기화) -> 20(명시적 초기화) -> 10(생성자초기화) 으로 변경 */
		Constructor c2 = new Constructor(10);
	
		System.out.println(c.no + " " + c2.no);
	}

}
