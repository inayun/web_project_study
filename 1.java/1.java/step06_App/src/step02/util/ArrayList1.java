/* 학습 내용
 * 1. java.util.package
 * 2. 배열과 흡사, 단 동적 메모리, 객체만 저장 및 활용 가능한 타입
 * 3. jdk 1.5 부터 추가된 문법
 * 4. jdk 1.7 부터 추가된 문법
 * 5. jdk 1.5 API부터 표현된  표현법
 */

package step02.util;

import java.util.ArrayList;

public class ArrayList1 {
	static void m1(){
		// 11번째 데이터 저장시 10개의 메모리 자동 추가생성
		// 21번째 데이터 
		ArrayList a = new ArrayList(); //10개 공간 생성 
		a.add("string"); // index 0번째 저장
		a.add(new Integer(3)); //1번째
		a.add("test"); //2번째 저장
		
		System.out.println(a.get(0));
		System.out.println("실제 데이터 개수" +  a.size());
		
		a.remove(0);
		System.out.println(a.get(0)); //0번째가 비워지는게 아니고 뒤에서부터 채워짐
		System.out.println("실제 데이터 개수" +  a.size());
		
		/*String v = (String)a.get(0); //저장시 object 타입으로 변환 따라서 형변환 필수
		System.out.println(v);
		*/

	}
	//jdk 1.5 부터 추가된 문법
	//저장 및 관리하는 데이터 타입 제한 - 제네릭
	//형변환 없이 변환 가능
	static void m2(){
		ArrayList<String>a = new ArrayList<String>(); //동적 String[] 형태로 변환
		a.add("s");
		// a.add(new Integer(5))); 오류
		String v = (String)a.get(0); //저장시 object 타입으로 변환 따라서 형변환 필수
		System.out.println(v);

	}
	//jdk 1.7부터 적용
	static void m3(){
		ArrayList<String>a = new ArrayList<>(); //동적 String[] 형태로 변환
		a.add("s");
		String v = (String)a.get(0); //저장시 object 타입으로 변환 따라서 형변환 필수
		System.out.println(v);
		
		// a.add(new Integer(5))); 오류

	}
	//신반복문 for(:)
	static void m4(){
		ArrayList a = new ArrayList();
		a.add("a"); //0 Object타입으로 저장
		a.add(new Integer(3));
		a.add(new Byte("3"));
		
		for(Object list : a){ //제네릭 안쓴경우에는 object 타입으로 받기 때문에 꼭 object로 해야함
			System.out.println(list + "\t");
		}
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("dffd");
		s.add("dfsfff");
		
		for (String list : s){
			System.out.println(list + "\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m2();
		m3();
		m4();
	}

}
