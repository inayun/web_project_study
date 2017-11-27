/* �н�����
 * 1. == (�˵� �� ������)
 * 	1. �⺻ Ÿ�̺� �� ��
 * 	2. ��ü Ÿ�� : �ּҰ� ��
 * 
 * 2. ���ڿ� �����Ͱ� �� �޼ҵ� : equals()
 * 	1. java.lang.Object ���� ����
 * 		- ��ü�� �ּҰ� �� �м�
 * 
 * 	2. ���� Ŭ������ ��κ� ������
 * 		- ������ Ÿ�Կ� ���ؼ� ���� �ٸ� ��ü�� ���밪 ��
 */
package step01;

import model.domain.Customer;

public class PolyTest2 {
	//polyTest2 Ÿ�Կ� ���ؼ��� true ��ȯ
	public boolean equals(Object o){
		boolean result = false;
		if(o instanceof PolyTest2){
			result = true;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		PolyTest2 p = new PolyTest2();
		PolyTest2 p2 = new PolyTest2();
		System.out.println(p.equals(p2));

		Customer c = new Customer("�ڼ���",10);
		Customer c2 = new Customer("����",10);
		System.out.println(c.equals(c2));

		
		System.out.println("string".equals("a"));
		System.out.println("string".equals("string"));
	}

}
