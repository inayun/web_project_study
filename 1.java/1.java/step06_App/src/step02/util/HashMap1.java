package step02.util;

import java.util.HashMap;
import model.domain.Person;

public class HashMap1 {

	static void m1() {
		//hashmap �⺻�Ķ���ʹ� <object, object> ��
		HashMap m = new HashMap();
		m.put("key1", "�����");
		m.put("key2", "25");

		System.out.println(m.get("key1"));
	}

	/*
	 * hashmap�� �� �ֺ� ���� 3���� ����ň id (�̸������� ����) person ��ü ���� �����ؼ� ������ key value ��
	 * id���� ���
	 * 
	 */

	static void m2() {
		HashMap<String, Person> m = new HashMap<String, Person>();
		m.put("1", new Person("�����", "25"));
		m.put("2", new Person("������", "29"));
		m.put("3", new Person("���±�", "30"));

		System.out.println(m.get("3").getId());
	}
	
	

	public static void main(String[] args) {
		m2();

	}

}
