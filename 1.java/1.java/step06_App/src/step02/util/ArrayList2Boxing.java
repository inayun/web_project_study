/* 학습내용
 *  1. 기본타입의 도우미 클래스들 활용
 *  	-기본 8가지 타입과 1:1 매핑되는 클래스들 존재
 *  	- java.lang
 *  	- wrapper class들
 *	2. jdk 1. 5 부터 추가된 wrapper class 들만의 문법
 * 		1. 용어
 * 			- autoboxing
 * 			- unboxing
 * 		2. 객체 타입과 기본 타입은 절대 자동 호환 불가, 다른 타입
 * 
 */


package step02.util;

import java.util.ArrayList;

public class ArrayList2Boxing {

	public static void main(String[] args) {
		//autoboxing
		Integer i = 3; //  Integer i = new Integer(3);
		System.out.println(i.intValue());
		
		//unboxing
		int i2 = new Integer(7); // int i2 =(new Integer(7)).intValue();
		System.out.println(i2);
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(3);  //list.add(new Integer(3));
		list.add(5.6); //list.add(new Double(5.6));
		
	}

}
