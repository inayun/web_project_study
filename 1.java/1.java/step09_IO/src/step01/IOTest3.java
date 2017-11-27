package step01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOTest3 {

		// Ű����κ��� read�ϴ� ��ü
		public static void main(String[] args) {		

		// file �� 2byte�� ����ϴ� ��ü
		// �������� file - File~/2bye�� ��� ~ Writer = FileWriter : �ܼ� ���
		// buffer ������� ȿ�������� ��� : BufferedWriter
		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(new FileReader("kdata.txt"));
			out = new BufferedWriter(new FileWriter("seoul.txt",true));
			String data = null;
			//System.in �� �ƴϱ⶧���� �츮�� �Է��ϴ� ���� �о���̴°� �ƴ϶�
			// kdata ��� ������ �о�ͼ� �״�� ����ϴ� ��
			while ((data = in.readLine()) != null) {
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
			} catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}


}
