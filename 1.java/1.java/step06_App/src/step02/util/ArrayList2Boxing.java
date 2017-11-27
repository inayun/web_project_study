/* �н�����
 *  1. �⺻Ÿ���� ����� Ŭ������ Ȱ��
 *  	-�⺻ 8���� Ÿ�԰� 1:1 ���εǴ� Ŭ������ ����
 *  	- java.lang
 *  	- wrapper class��
 *	2. jdk 1. 5 ���� �߰��� wrapper class �鸸�� ����
 * 		1. ���
 * 			- autoboxing
 * 			- unboxing
 * 		2. ��ü Ÿ�԰� �⺻ Ÿ���� ���� �ڵ� ȣȯ �Ұ�, �ٸ� Ÿ��
 * 
 */


package step02.util;

import java.util.ArrayList;

public class ArrayList2Boxing {

	public static void main(String[] args) {
		//autoboxing
		Integer i = 3; //  Integer i = new Integer(3);
		System.out.println(i.intValue());
		
		//unboxing
		int i2 = new Integer(7); // int i2 =(new Integer(7)).intValue();
		System.out.println(i2);
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(3);  //list.add(new Integer(3));
		list.add(5.6); //list.add(new Double(5.6));
		
	}

}
