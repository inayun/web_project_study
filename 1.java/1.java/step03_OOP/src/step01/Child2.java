package step01;

class Parent2 {
	String msg;
	void printAll(){
		System.out.println(msg);
	}
}
public class Child2 extends Parent2{
	String no;
	
	void printAll(){
		super.printAll();
		System.out.println(no);
	}
/* 1. ������ ������ � Ŭ���� ���� ������ �ɱ��? parent 2����
 * 2. ���� ������ � Ŭ������ byte code�� �����ұ� ? Child2 
 * 	
 */
	
	public static void main(String[] args) {
		//������ ���� ���� ��, �θ�Ÿ�� ������ ��ӽ�Ų ������� access ����
		Parent2 p = new Child2();//���� �Ǵ� �θ�� �ڽ� �Ǵ� �ڼ� ��ü ���� ����
		p.msg = "��";
		// p.no = "y"; error
		Child2 c = (Child2)p; //��ü Ÿ�԰��� ����ȯ (down casting)
		c.no = "new data";
		
		p.printAll();
	}

}
