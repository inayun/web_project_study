/* �н� ����
 * 1. �ǹ��� �ڵ�
 * 2. ����
 * 	1. ��ȿ�� ���� �� ��ȿ�� ��쿡 ���� �߻�
 * 	2. ���� �߻��� ���� �ִ� ��Ȳ�� �ڵ�
 * 		1. ó�� ��� 1 : try ~ catch
 * 		2. ó����� 2 : ȣ���� ������ ���� ó�� ���� throws(�ϳ��̻� ���� �� �ֵ��� �ǹ�)
 * 
 */
package step01.exception;

public class ExceptionTest3 {

	static void m1(){
		System.out.println(10/0);
	}
	
	//��
	static void m2(){
		try {
			Class.forName("step01.exception.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//���� ��� �߻��� ȣ���� ������ ���� ó�� ����
	static void m3()throws ClassNotFoundException{
		Class.forName("step01.exception.A");
		
	}
	
	//id ��ȿ�� ���� �޼ҵ�
	//��, master �� �ƴ� ��� exception ��ü �����ؼ� ������
	
	static void idCheck(String id) throws Exception{
		if ( !id.equals("master")){
			throw new Exception ("�� ������?");
		}
		System.out.println( "master �³׿� �ȳ��ϼ���");
		

	}
	
	//id �� �ߺ��� ��� ����� ���� ���ܸ�  �߻��ϴ� �޼ҵ�
	//�ߺ���  IdDoubleException �߻�
	static void idCheck2(String id) throws IdDoubleException {
		if( id.equals("master")){
			throw new IdDoubleException("id �ߺ� ����");
					}
		System.out.println("���� �Ϸ�");
	}
	
	
	public static void main(String[] args) {
		
		try {
			idCheck2("ma");
			System.out.println("-------------");
			idCheck2("master");
			} catch (IdDoubleException e) {
			e.printStackTrace();
		}
		
		
		try{	
		idCheck("ma"); 
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		m1();
		m2();
		
	}

}
