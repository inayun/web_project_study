/* 학습 내용
 * 1. 실무형 코드
 * 2. 구조
 * 	1. 유효성 검증 후 무효한 경우에 예외 발생
 * 	2. 예외 발생될 수도 있는 상황의 코드
 * 		1. 처리 방법 1 : try ~ catch
 * 		2. 처리방법 2 : 호출한 곳으로 예외 처리 위임 throws(하나이상 던질 수 있따는 의미)
 * 
 */
package step01.exception;

public class ExceptionTest3 {

	static void m1(){
		System.out.println(10/0);
	}
	
	//ㅇ
	static void m2(){
		try {
			Class.forName("step01.exception.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//실제 얘외 발생시 호출한 곳으로 예외 처리 위임
	static void m3()throws ClassNotFoundException{
		Class.forName("step01.exception.A");
		
	}
	
	//id 유효성 검증 메소드
	//단, master 가 아닌 경우 exception 객체 생성해서 던지기
	
	static void idCheck(String id) throws Exception{
		if ( !id.equals("master")){
			throw new Exception ("넌 누구니?");
		}
		System.out.println( "master 맞네요 안녕하세요");
		

	}
	
	//id 가 중복된 경우 사용자 정의 예외를  발생하는 메소드
	//중복시  IdDoubleException 발생
	static void idCheck2(String id) throws IdDoubleException {
		if( id.equals("master")){
			throw new IdDoubleException("id 중복 불허");
					}
		System.out.println("가입 완료");
	}
	
	
	public static void main(String[] args) {
		
		try {
			idCheck2("ma");
			System.out.println("-------------");
			idCheck2("master");
			} catch (IdDoubleException e) {
			e.printStackTrace();
		}
		
		
		try{	
		idCheck("ma"); 
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		m1();
		m2();
		
	}

}
