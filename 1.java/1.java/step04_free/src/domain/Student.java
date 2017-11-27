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

	@Override // 재정의
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[이름 : ");
		builder.append(name);
		builder.append(", 나이 : ");
		builder.append(age);
		builder.append(", 전공 : ");
		builder.append(major);
		builder.append(", 학번 : ");
		builder.append(id);
		builder.append(", 학점 : ");
		builder.append(grade);
		builder.append(", 수강과목 : ");
		builder.append(take);
		builder.append("]");
		return builder.toString();
	}
}
