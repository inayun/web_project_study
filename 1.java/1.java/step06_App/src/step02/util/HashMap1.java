package step02.util;

import java.util.HashMap;
import model.domain.Person;

public class HashMap1 {

	static void m1() {
		//hashmap 기본파라미터는 <object, object> 임
		HashMap m = new HashMap();
		m.put("key1", "김장원");
		m.put("key2", "25");

		System.out.println(m.get("key1"));
	}

	/*
	 * hashmap에 내 주변 지인 3명의 정보흫 id (이름값으로 가정) person 객체 각각 생성해서 저장후 key value 중
	 * id값만 출력
	 * 
	 */

	static void m2() {
		HashMap<String, Person> m = new HashMap<String, Person>();
		m.put("1", new Person("김장원", "25"));
		m.put("2", new Person("최윤진", "29"));
		m.put("3", new Person("조승규", "30"));

		System.out.println(m.get("3").getId());
	}
	
	

	public static void main(String[] args) {
		m2();

	}

}
