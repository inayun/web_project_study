package step02;

public class StaticTest {
	int no = 10; //��ü �����Ŀ��� ��� ������ ����
	static int no2 = 20; //static ��ü ����  ��� �����ϰ� �ƹ�����  ��� ���� . byte code�� �ε��Ǹ鼭 ��ü ����
	
	int getNo(){
		return no; 
	}
	static int getNo2() {
		return no2;
	}
	
	public static void main(String[] args) {
		StaticTest s = new StaticTest(); //��ü ����
		System.out.println(s.getNo()); //10
		System.out.println(StaticTest.getNo2()); //20 ����ƽ���� ������ �����͵��� ��ü ���� ���̵� ��� ����!!!���� Ŭ�������� ���������� ��밡��
	}

}
 