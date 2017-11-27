package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest2 {
	// 키보드로부터 read하는 객체
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = null;
	// file 에 2byte로 출력하는 객체
	// 목적지가 file - File~/2bye로 출력 ~ Writer = FileWriter : 단순 출력
	// buffer 기능으로 효율적으로 출력 : BufferedWriter

	try {
		out = new BufferedWriter(new FileWriter("kdata.txt", true));
		String data = null; //data 변수를  null로 초기화
		while ((data = in.readLine()) != null) { //입력이  새로 될때마다 반복문을 돌려야함...
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
	} catch(Exception e){
		e.printStackTrace();
	}
}
	}
}
