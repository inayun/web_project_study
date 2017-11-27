/* 학습내용
 * 1. System.in : 키보드 의미, 1 byte 씩  read
 * 2.  BufferedReader : reader는 2byte 씩 읽어들이는거. 버퍼 메모리를 활용한 2byte 입력 api
 * 3. 1byte 와  2byte 는 자동 호환 불가
 * 	- 호환 기능의 기술 : InputStreamReader
 * 4. 고려사항
 * 	- 데이터 존재 유무 확인은 어떤 값?
 * 	- int read() 한음절씩 읽어드리고  / String readLind() 한라인씩 읽어드림
 *  	- int read() : -1
 *  	- String readLine() : null
 */
package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest1 {

	public static void main(String[] args) {
		BufferedReader in 
		= new BufferedReader(new InputStreamReader(System.in));
		
		try{
		String data = in.readLine(); //키보드의 enter key 가 기준점
		while(data!=null){
			System.out.println(data);
			data = in.readLine();
		}
		
		} catch(IOException e){
			e.printStackTrace();
		}finally{ //예외 발생 유무와  무관하게 100% 실행 보장하는 블록
			try{
				in.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
