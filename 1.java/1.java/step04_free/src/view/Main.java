/* ���ξ�
 * 
 */
package view;

import domain.*;

public class Main {
	// ��� ���� ����
	// [1] �л� Ÿ�� �迭 ����
	static Student s_all[] = { new Student("ȫ�浿", 25, "��ǻ�Ͱ���", 1111, 3.2, "�ڹ��� ����"),
			new Student("������", 21, "����а�", 2222, 4.5, "���� ����"),
			new Student("�̸���", 28, "�����а�", 3333, 4.1, "�����ͺ��̽��� ����") };
	// [2] ���� Ÿ�� �迭 ����
	static Professor p_all[] = { new Professor("�豳��", 40, "��ǻ�Ͱ���", 10, "�ڹ��� ����"),
			new Professor("�̱���", 50, "��ȭ�η���", 14, "���� ����"), 
			new Professor("�鱳��", 48, "����а�", 14, "R�� ����") };

	// �л� �Ǵ� ������ ���� ����ϱ�
	static void view(Person[] all) {
		System.out.println("-------------------����------------------");
		for (Person v : all) {
			System.out.println(v.toString());
		}
		System.out.println("\n");
	}

	// �л��� ���� Ÿ�� �� (instanceof)
	static void classEquals(Object o) {
		System.out.println("----------------�л�/���� Ÿ�� ��-----------------");
		if (o instanceof Student) {
			String name = ((Student) o).getName();
			System.out.println("'" + name + "'" + " �� �л��Դϴ�" + "\n");
		} else {
			String name = ((Professor) o).getName();
			System.out.println("'" + name + "'" + " �� �����Դϴ�" + "\n");
		}
	}
	// �л��� ������ ��ġ�ϴ� ���� ���� �� (equals)
	static void lecture(Object o) {
		System.out.println("--------------�л��� ������ ��ġ�ϴ� ���� ����-------------");
		for (int i = 0; i < 3; i++) {
			if (p_all[i].getTeach().equals(((Student) o).getTake())) {
				System.out.println(((Student) o).getName() + " �л��� " + p_all[i].getName() + "�� " + "'"
						+ p_all[i].getTeach() + "'" + " ������ �����ϰ� �ֽ��ϴ�." + "\n");
			}
		}
	}

	public static void main(String[] args) {

		view(s_all);
		view(p_all);

		Student s1 = new Student("David", 25, "��ǻ�Ͱ���", 1111, 3.2, "�ڹ��� ����");
		Professor p1 = new Professor("Pro.Hong", 40, "��ǻ�Ͱ���", 10, "�ڹ��� ����");
		classEquals(s1);
		classEquals(p1);

		lecture(s_all[0]);
		lecture(s_all[1]);
		lecture(s_all[2]);

	}

}