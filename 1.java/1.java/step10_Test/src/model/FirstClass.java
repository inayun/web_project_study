package model;

public class FirstClass extends Seat{
	private String specialService;

	public FirstClass() {
		super();
	}

	
	public FirstClass(String kind, int seatNum, Person person, String specialService) {
		super(kind, seatNum, person);
		this.specialService = specialService;
	}


	public String getSpecialService() {
		return specialService;
	}

	public void setSpecialService(String specialService) {
		this.specialService = specialService;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", Ư�� ���� : ");
		builder.append(specialService);
		builder.append("]");
		return super.toString()+builder.toString();
	}
}
