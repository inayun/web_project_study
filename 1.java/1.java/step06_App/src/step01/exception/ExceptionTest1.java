/* class �� forname()
 * - parameter �� ������ ������ class����  �޸𸮿� �ε�
 * - API ������ ����
 *  �߻� ������ ����� ��
 *  	1. Ȥ�� Ŭ������ ��Ÿ?
 *  	- ����ڿ��� ���� ��Ȳ ����
 *  	2. ���� Ŭ������
 *  	- byte code �ε� �Ϸ�
 *  
 *  * api ������ �������� ����ڰ� 
 *  1.�ټ��� ���� ����� ���� �Ǵ� �� ó���ϰ� �Ѵ�. (x)
 *  2. ���� ������ ����ؼ� ���ɽ����� �̿��� ó���ϰ� �Ѵ�
 *  	- �̰����  ������ �Ұ� ��Ȳ���� ����
 * 
 */


package step01.exception;

public class ExceptionTest1 {

	public static void main(String[] args) {	
		//step01 : ���� ok, ��, i[7] : ���� ���� �߻�
		//�ذ�å : i[7] -> i[
		int [] i = {1, 2} ;
		System.out.println(i[0]);
		//
		//step02 ;
		//�޼ҵ� ȣ�� ������ ���� ����
		//�� try~catch ���� ���̴� ������ ���� �߻�
		// �ذ�å : try~catch ��� ó��
		try {
			Class.forName("step01.exception.A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class A {
	static {
		System.out.println("A byte code �޸𸮿� �ε��� �ڵ� ����");
	}
}
