/*
 * 
 * 1. ����
 * - ����ƽ ����
 * - ��ü �������� ��� ����
 * - class�� . ����
 * 2. �޼ҵ� 
 * - static �޼ҵ�
 * - ��ü �������� ��� ����
 * - class�� . �޼ҵ�([..])
 * 3. static
 * - ��� user �����ϴ� �ڿ����� �� �ѹ� �ʱ�ȭ Ȱ�� ���Ǵ� ���
 * -���� ����
 * 	: byte code �� �޸𸮿� ����ɶ� �ػ� static{} byte coder ��ġ���� �ٷ� ����
 */

package step02;

public class Static1 {
	int no1; //instance ����
	static int no2; //static ����
	
	Static1(){ //������ constructor
		no1++; //1�� ����
		no2++;
	}
	
	int getNo1(){ //��ü �����Ŀ��� ȣ�Ⱑ���� �޼ҵ�
		return no1; //��ü �����ÿ� �����Ǵ� ����
	}
	
	int getNo2(){ //��ü �����Ŀ��� ȣ�� ������ �޼ҵ�
		return no2; //��ü ������ �����Ǵ� ����
	}
	//��ä ���� �� ȣ�� ������ �޼ҵ�
	/*static void setNo1(int n){  //������ �������µ� �ٵ� ������
		no1 = n; //��ü ������ �����Ǵ� ����  --> ������
	} */
	
	static void setNo2 (int n){
		no2 = n; //��ü ������ �����Ǵ� ����
	}
	
	static { //���κ��� ���� �����
		System.out.println(1);
	}
	public static void main(String[] args) {
		System.out.println(no2);
		
		Static1 s1 = new Static1();
		System.out.println(s1.no1+ " " + no2);
		
		Static1 s2 = new Static1();
		System.out.println(s2.no1+ " " + no2); //no2�� ����ƽ ������ �����ǰ� �ֱ� ������ �����Ǽ� ������
		
		int v = Integer.parseInt("3");
		System.out.println(v);
		
		byte b = Byte.parseByte("3");
		
		//���ڿ� �������� ȣȯ ���� A = 65, c = 97
				
		String v2 = "ABC";
		
		int v3 = v2.charAt(0); //0��° �ε����� ���ڷ���
		System.out.println(v3);
		
		
	}

	static {
		System.out.println(2);
	}
}
