/* customer.properties ����  read�ؼ�  �ش� ������
 * �� ����ŭ customer ��ü �����ϰ�
 * ������ ��ü�� �����͵��� �ܼ�â�� ����غ���
 * 
 * �䱸���� ����  -> �м�, ����� Ȯ�强 ����� ����
 * -> ���� ���� -> 
 * step 02 : �̸����� �˻�
 * 
 */
package step03.api;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import model.domain.Customer;

public class ApiTest3 {

	static String name;
	static int age;
	static String value;
	static String[] valueData;
	static ArrayList<Customer> all = new ArrayList<Customer>();

	static void search(String name) throws NotFoundException {

		for (Customer c : all) {
			if (c.getName().equals(name)) {
				System.out.println(c);
			}
		}
		throw new NotFoundException("�˻��� ����� �����ϴ�.");
	}

	public static void main(String[] args) {

		Properties info = new Properties();
		try {
			info.load(new FileReader("customer.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ���� �о����
		Iterator<String> keyAll = info.stringPropertyNames().iterator(); // Ű��
																			// �޾ƿ���
		while (keyAll.hasNext()) {
			value = info.getProperty(keyAll.next()); // Ű���� ��簪 �޾ƿ���
			valueData = value.split(","); // ��簪�� �����ؼ� �迭�� ���
			name = valueData[0];
			age = Integer.parseInt(valueData[1]); // string�� int�� ��ȯ
			all.add(new Customer(name, age));

		}
		// customer list ���� �̱�
		for (Customer c : all) {
			System.out.println(c + "\t");
		}

		try {
			search("ȫ�浿");
			search("�ѻ���");
		} catch (NotFoundException e) {
			e.printStackTrace();
		}

	}

}
