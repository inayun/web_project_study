/* �ֿ� API
 * 1. String
 * 	- ""������ �ڵ� ��ü
 * - ���� �Һ�
 * - �ǽð� �������� ���ڿ� ǥ���� ������
 * 	(�ذ�å : java.lang.StringBuffer & java.lang.Bulider)
 * - jdk 1.5 ���� ���ڿ� ���� ���� �ӵ��� ����
 * - jdk 1.6 ���ʹ� ���ڿ� ���� ������ �ӵ� ����
 * 2. ������ ����
 * 	1. text - ����ȭ ���� ó��
 * 	2. CSV - �Ϲ� ��ǥ�� �������� ������ ����
 * 	3. JSON (java script object notation)
 * 	- key �� value �� ���ε� ������ ����
 * 	- �����/������ ���� ��� �󵵰� ����
 * 4. xml
 * 5. properties
 * 	- key�� value��  = �����ڷ� ���� ����
 * 	- ����, ���ڸ� ������ ��� ���� �����ڵ�� ǥ���ؾ���
 * 		(��Ŭ���� ���� �ڵ� ��ȯ ��� ����)
 * 	- jdk/bin/�����ڵ�� ��ȯ���ִ� ���α׷��� ����
 * 
 */
package step03.api;

import java.util.ArrayList;

public class ApiTest1 {
	
	static String m1(){
		return "���,����,�±�";
	}
	
	public static void main(String[] args) {
		String[] all = m1().split(",");
		System.out.println(all[2]);
		
		
	}

}
