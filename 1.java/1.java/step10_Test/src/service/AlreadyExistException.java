package service;

public class AlreadyExistException extends Exception {

	public AlreadyExistException() {
		super();
	}

	public AlreadyExistException(int no) {
		super();
		System.out.println("지정하신" + no + "번의 자리는 이용하실 수가 없습니다.");

	}

}
