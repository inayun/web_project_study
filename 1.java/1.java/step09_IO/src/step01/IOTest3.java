package step01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOTest3 {

		// 키보드로부터 read하는 객체
		public static void main(String[] args) {		

		// file 에 2byte로 출력하는 객체
		// 목적지가 file - File~/2bye로 출력 ~ Writer = FileWriter : 단순 출력
		// buffer 기능으로 효율적으로 출력 : BufferedWriter
		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(new FileReader("kdata.txt"));
			out = new BufferedWriter(new FileWriter("seoul.txt",true));
			String data = null;
			//System.in 이 아니기때문에 우리가 입력하는 값을 읽어들이는게 아니라
			// kdata 라는 파일을 읽어와서 그대로 출력하는 것
			while ((data = in.readLine()) != null) {
				out.write(data); //데이터 출력만
				out.newLine(); //라인 반영
				out.flush(); //버퍼 메모링 혹여 잔존 데이터가 존재할까 하는 우려감 해소 메소드
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try { //자원반환 바로바로 , 데이터 손실될 수 있기 때문에
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
