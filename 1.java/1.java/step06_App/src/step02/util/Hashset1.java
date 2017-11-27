package step02.util;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	//HashSet 에 저장된 데이터 값들을 Iterator api 사용해서 하나씩 한 line으로 출력하기
	
	
	static void m1(HashSet<Object> set){
		Iterator<Object> all = set.iterator();
		while(all.hasNext()){ //all 이 데이터를 갖고있닝
			System.out.println(all.next());
		}
	}

	static void m2(){
		HashSet <String> set = new HashSet<>();
		set.add("e");
		set.add("aae");
		set.add("DFff");
		//한줄씩 출력 - 문자열 길이 출력(String class 만의 length()
	
		Iterator<String> all = set.iterator();
		while(all.hasNext()){ //데이터 존재하니?
			 //next를 두번써서 받으면 이터레이터가 next 쓸때마다 포인터를 옮기기때문에 한번더쓰면 다른 값이 지정됨
			// 그래서 변수에 넣음
			String s = all.next(); //데이터 반환 , 한번이상 쓸수가 없음
			System.out.println(s+ "-" +s.length()); 
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//중복 데이터 안됨
		//기존 데이터를 바꿔버림
		// get 이 없음
		HashSet set = new HashSet();
		set.add(3); //set.add(new Integer(3)); autoboxing
		set.add(5.6);
		set.add(3);
		set.add("ddd");
		set.add(5.6);
		System.out.println(set.toString()); 
		m2();
	}

}
