package step02;
import model.domain.Person;

public class Array3 {
	//�迭 �����ؼ� ��ȯ�ϱ�
	static Person[] getAll(){
		Person[] all = {new Person("�輺��","test"),new Person("���±�","dfd")};
		return all;
	}
	
	//�迭�� ����ϱ�
	static void view(Person[] all){
		for(Person v : all){
			System.out.println(v.toString());
		}
		System.out.println("-----------");
	}
	//Person ��ü �޾Ƽ� �� �����ϱ�
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
