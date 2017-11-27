/* 학습내용
 * 1. == (똥등 비교 연산자)
 * 	1. 기본 타이비 값 비교
 * 	2. 객체 타입 : 주소값 비교
 * 
 * 2. 문자열 데이터값 비교 메소드 : equals()
 * 	1. java.lang.Object 에서 제공
 * 		- 객체의 주소값 비교 분석
 * 
 * 	2. 하위 클래스들 대부분 재정의
 * 		- 동일한 타입에 한해서 서로 다른 객체의 내용값 비교
 */
package step01;

import model.domain.Customer;

public class PolyTest2 {
	//polyTest2 타입에 한해서만 true 반환
	public boolean equals(Object o){
		boolean result = false;
		if(o instanceof PolyTest2){
			result = true;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		PolyTest2 p = new PolyTest2();
		PolyTest2 p2 = new PolyTest2();
		System.out.println(p.equals(p2));

		Customer c = new Customer("박성준",10);
		Customer c2 = new Customer("박준",10);
		System.out.println(c.equals(c2));

		
		System.out.println("string".equals("a"));
		System.out.println("string".equals("string"));
	}

}
