/*
 * 
 * 1. 변수
 * - 스태틱 변수
 * - 객체 생성없이 사용 가능
 * - class명 . 변수
 * 2. 메소드 
 * - static 메소드
 * - 객체 생성없이 사용 가능
 * - class명 . 메소드([..])
 * 3. static
 * - 모든 user 공유하는 자원들을 단 한번 초기화 활때 사용되는 기술
 * -실행 시점
 * 	: byte code 가 메모리에 저장될때 해상 static{} byte coder 위치에서 바로 실행
 */

package step02;

public class Static1 {
	int no1; //instance 변수
	static int no2; //static 변수
	
	Static1(){ //생성자 constructor
		no1++; //1씩 증가
		no2++;
	}
	
	int getNo1(){ //객체 생성후에만 호출가능한 메소드
		return no1; //객체 생성시에 생성되는 변수
	}
	
	int getNo2(){ //객체 생성후에만 호출 가능한 메소드
		return no2; //갹체 생성전 생성되는 변수
	}
	//갹채 생성 전 호출 가능한 메소드
	/*static void setNo1(int n){  //선언은 문제없는데 바디가 문제임
		no1 = n; //객체 생성시 생성되는 변수  --> 에러남
	} */
	
	static void setNo2 (int n){
		no2 = n; //객체 생성전 생성되는 변수
	}
	
	static { //메인보다 먼저 실행됨
		System.out.println(1);
	}
	public static void main(String[] args) {
		System.out.println(no2);
		
		Static1 s1 = new Static1();
		System.out.println(s1.no1+ " " + no2);
		
		Static1 s2 = new Static1();
		System.out.println(s2.no1+ " " + no2); //no2는 스태틱 변수로 공유되고 있기 때문에 누적되서 증가함
		
		int v = Integer.parseInt("3");
		System.out.println(v);
		
		byte b = Byte.parseByte("3");
		
		//문자와 정수같의 호환 가능 A = 65, c = 97
				
		String v2 = "ABC";
		
		int v3 = v2.charAt(0); //0번째 인덱스를 문자로함
		System.out.println(v3);
		
		
	}

	static {
		System.out.println(2);
	}
}
