/* 로직
 * - info.properties 파일로부터 key로 데이터 read 해서 각 데이터들 화면에 출력
 * 개발단계
 * 1: properties 자바 소스로 read
 * 2: 
 * 3: , 구분자로 데이터 분해
 * 4: 분해된 데이터의 index에 맞게 데이터 출력
 * 
 * properties 파일 read
 * 	- properties 객체 생성
 * 	- load(), 2byte 단위로 read 가능한 객체 생성 (fileReader)
 * properties 파일로부터 key를 먼저 read
 * 	- stringPropertyNames() set 객체로 반환
 * 	- 하나하나의 데이터 필요 따라서 Iterator 객체 생성
 * read 한 key로 value값 또 read
 * 	- properties 객체로부터 getProperty(String key) 로  String 값으로 반환
 * value 가공해서 배열에 저장
 * - 구분자로 데이터 분해해서 저장
 * 배열에 저장된 데이터를 화면에 출력
 * - 다수의 데이터 따라서 반복
 */
package step03.api;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class apiTest2Properties {

	public static void main(String[] args) {
		try {
			// properties 파일로부터 데이터 활용 가능한 객체
			Properties info = new Properties();
			// load = infro.properties 파일을 Properties 객체가 사용가능하게 인식시키는 메소드
			info.load(new FileReader("info.properties"));

			// properties 파일에서 가져오는 키값들은 stirng 타입의 set임!!! 그래서 변수만들어서 넣어주고 싶으면
			// set<String>으로 타입지정필수
			Set<String> keyData = info.stringPropertyNames();
			Iterator<String> keyAll = keyData.iterator();

			// 위의 두 줄을 한줄로 합친거
			// Iterator<String> keyAll = info.stringPropertyNames().iterator();

			String key = "";
			String value = "";
			String[] names = null;
			String[] ages = null;

			while (keyAll.hasNext()) {

				key = keyAll.next();
				value = info.getProperty(key); // string으로 한 문장이 다 딸려옴 "f,d,d,d"

				if (key.equals("key1")) {
					names = value.split(",");
				} else {
					ages = value.split(",");
				}
			}
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i] + "-" + ages[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
