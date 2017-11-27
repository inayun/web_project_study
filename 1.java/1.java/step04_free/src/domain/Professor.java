package domain;

public class Professor extends Person {
	public int year;
	public String teach;

	public Professor() {
		super();
	}

	public Professor(String name, int age, String major, int year, String teach) {
		super(name, age, major);
		this.year = year;
		this.teach = teach;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTeach() {
		return teach;
	}

	public void setTeach(String teach) {
		this.teach = teach;
	}

	@Override // 재정의
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[이름 : ");
		builder.append(name);
		builder.append(", 나이 : ");
		builder.append(age);
		builder.append(", 전공 : ");
		builder.append(major);
		builder.append(", 교직기간(년): ");
		builder.append(year);
		builder.append(", 수강과목 : ");
		builder.append(teach);
		builder.append("]");
		return builder.toString();
	}

}
