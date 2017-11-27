package model;

public class Seat {
	private String kind;
	private int seatNum;
	private Person person;
	public Seat() {
		super();
	}
	public Seat(String kind, int seatNum, Person person) {
		super();
		this.kind = kind;
		this.seatNum = seatNum;
		this.person = person;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
	//	super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append("[ 클래스 : ");
		builder.append(kind);
		builder.append(", 좌석 번호 : ");
		builder.append(seatNum);
		builder.append("");
		return builder.toString()+person.toString();
		}
}
