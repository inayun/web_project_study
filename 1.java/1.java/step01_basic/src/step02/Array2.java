//java.lang�� import ���� �ʾƵ� �Ǵ� ������ package

package step02;

import model.domain.Person; //cont shift ���ĺ� o �ϸ� �ڵ� �ϼ�

public class Array2 {
	//�ٽɷ��� = business logic = model = biz
	//Person ��ü��� �迭 �����ؼ� ��ȯ(return)
	public Person[] getPersons(){  //person[] Ÿ���� ��ȯ�ϴ� �޼ҵ�
		Person[] all = {new Person("�輺��","test"),new Person("���±�","dfd")};
		return all;
	}
	
	//ȭ��� ��� ���� = view = presentation logic
	//Person �迭�� �޾Ƽ� �ݺ������� ��� (argument or parameter)
	private void view(Person[] v){
		for(Person p :v){
			System.out.println(p.getId());
		}
	}
	public static void main(String[] args) {
		Array2 a= new Array2();
		Person[] v = a.getPersons();
		a.view(v);
		
		//���� �ι����� �ϳ��� ��ģ ��
		a.view(a.getPersons());
		
		
	}

}
