package step01;

class Parent extends Object {
	String id; // private ���� �����ϸ� ��� ���� �� ����
	int pw;

	Parent() {
		super();
		System.out.println("�θ�");
	}

	void printAll() {
		System.out.println(id);
		System.out.println(pw);
	}
}

public class Child extends Parent {
	String name;

	Child() {
		super(); //�θ� ������ ȣ��
		System.out.println("�ڽ�");
	}

	void printAll() {
		super.printAll();
		System.out.println(name);
	}

	/*
	 * java.lang.Object�� toString() ��ȯ�� ��ü�� @��ġ���� ���ڿ��� ��ȯ
	 * 
	 * API �����ϴ� ���� Ŭ���� �Ǵ� �����ڰ� �����ϴ� �����Ϳ� Ŭ������ (domain)���� ������ ����
	 */
	// ������
	public String toString() {
		return "������";

	}

	public static void main(String[] args) {
		Child c = new Child(); // object ��ü -> Parent ��ü -> Child ��ü ������ ����
		System.out.println(c.toString());
		System.out.println("An"); //��ü�� �����Ȱ�..
		System.out.println("An".toString());
	}
}
