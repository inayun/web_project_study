package service;

import java.util.HashMap;

import model.EconomyClass;
import model.FirstClass;
import model.Person;
import model.PrintSeat;
import model.Seat;

public class ReservationService {
	private static ReservationService instance = new ReservationService();

	HashMap<String, Seat[]> allClassList = new HashMap<String, Seat[]>();
	Seat[] firstClassList = new FirstClass[10];
	Seat[] economyClassList = new EconomyClass[10];
	PrintSeat printSeat = new PrintSeat();

	private ReservationService() {
		allClassList.put("FirstClass", firstClassList);
		allClassList.put("EconomyClass", economyClassList);
	}

	public static ReservationService getInstance() {
		return instance;
	}

	public HashMap<String, Seat[]> getAllClassList() {
		return allClassList;
	}

	public Seat[] getFirstClassList() {
		return firstClassList;
	}

	public Seat[] getEconomyClassList() {
		return economyClassList;
	}

	public PrintSeat getPrintSeat() {
		return printSeat;
	}

	// �ڸ� ����
	public void createReservation(String kind, int seatNum, Person person, String service) {
		if (kind.equals("FirstClass")) {
			allClassList.get(kind)[seatNum] = new FirstClass(kind, seatNum, person, service);
			printSeat.setPrintSeat(kind, seatNum);
		} else if (kind.equals("EconomyClass")) {
			allClassList.get(kind)[seatNum] = new EconomyClass(kind, seatNum, person, service);
			printSeat.setPrintSeat(kind, seatNum);
		}

	}

	// �̸��ϰ� �ڵ��� ��ȣ�� �¼� ã��
	public Seat readReservation(String name, String phone) throws NotExistException {
		Seat mySeat = null;
		FirstClass firstClass = null;
		EconomyClass economyClass = null;

		for (int i = 0; i < 10; i++) {
			// FirstClass ���� ã�ƺ���
			if (allClassList.get("FirstClass")[i] != null) {
				firstClass = (FirstClass) allClassList.get("FirstClass")[i];

				if ((firstClass.getPerson().getName().equals(name))
						&& (firstClass.getPerson().getPhone().equals(phone))) {
					mySeat = (FirstClass) allClassList.get("FirstClass")[i];
					return mySeat;
				}

			// EconomyClass ���� ã�ƺ���
			} else if (allClassList.get("EconomyClass")[i] != null) {
				economyClass = (EconomyClass) allClassList.get("EconomyClass")[i];

				if ((economyClass.getPerson().getName().equals(name))
						&& (economyClass.getPerson().getPhone().equals(phone))) {
					mySeat = (EconomyClass) allClassList.get("EconomyClass")[i];
					return mySeat;
				}
			}
		}
		throw new NotExistException();
	}

	// �̸��ϰ� �ڵ��� ��ȣ�� ���� ���
	public void deleteReservation(String name, String phone) throws NotExistException {
		Seat newSeat = readReservation(name, phone);
		int seatNum = newSeat.getSeatNum();
		if (newSeat.getKind().equals("FirstClass")) {
			allClassList.get("FirstClass")[seatNum] = null;
			printSeat.deletePrintSeat("FirstClass", seatNum);
		} else if (newSeat.getKind().equals("EconomyClass")) {
			allClassList.get("EconomyClass")[seatNum] = null;
			printSeat.deletePrintSeat("EconomyClass", seatNum);
		}
	}

	// �̸��� �ڵ�����ȣ���� �������� ã�Ƽ� �¼�����(���� kind�������� �¼� �ڸ� ���� ����)
	/*
	 * ������ ���� �̹� �����ϴ� �¼��̶�� ���� ó�� �߰� ( ���ο� ����ó�� Class����� + ���� ) ���� Ŭ���� �̸���
	 * AlreadyExistException ���� ����
	 */
	public void updateReservation(String name, String phone, int seatNum) throws Exception {
		Seat newSeat = readReservation(name, phone);
		// FirstClass �� ���
		if (newSeat.getKind().equals("FirstClass")) {
			// ������Ʈ�� ���ϴ� �ڸ��� �̹� �����ϴ� �ϴ� ��� ����ó��
			if (printSeat.specificPrintSeat("FirstClass", seatNum).equals("��")) {
				throw new AlreadyExistException(seatNum);
			} else {
				printSeat.deletePrintSeat("FirstClass", newSeat.getSeatNum());
				printSeat.setPrintSeat("FirstClass", seatNum);
				newSeat.setSeatNum(seatNum);
			}

		// EconomyClass �� ���
		} else if (newSeat.getKind().equals("EconomyClass")) {
			// ������Ʈ�� ���ϴ� �ڸ��� �̹� �����ϴ� �ϴ� ��� ����ó��
			if (printSeat.specificPrintSeat(newSeat.getKind(), seatNum).equals("��")) {
				throw new AlreadyExistException(seatNum);
			} else {
				printSeat.deletePrintSeat("EconomyClass", newSeat.getSeatNum());
				printSeat.setPrintSeat("EconomyClass", seatNum);
				newSeat.setSeatNum(seatNum);
			}
		}
		// �¼� ���� ���
		System.out.println(newSeat);
	}

	// �¼� �˻��� �¼������� ���� ���
	public void seatRead(Seat mySeat) {
		System.out.println(mySeat.toString());
	}
}