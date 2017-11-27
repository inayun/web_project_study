/* �н�����
 * 1. System.in : Ű���� �ǹ�, 1 byte ��  read
 * 2.  BufferedReader : reader�� 2byte �� �о���̴°�. ���� �޸𸮸� Ȱ���� 2byte �Է� api
 * 3. 1byte ��  2byte �� �ڵ� ȣȯ �Ұ�
 * 	- ȣȯ ����� ��� : InputStreamReader
 * 4. �������
 * 	- ������ ���� ���� Ȯ���� � ��?
 * 	- int read() �������� �о�帮��  / String readLind() �Ѷ��ξ� �о�帲
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
		String data = in.readLine(); //Ű������ enter key �� ������
		while(data!=null){
			System.out.println(data);
			data = in.readLine();
		}
		
		} catch(IOException e){
			e.printStackTrace();
		}finally{ //���� �߻� ������  �����ϰ� 100% ���� �����ϴ� ���
			try{
				in.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
