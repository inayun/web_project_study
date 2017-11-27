/* 주요 API
 * 1. String
 * 	- ""만으로 자동 객체
 * - 절대 불변
 * - 실시간 가변적인 문자열 표현엔 부적합
 * 	(해결책 : java.lang.StringBuffer & java.lang.Bulider)
 * - jdk 1.5 까지 문자열 내용 수정 속도가 저하
 * - jdk 1.6 부터는 문자열 내용 수정시 속도 보완
 * 2. 데이터 구조
 * 	1. text - 구조화 개별 처리
 * 	2. CSV - 일반 쉼표가 기준으로 데이터 구분
 * 	3. JSON (java script object notation)
 * 	- key 와 value 가 매핑된 데이터 구조
 * 	- 모바일/웹에서 가장 사용 빈도가 높다
 * 4. xml
 * 5. properties
 * 	- key와 value가  = 구분자로 매핑 구조
 * 	- 영어, 숫자를 제외한 모든 언어는 유니코드로 표현해야함
 * 		(이클립스 등은 자동 변환 기능 포함)
 * 	- jdk/bin/유니코드로 변환해주는 프로그램도 존재
 * 
 */
package step03.api;

import java.util.ArrayList;

public class ApiTest1 {
	
	static String m1(){
		return "장원,윤진,승규";
	}
	
	public static void main(String[] args) {
		String[] all = m1().split(",");
		System.out.println(all[2]);
		
		
	}

}
