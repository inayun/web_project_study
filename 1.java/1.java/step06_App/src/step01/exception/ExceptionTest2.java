package step01.exception;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		
		//step 02
		String s = null;
		if(s != null) {
			System.out.println("String ����");
		
		} else {
			//��������� ���� �߻�
			System.out.println("null�Դϴ�.");
			
			throw new Exception("null�̶���"); //throw �Ⱥ��̸� ������ �ϰ� ������
			
			/*
			try {
				throw new NullPointerException ("null�̶���");
			} catch (Exception e) {
				e.printStackTrace();
			} //�����ؼ� ó���϶� ��� , ó���ؾ� �����ִ� ���
	
		*/ 
	}
	}
	
}
