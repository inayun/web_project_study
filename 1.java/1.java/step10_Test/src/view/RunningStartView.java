package view;

import model.Person;
import service.NotExistException;
import service.ReservationService;

public class RunningStartView {
	
	public static void main(String[] args) {
		ReservationService instance = ReservationService.getInstance();
		instance.getPrintSeat().printAll();
	
		Person p1 = new Person("�����", "27", "010");
		Person p2 = new Person("�ݵ���", "24", "011");
		Person p3 = new Person("������", "29", "018");
		Person p4 = new Person("�ɼ���", "24", "016");
		
		//�¼� ����
		System.out.println("==========�¼� ����===========");
		instance.createReservation("FirstClass", 2, p1, "������ũ");
		instance.createReservation("EconomyClass", 5, p2, "�⳻��");
		instance.createReservation("FirstClass", 3, p3, "������ũ");
		instance.createReservation("EconomyClass", 4, p4, "�⳻��");
		instance.getPrintSeat().printAll();
		
		//�¼� �˻� (�̸��� �ڵ��� ��ȣ ���ؼ�)
		try {
			
			System.out.println("==========�¼� �˻�===========");
			instance.seatRead(instance.readReservation("�����", "010"));
			instance.seatRead(instance.readReservation("������", "018"));
//			instance.seatRead(instance.readReservation("������", "031"));
					
			//�¼� ������Ʈ
			System.out.println("==========�¼� ������Ʈ===========");
			instance.updateReservation("�����", "010", 7);
			instance.updateReservation("�ݵ���", "011", 1);
//			instance.updateReservation("������", "031", 8);
			instance.getPrintSeat().printAll();
			
			//�¼� ����
			System.out.println("==========�¼� ����===========");
			instance.deleteReservation("�����", "010");
			instance.deleteReservation("�ɼ���", "016");
//			instance.deleteReservation("������", "031");
			instance.getPrintSeat().printAll();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
