/* ����
 * - info.properties ���Ϸκ��� key�� ������ read �ؼ� �� �����͵� ȭ�鿡 ���
 * ���ߴܰ�
 * 1: properties �ڹ� �ҽ��� read
 * 2: 
 * 3: , �����ڷ� ������ ����
 * 4: ���ص� �������� index�� �°� ������ ���
 * 
 * properties ���� read
 * 	- properties ��ü ����
 * 	- load(), 2byte ������ read ������ ��ü ���� (fileReader)
 * properties ���Ϸκ��� key�� ���� read
 * 	- stringPropertyNames() set ��ü�� ��ȯ
 * 	- �ϳ��ϳ��� ������ �ʿ� ���� Iterator ��ü ����
 * read �� key�� value�� �� read
 * 	- properties ��ü�κ��� getProperty(String key) ��  String ������ ��ȯ
 * value �����ؼ� �迭�� ����
 * - �����ڷ� ������ �����ؼ� ����
 * �迭�� ����� �����͸� ȭ�鿡 ���
 * - �ټ��� ������ ���� �ݺ�
 */
package step03.api;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class apiTest2Properties {

	public static void main(String[] args) {
		try {
			// properties ���Ϸκ��� ������ Ȱ�� ������ ��ü
			Properties info = new Properties();
			// load = infro.properties ������ Properties ��ü�� ��밡���ϰ� �νĽ�Ű�� �޼ҵ�
			info.load(new FileReader("info.properties"));

			// properties ���Ͽ��� �������� Ű������ stirng Ÿ���� set��!!! �׷��� �������� �־��ְ� ������
			// set<String>���� Ÿ�������ʼ�
			Set<String> keyData = info.stringPropertyNames();
			Iterator<String> keyAll = keyData.iterator();

			// ���� �� ���� ���ٷ� ��ģ��
			// Iterator<String> keyAll = info.stringPropertyNames().iterator();

			String key = "";
			String value = "";
			String[] names = null;
			String[] ages = null;

			while (keyAll.hasNext()) {

				key = keyAll.next();
				value = info.getProperty(key); // string���� �� ������ �� ������ "f,d,d,d"

				if (key.equals("key1")) {
					names = value.split(",");
				} else {
					ages = value.split(",");
				}
			}
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i] + "-" + ages[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
