package model;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintSeat {
	private HashMap<String, ArrayList<String>> printSeat = new HashMap<String, ArrayList<String>>();
	ArrayList<String> firstClassPrint = new ArrayList<String>();
	ArrayList<String> economyClassPrint = new ArrayList<String>();

	// �����ڿ��� �¼���ǥ ����
	public PrintSeat() {
		super();
		for (int i = 0; i < 10; i++) {
			firstClassPrint.add("O");
			economyClassPrint.add("O");
		}
		printSeat.put("FirstClass", firstClassPrint);
		printSeat.put("EconomyClass", economyClassPrint);

	}

	public HashMap<String, ArrayList<String>> getPrintSeat() {
		return printSeat;
	}

	// �¼� ������� ���
	public void setPrintSeat(String kind, int seatNum) {
		printSeat.get(kind).set(seatNum, "��");
	}

	// �¼� ���� �������� ���
	public void deletePrintSeat(String kind, int seatNum) {
		printSeat.get(kind).set(seatNum, "O");
	}

	// Ư�� ��ȣ �¼� ���� ������
	public String specificPrintSeat(String kind, int seatNum) {
		return printSeat.get(kind).get(seatNum);
	}

	public void printAll() {
		System.out.print("FirstClass : ");
		System.out.println(firstClassPrint);
		System.out.print("EconomytClass : ");
		System.out.println(economyClassPrint);
	}
}
