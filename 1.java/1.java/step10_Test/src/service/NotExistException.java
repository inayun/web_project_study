package service;

public class NotExistException extends Exception{

	public NotExistException() {
		super();
	}
	
	public NotExistException(String name , String phone) {
		super();
		System.out.println(name+"과 "+phone+"번호를 가진 예약자가 존재하지 않습니다.");
	}
	
}
