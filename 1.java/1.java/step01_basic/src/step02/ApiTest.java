package step02;

public class ApiTest {
	 //static 문자열 반환
	static int i;
	static String getData(){
		return "문자열";
	}
	
	public static void main(String[] args) {
		
		String data = getData();
		System.out.println(data);

		//열 음절만 출력
		System.out.println(data.charAt(2));
		//문자열 길이 출력
		System.out.println(data.length());
		//문열로 변환
		
		System.out.println(data.charAt(0)); //문
		System.out.println((int)data.charAt(0)); //47928
		System.out.println(data.charAt(0)+ data.charAt(2)); //98604 +가 수학적 연산기호로 적용되면서 문과 열의 아스키 넘버가 더해짐
		data = ""+data.charAt(0) + data.charAt(2); // 문자열로 읽기 위해선 앞에 비어있는 "" 기호를 넣어줘야함

		//data.charAt(0) + data.charAt(2)는 문 과 열의 아스키 넘버를 연산한 값
	}

}
