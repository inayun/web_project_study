/* '사용자 정의' 예외 클래스 개발 방법
 * 1. Exception 상속 받는다
 * 2. '생성자' 두개 개발 한다
 * 	1.() : 기본 생성자
 * 	2.(String msg) : 문자열  
 * 하나짜리의 생성자
 */
package step01.exception;

public class IdDoubleException extends Exception {
	public IdDoubleException(){};
	public IdDoubleException(String msg){
		super(msg);
	};
	
}
