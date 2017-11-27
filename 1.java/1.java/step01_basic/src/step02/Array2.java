//java.lang만 import 하지 않아도 되는 유일한 package

package step02;

import model.domain.Person; //cont shift 알파벳 o 하면 자동 완성

public class Array2 {
	//핵심로직 = business logic = model = biz
	//Person 객체들로 배열 생성해서 반환(return)
	public Person[] getPersons(){  //person[] 타입을 반환하는 메소드
		Person[] all = {new Person("김성배","test"),new Person("조승규","dfd")};
		return all;
	}
	
	//화면단 출력 로직 = view = presentation logic
	//Person 배열을 받아서 반복문으로 출력 (argument or parameter)
	private void view(Person[] v){
		for(Person p :v){
			System.out.println(p.getId());
		}
	}
	public static void main(String[] args) {
		Array2 a= new Array2();
		Person[] v = a.getPersons();
		a.view(v);
		
		//위의 두문장을 하나로 합친 것
		a.view(a.getPersons());
		
		
	}

}
