package step02;

public class ApiTest {
	 //static ���ڿ� ��ȯ
	static int i;
	static String getData(){
		return "���ڿ�";
	}
	
	public static void main(String[] args) {
		
		String data = getData();
		System.out.println(data);

		//�� ������ ���
		System.out.println(data.charAt(2));
		//���ڿ� ���� ���
		System.out.println(data.length());
		//������ ��ȯ
		
		System.out.println(data.charAt(0)); //��
		System.out.println((int)data.charAt(0)); //47928
		System.out.println(data.charAt(0)+ data.charAt(2)); //98604 +�� ������ �����ȣ�� ����Ǹ鼭 ���� ���� �ƽ�Ű �ѹ��� ������
		data = ""+data.charAt(0) + data.charAt(2); // ���ڿ��� �б� ���ؼ� �տ� ����ִ� "" ��ȣ�� �־������

		//data.charAt(0) + data.charAt(2)�� �� �� ���� �ƽ�Ű �ѹ��� ������ ��
	}

}
