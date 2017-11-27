/* 학습내용
 *  1. 서버의 리소스 자원 절약을 위한 객체수 제한 기법
 *  2. 누구나 사용하는 구조(권장)
 *  	- 정형화된 보편화된 구조
 *  	- Design Pattern
 *  3. 강제로 객체수를 하나로만 제한 할 수 있는 코딩 기법 적용
 *  4. access modifier
 *  	public > protected > default(friendly) > private
 *  5. 개발 기법
 *  	1. 객체 생성  금지 기법
 *  		- 생성자 호출 방지
 *  
 */
package step02;


public class SingleTon {
	//외부 호출 불가 변수
	private static SingleTon instance = new SingleTon();
	//외부에선 호출 불가 생성자
	private SingleTon(){} //객체 생성 방지
	
	//외부에서 호출 가능한 메소드
	//단, static으로 선언된 변수값 변환
	//static  생성자 여러번 호출해도 공유
	public static SingleTon getInstance(){
		return instance;
	}	
	
	// 다양한 biz 로직들 구현이라 가정
	public String getMsg(){
		return "biz 로직";
	}
}
