package service;

public class AlreadyExistException extends Exception {

	public AlreadyExistException() {
		super();
	}

	public AlreadyExistException(int no) {
		super();
		System.out.println("�����Ͻ�" + no + "���� �ڸ��� �̿��Ͻ� ���� �����ϴ�.");

	}

}
