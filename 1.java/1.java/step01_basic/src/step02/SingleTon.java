/* �н�����
 *  1. ������ ���ҽ� �ڿ� ������ ���� ��ü�� ���� ���
 *  2. ������ ����ϴ� ����(����)
 *  	- ����ȭ�� ����ȭ�� ����
 *  	- Design Pattern
 *  3. ������ ��ü���� �ϳ��θ� ���� �� �� �ִ� �ڵ� ��� ����
 *  4. access modifier
 *  	public > protected > default(friendly) > private
 *  5. ���� ���
 *  	1. ��ü ����  ���� ���
 *  		- ������ ȣ�� ����
 *  
 */
package step02;


public class SingleTon {
	//�ܺ� ȣ�� �Ұ� ����
	private static SingleTon instance = new SingleTon();
	//�ܺο��� ȣ�� �Ұ� ������
	private SingleTon(){} //��ü ���� ����
	
	//�ܺο��� ȣ�� ������ �޼ҵ�
	//��, static���� ����� ������ ��ȯ
	//static  ������ ������ ȣ���ص� ����
	public static SingleTon getInstance(){
		return instance;
	}	
	
	// �پ��� biz ������ �����̶� ����
	public String getMsg(){
		return "biz ����";
	}
}
