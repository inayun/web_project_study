package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest2 {
	// Ű����κ��� read�ϴ� ��ü
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = null;
	// file �� 2byte�� ����ϴ� ��ü
	// �������� file - File~/2bye�� ��� ~ Writer = FileWriter : �ܼ� ���
	// buffer ������� ȿ�������� ��� : BufferedWriter

	try {
		out = new BufferedWriter(new FileWriter("kdata.txt", true));
		String data = null; //data ������  null�� �ʱ�ȭ
		while ((data = in.readLine()) != null) { //�Է���  ���� �ɶ����� �ݺ����� ��������...
			out.write(data); //������ ��¸�
			out.newLine(); //���� �ݿ�
			out.flush(); //���� �޸� Ȥ�� ���� �����Ͱ� �����ұ� �ϴ� ����� �ؼ� �޼ҵ�
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally {
		try { //�ڿ���ȯ �ٷιٷ� , ������ �սǵ� �� �ֱ� ������
		if(in != null){
			in.close();
			in = null;
		}
		if(out != null){
			out.close();
			out = null;
		}
	} catch(Exception e){
		e.printStackTrace();
	}
}
	}
}
