/* customer.properties 파일  read해서  해당 정보로
 * 그 수만큼 customer 객체 생성하고
 * 생성된 객체의 데이터들을 콘솔창에 출력해보기
 * 
 * 요구사항 도출  -> 분석, 설계시 확장성 고려한 설계
 * -> 개발 설꼐 -> 
 * step 02 : 이름으로 검색
 * 
 */
package step03.api;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import model.domain.Customer;

public class ApiTest3 {

	static String name;
	static int age;
	static String value;
	static String[] valueData;
	static ArrayList<Customer> all = new ArrayList<Customer>();

	static void search(String name) throws NotFoundException {

		for (Customer c : all) {
			if (c.getName().equals(name)) {
				System.out.println(c);
			}
		}
		throw new NotFoundException("검색한 결과가 없습니다.");
	}

	public static void main(String[] args) {

		Properties info = new Properties();
		try {
			info.load(new FileReader("customer.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 파일 읽어오기
		Iterator<String> keyAll = info.stringPropertyNames().iterator(); // 키값
																			// 받아오기
		while (keyAll.hasNext()) {
			value = info.getProperty(keyAll.next()); // 키마다 밸루값 받아오기
			valueData = value.split(","); // 밸루값을 구분해서 배열에 담기
			name = valueData[0];
			age = Integer.parseInt(valueData[1]); // string을 int로 변환
			all.add(new Customer(name, age));

		}
		// customer list 정보 뽑기
		for (Customer c : all) {
			System.out.println(c + "\t");
		}

		try {
			search("홍길동");
			search("한상유");
		} catch (NotFoundException e) {
			e.printStackTrace();
		}

	}

}
