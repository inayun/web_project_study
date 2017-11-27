package step02;
import model.domain.Person;

public class Array3 {
	//배열 생성해서 반환하기
	static Person[] getAll(){
		Person[] all = {new Person("김성배","test"),new Person("조승규","dfd")};
		return all;
	}
	
	//배열값 출력하기
	static void view(Person[] all){
		for(Person v : all){
			System.out.println(v.toString());
		}
		System.out.println("-----------");
	}
	//Person 객체 받아서 값 수정하기
	static void idChange(Person v){
		v.setId("newID");
	}
	
	public static void main(String[] args) {
		
		/*view(Array3.getAll());
		idChange(Array3.getAll()[1]);
		view(Array3.getAll());
		 */
	}

}
