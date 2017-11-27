package step02.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMap2 {

	//현 메소드는 다른 개발자가 구현해서 호출 권한만 부여한 메소드 가정
	//key들은 모르는 상태로 데이터 값 활용
	
	static HashMap<String, String> getDatas(){
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("k1", "김장원");
		m.put("k2", "최윤진");
		m.put("k3", "조승규");
		m.put("k4", "홍길동");
		m.put("k5", "성춘향");
	
		
		return m;
	}
	
	
	//힌트 : key 는 중복 불허 타입의 set 타입
	// set 타입은 iterateor  api로 하나씩 데이터 사용이 가능
	public static void main(String[] args) {
		 HashMap<String, String> datas = getDatas();
		 Set<String> set = datas.keySet();
		 
		 Iterator<String> keyAll = set.iterator();
		 while(keyAll.hasNext()){
			 String data = keyAll.next();
			 System.out.println(data+"-"+datas.get(data));
		 }
		 
		//출력 형식 : key 값 = value 값
	}

}
