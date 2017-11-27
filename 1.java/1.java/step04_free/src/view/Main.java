/* 윤인아
 * 
 */
package view;

import domain.*;

public class Main {
	// 멤버 변수 선언
	// [1] 학생 타입 배열 선언
	static Student s_all[] = { new Student("홍길동", 25, "컴퓨터공학", 1111, 3.2, "자바의 이해"),
			new Student("성춘향", 21, "통계학과", 2222, 4.5, "삶의 이해"),
			new Student("이몽룡", 28, "영문학과", 3333, 4.1, "데이터베이스의 이해") };
	// [2] 교수 타입 배열 선언
	static Professor p_all[] = { new Professor("김교수", 40, "컴퓨터공학", 10, "자바의 이해"),
			new Professor("이교수", 50, "문화인류학", 14, "삶의 이해"), 
			new Professor("백교수", 48, "통계학과", 14, "R의 이해") };

	// 학생 또는 교수의 정보 출력하기
	static void view(Person[] all) {
		System.out.println("-------------------정보------------------");
		for (Person v : all) {
			System.out.println(v.toString());
		}
		System.out.println("\n");
	}

	// 학생과 교수 타입 비교 (instanceof)
	static void classEquals(Object o) {
		System.out.println("----------------학생/교수 타입 비교-----------------");
		if (o instanceof Student) {
			String name = ((Student) o).getName();
			System.out.println("'" + name + "'" + " 은 학생입니다" + "\n");
		} else {
			String name = ((Professor) o).getName();
			System.out.println("'" + name + "'" + " 은 교수입니다" + "\n");
		}
	}
	// 학생과 교수의 일치하는 수강 과목 비교 (equals)
	static void lecture(Object o) {
		System.out.println("--------------학생과 교수의 일치하는 수강 과목-------------");
		for (int i = 0; i < 3; i++) {
			if (p_all[i].getTeach().equals(((Student) o).getTake())) {
				System.out.println(((Student) o).getName() + " 학생은 " + p_all[i].getName() + "의 " + "'"
						+ p_all[i].getTeach() + "'" + " 과목을 수강하고 있습니다." + "\n");
			}
		}
	}

	public static void main(String[] args) {

		view(s_all);
		view(p_all);

		Student s1 = new Student("David", 25, "컴퓨터공학", 1111, 3.2, "자바의 이해");
		Professor p1 = new Professor("Pro.Hong", 40, "컴퓨터공학", 10, "자바의 이해");
		classEquals(s1);
		classEquals(p1);

		lecture(s_all[0]);
		lecture(s_all[1]);
		lecture(s_all[2]);

	}

}