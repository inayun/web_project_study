/* �н� ����
 * 1. java.util.package
 * 2. �迭�� ���, �� ���� �޸�, ��ü�� ���� �� Ȱ�� ������ Ÿ��
 * 3. jdk 1.5 ���� �߰��� ����
 * 4. jdk 1.7 ���� �߰��� ����
 * 5. jdk 1.5 API���� ǥ����  ǥ����
 */

package step02.util;

import java.util.ArrayList;

public class ArrayList1 {
	static void m1(){
		// 11��° ������ ����� 10���� �޸� �ڵ� �߰�����
		// 21��° ������ 
		ArrayList a = new ArrayList(); //10�� ���� ���� 
		a.add("string"); // index 0��° ����
		a.add(new Integer(3)); //1��°
		a.add("test"); //2��° ����
		
		System.out.println(a.get(0));
		System.out.println("���� ������ ����" +  a.size());
		
		a.remove(0);
		System.out.println(a.get(0)); //0��°�� ������°� �ƴϰ� �ڿ������� ä����
		System.out.println("���� ������ ����" +  a.size());
		
		/*String v = (String)a.get(0); //����� object Ÿ������ ��ȯ ���� ����ȯ �ʼ�
		System.out.println(v);
		*/

	}
	//jdk 1.5 ���� �߰��� ����
	//���� �� �����ϴ� ������ Ÿ�� ���� - ���׸�
	//����ȯ ���� ��ȯ ����
	static void m2(){
		ArrayList<String>a = new ArrayList<String>(); //���� String[] ���·� ��ȯ
		a.add("s");
		// a.add(new Integer(5))); ����
		String v = (String)a.get(0); //����� object Ÿ������ ��ȯ ���� ����ȯ �ʼ�
		System.out.println(v);

	}
	//jdk 1.7���� ����
	static void m3(){
		ArrayList<String>a = new ArrayList<>(); //���� String[] ���·� ��ȯ
		a.add("s");
		String v = (String)a.get(0); //����� object Ÿ������ ��ȯ ���� ����ȯ �ʼ�
		System.out.println(v);
		
		// a.add(new Integer(5))); ����

	}
	//�Źݺ��� for(:)
	static void m4(){
		ArrayList a = new ArrayList();
		a.add("a"); //0 ObjectŸ������ ����
		a.add(new Integer(3));
		a.add(new Byte("3"));
		
		for(Object list : a){ //���׸� �Ⱦ���쿡�� object Ÿ������ �ޱ� ������ �� object�� �ؾ���
			System.out.println(list + "\t");
		}
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("dffd");
		s.add("dfsfff");
		
		for (String list : s){
			System.out.println(list + "\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m2();
		m3();
		m4();
	}

}
