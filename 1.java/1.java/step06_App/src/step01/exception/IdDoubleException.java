/* '����� ����' ���� Ŭ���� ���� ���
 * 1. Exception ��� �޴´�
 * 2. '������' �ΰ� ���� �Ѵ�
 * 	1.() : �⺻ ������
 * 	2.(String msg) : ���ڿ�  
 * �ϳ�¥���� ������
 */
package step01.exception;

public class IdDoubleException extends Exception {
	public IdDoubleException(){};
	public IdDoubleException(String msg){
		super(msg);
	};
	
}
