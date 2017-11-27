/* 1. 배열학습
 * 2. 특징
 *  	1. 모든 배열은 무조건 객체
 *  	2. 배열 크기는 불변
 *  		- 동적 메모리가 필요한 경우 java.util List API 들 사용
 *  	3. 무조건 length 라는 배열 크기값 보유한 속성 자동 생성
 * 3. JDK 1.5 버전부터 추가된 반복문 추가 학습
 * 
 * 
 */
package step02;
import model.domain.Person; //model.domain 패키지의 하위에 있는것을 갖다 쓰겟당

public class Array1 {
	//int 타입인 기본 타입으로 배열 생성 및 반복문 활용해서 출력
	//step 1.선언, 생성 , 초기화 분리
	//step 2.선언, 생성, 초기화 한문장으로 처리
	static void m1(){
		//step 01
		int i [] = null; //선언
		i = new int[3]; //생성
		i[0] = 1; //초기화
		i[1] = 2;
		i[2] = 3;
		
		//step 02
		int i2[] = {1, 2, 3};
		
		//정통 반복문
		for(int index=0; index < i2.length; index ++){
			System.out.print(i2[index] + "\t");
		}
		System.out.println();
		//jdk 1.5 추가된 반복문
		
		for(int v:i2){ //왼쪽 데이터 받는애 : 오른쪽 데이터 제공하는애
			System.out.print(v + "\t");
		}
	}	
	
	//Person 참조 타입의 배열 생성, 반복문 출력
	static void m2(){
	
		Person[] all = {new Person("홍길동","aaa"),new Person("허성욱","bbb"),new Person("유성현","ccc")};
		// 신박본문 이름(geId()) 출력
		for(Person p : all){
			System.out.print(p.getId() + "\t");
		}
	}
	
	public static void main(String[] args) {
		m1();
	}

}
