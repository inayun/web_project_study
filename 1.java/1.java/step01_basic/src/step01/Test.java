package step01;

public class Test {
	//����
	String name; //��� �������� �ʱⰪ�� ���� �����൵ ��
	int age;

	//������
	Test(){} // ������ : �޸𸮿� Ȯ�� �����ϰ� ����
	//�޼ҵ�
	String getName(){ //�޼ҵ� : ��ȯŸ��  �޼ҵ��([...])
		return name;
	}
	void setName(String name){ //�Ķ������ �̸��� ��������� �̸��� �������� this �� ����
		this.name = name; 
	}
	int getAge(){
		return age;
	}
	void setAge(int age){
		this.age = age;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.name = "���ξ�";
		t.age = 24;
		System.out.println(t.name + "" + t.age);
		
		t.setName("������");
		t.setAge(28);
		System.out.println(t.getName() + "" + t.getAge());
		
	}

}
