package step02.util;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	//HashSet �� ����� ������ ������ Iterator api ����ؼ� �ϳ��� �� line���� ����ϱ�
	
	
	static void m1(HashSet<Object> set){
		Iterator<Object> all = set.iterator();
		while(all.hasNext()){ //all �� �����͸� �����ִ�
			System.out.println(all.next());
		}
	}

	static void m2(){
		HashSet <String> set = new HashSet<>();
		set.add("e");
		set.add("aae");
		set.add("DFff");
		//���پ� ��� - ���ڿ� ���� ���(String class ���� length()
	
		Iterator<String> all = set.iterator();
		while(all.hasNext()){ //������ �����ϴ�?
			 //next�� �ι��Ἥ ������ ���ͷ����Ͱ� next �������� �����͸� �ű�⶧���� �ѹ������� �ٸ� ���� ������
			// �׷��� ������ ����
			String s = all.next(); //������ ��ȯ , �ѹ��̻� ������ ����
			System.out.println(s+ "-" +s.length()); 
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//�ߺ� ������ �ȵ�
		//���� �����͸� �ٲ����
		// get �� ����
		HashSet set = new HashSet();
		set.add(3); //set.add(new Integer(3)); autoboxing
		set.add(5.6);
		set.add(3);
		set.add("ddd");
		set.add(5.6);
		System.out.println(set.toString()); 
		m2();
	}

}
