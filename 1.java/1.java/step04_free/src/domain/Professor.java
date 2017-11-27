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

	@Override // ������
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[�̸� : ");
		builder.append(name);
		builder.append(", ���� : ");
		builder.append(age);
		builder.append(", ���� : ");
		builder.append(major);
		builder.append(", �����Ⱓ(��): ");
		builder.append(year);
		builder.append(", �������� : ");
		builder.append(teach);
		builder.append("]");
		return builder.toString();
	}

}
