package domain;

public class Student extends Person {
	public int id;
	public double grade;
	public String take;

	public Student() {
		super();
	}

	public Student(String name, int age, String major, int id, double grade, String take) {
		super(name, age, major);
		this.id = id;
		this.grade = grade;
		this.take = take;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getTake() {
		return take;
	}

	public void setTake(String take) {
		this.take = take;
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
		builder.append(", �й� : ");
		builder.append(id);
		builder.append(", ���� : ");
		builder.append(grade);
		builder.append(", �������� : ");
		builder.append(take);
		builder.append("]");
		return builder.toString();
	}
}
