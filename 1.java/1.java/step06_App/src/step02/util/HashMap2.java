package step02.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMap2 {

	//�� �޼ҵ�� �ٸ� �����ڰ� �����ؼ� ȣ�� ���Ѹ� �ο��� �޼ҵ� ����
	//key���� �𸣴� ���·� ������ �� Ȱ��
	
	static HashMap<String, String> getDatas(){
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("k1", "�����");
		m.put("k2", "������");
		m.put("k3", "���±�");
		m.put("k4", "ȫ�浿");
		m.put("k5", "������");
	
		
		return m;
	}
	
	
	//��Ʈ : key �� �ߺ� ���� Ÿ���� set Ÿ��
	// set Ÿ���� iterateor  api�� �ϳ��� ������ ����� ����
	public static void main(String[] args) {
		 HashMap<String, String> datas = getDatas();
		 Set<String> set = datas.keySet();
		 
		 Iterator<String> keyAll = set.iterator();
		 while(keyAll.hasNext()){
			 String data = keyAll.next();
			 System.out.println(data+"-"+datas.get(data));
		 }
		 
		//��� ���� : key �� = value ��
	}

}
