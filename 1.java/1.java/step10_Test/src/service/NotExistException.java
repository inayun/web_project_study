package service;

public class NotExistException extends Exception{

	public NotExistException() {
		super();
	}
	
	public NotExistException(String name , String phone) {
		super();
		System.out.println(name+"�� "+phone+"��ȣ�� ���� �����ڰ� �������� �ʽ��ϴ�.");
	}
	
}
