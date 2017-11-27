/* �ֿ����
 * 1. ������ ȣ���ؼ� ��ü�� �����Ǵ� �ܰ�
 * 	- �����ڰ� ȣ���
 * 	- ������ ������ Ŭ������ �� ��� �������� �Ϻ��ϰ� �޸𸮿� ������
 * 	- ������ ���� ����
 * 2. ���
 * 	- �޸𸮿� '��� ������' ������ �켱
 * 
 */


package step02;

public class Static2 {
	/* 1. ��ü�� ���� ������ ����?
	 * 2. ���̻��� ��ü ���� ���� �� Ŭ������ ������ �޼ҵ� ȣ�� ������?
	 */
	public static void main(String[] args){
		C c = new C(); //c ��ü ����
		//c ��ü ���� -> b ��ü ���� -> a ��ü ���� 
		
		//��ü �ּҰ� ���� 
		System.out.println(c);
		System.out.println(c.b); 
		System.out.println(c.b.a); 
		
		c.c(); //c�� ȣ���ϸ鼭 b ��ü�� ������
		c.b.b(); //cŬ������ b��ü�� ȣ���ϸ鼭 a��ü�� ������
		c.b.a.a(); // CŬ������ b��ü ȣ�� -> BŬ���� a��ü ȣ�� -> AŬ������ a�޼ҵ� ȣ�� 
		
	}
}

class A{
	A(){
		System.out.println("A ������");
	}
	void a() {
		System.out.println("A");
}
	static{
		System.out.println("A static ���");
	}
	
}
class B{
	A a = new A();
	B(){
		System.out.println("B ������");
	}
	void b(){
		System.out.println("B");
	}
	static{
		System.out.println("B static ���");
	}
}	
class C{
	B b = new B();
	C(){
		System.out.println("C ������");
	}
	void c(){
		System.out.println("C");
	}
	static{
		System.out.println("C static ���");
	}
}
