package model;

public class EconomyClass extends Seat{
	private String extra;

	public EconomyClass() {
		super();
	}

	public EconomyClass(String kind, int seatNum, Person person, String extra) {
		
		super(kind, seatNum , person);
		this.extra = extra;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", 기타 등등 : ");
		builder.append(extra);
		builder.append("]");
		return super.toString()+builder.toString();
	}
}
