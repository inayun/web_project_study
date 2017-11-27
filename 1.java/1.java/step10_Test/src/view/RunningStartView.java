package view;

import model.Person;
import service.NotExistException;
import service.ReservationService;

public class RunningStartView {
	
	public static void main(String[] args) {
		ReservationService instance = ReservationService.getInstance();
		instance.getPrintSeat().printAll();
	
		Person p1 = new Person("장기혁", "27", "010");
		Person p2 = new Person("금동민", "24", "011");
		Person p3 = new Person("최윤진", "29", "018");
		Person p4 = new Person("심세린", "24", "016");
		
		//좌석 예약
		System.out.println("==========좌석 예약===========");
		instance.createReservation("FirstClass", 2, p1, "스테이크");
		instance.createReservation("EconomyClass", 5, p2, "기내식");
		instance.createReservation("FirstClass", 3, p3, "스테이크");
		instance.createReservation("EconomyClass", 4, p4, "기내식");
		instance.getPrintSeat().printAll();
		
		//좌석 검색 (이름과 핸드폰 번호 통해서)
		try {
			
			System.out.println("==========좌석 검색===========");
			instance.seatRead(instance.readReservation("장기혁", "010"));
			instance.seatRead(instance.readReservation("최윤진", "018"));
//			instance.seatRead(instance.readReservation("전진우", "031"));
					
			//좌석 업데이트
			System.out.println("==========좌석 업데이트===========");
			instance.updateReservation("장기혁", "010", 7);
			instance.updateReservation("금동민", "011", 1);
//			instance.updateReservation("전진우", "031", 8);
			instance.getPrintSeat().printAll();
			
			//좌석 삭제
			System.out.println("==========좌석 삭제===========");
			instance.deleteReservation("장기혁", "010");
			instance.deleteReservation("심세린", "016");
//			instance.deleteReservation("전진우", "031");
			instance.getPrintSeat().printAll();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
