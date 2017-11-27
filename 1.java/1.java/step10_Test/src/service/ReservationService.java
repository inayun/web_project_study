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

	// 자리 예약
	public void createReservation(String kind, int seatNum, Person person, String service) {
		if (kind.equals("FirstClass")) {
			allClassList.get(kind)[seatNum] = new FirstClass(kind, seatNum, person, service);
			printSeat.setPrintSeat(kind, seatNum);
		} else if (kind.equals("EconomyClass")) {
			allClassList.get(kind)[seatNum] = new EconomyClass(kind, seatNum, person, service);
			printSeat.setPrintSeat(kind, seatNum);
		}

	}

	// 이름하고 핸드폰 번호로 좌석 찾기
	public Seat readReservation(String name, String phone) throws NotExistException {
		Seat mySeat = null;
		FirstClass firstClass = null;
		EconomyClass economyClass = null;

		for (int i = 0; i < 10; i++) {
			// FirstClass 에서 찾아보기
			if (allClassList.get("FirstClass")[i] != null) {
				firstClass = (FirstClass) allClassList.get("FirstClass")[i];

				if ((firstClass.getPerson().getName().equals(name))
						&& (firstClass.getPerson().getPhone().equals(phone))) {
					mySeat = (FirstClass) allClassList.get("FirstClass")[i];
					return mySeat;
				}

			// EconomyClass 에서 찾아보기
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

	// 이름하고 핸드폰 번호로 예약 취소
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

	// 이름과 핸드폰번호통해 예약정보 찾아서 좌석변경(같은 kind내에서만 좌석 자리 변경 가능)
	/*
	 * 최윤진 만약 이미 존재하는 좌석이라면 예외 처리 추가 ( 새로운 예외처리 Class만들기 + 적용 ) 예외 클래스 이름은
	 * AlreadyExistException 으로 고정
	 */
	public void updateReservation(String name, String phone, int seatNum) throws Exception {
		Seat newSeat = readReservation(name, phone);
		// FirstClass 인 경우
		if (newSeat.getKind().equals("FirstClass")) {
			// 업데이트를 원하는 자리가 이미 존재하는 하는 경우 예외처리
			if (printSeat.specificPrintSeat("FirstClass", seatNum).equals("●")) {
				throw new AlreadyExistException(seatNum);
			} else {
				printSeat.deletePrintSeat("FirstClass", newSeat.getSeatNum());
				printSeat.setPrintSeat("FirstClass", seatNum);
				newSeat.setSeatNum(seatNum);
			}

		// EconomyClass 인 경우
		} else if (newSeat.getKind().equals("EconomyClass")) {
			// 업데이트를 원하는 자리가 이미 존재하는 하는 경우 예외처리
			if (printSeat.specificPrintSeat(newSeat.getKind(), seatNum).equals("●")) {
				throw new AlreadyExistException(seatNum);
			} else {
				printSeat.deletePrintSeat("EconomyClass", newSeat.getSeatNum());
				printSeat.setPrintSeat("EconomyClass", seatNum);
				newSeat.setSeatNum(seatNum);
			}
		}
		// 좌석 정보 출력
		System.out.println(newSeat);
	}

	// 좌석 검색시 좌석에대한 정보 출력
	public void seatRead(Seat mySeat) {
		System.out.println(mySeat.toString());
	}
}