/* 1. �迭�н�
 * 2. Ư¡
 *  	1. ��� �迭�� ������ ��ü
 *  	2. �迭 ũ��� �Һ�
 *  		- ���� �޸𸮰� �ʿ��� ��� java.util List API �� ���
 *  	3. ������ length ��� �迭 ũ�Ⱚ ������ �Ӽ� �ڵ� ����
 * 3. JDK 1.5 �������� �߰��� �ݺ��� �߰� �н�
 * 
 * 
 */
package step02;
import model.domain.Person; //model.domain ��Ű���� ������ �ִ°��� ���� ���ٴ�

public class Array1 {
	//int Ÿ���� �⺻ Ÿ������ �迭 ���� �� �ݺ��� Ȱ���ؼ� ���
	//step 1.����, ���� , �ʱ�ȭ �и�
	//step 2.����, ����, �ʱ�ȭ �ѹ������� ó��
	static void m1(){
		//step 01
		int i [] = null; //����
		i = new int[3]; //����
		i[0] = 1; //�ʱ�ȭ
		i[1] = 2;
		i[2] = 3;
		
		//step 02
		int i2[] = {1, 2, 3};
		
		//���� �ݺ���
		for(int index=0; index < i2.length; index ++){
			System.out.print(i2[index] + "\t");
		}
		System.out.println();
		//jdk 1.5 �߰��� �ݺ���
		
		for(int v:i2){ //���� ������ �޴¾� : ������ ������ �����ϴ¾�
			System.out.print(v + "\t");
		}
	}	
	
	//Person ���� Ÿ���� �迭 ����, �ݺ��� ���
	static void m2(){
	
		Person[] all = {new Person("ȫ�浿","aaa"),new Person("�㼺��","bbb"),new Person("������","ccc")};
		// �Źں��� �̸�(geId()) ���
		for(Person p : all){
			System.out.print(p.getId() + "\t");
		}
	}
	
	public static void main(String[] args) {
		m1();
	}

}
