package step01.exception;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		
		//step 02
		String s = null;
		if(s != null) {
			System.out.println("String 존재");
		
		} else {
			//명시적으로 예외 발생
			System.out.println("null입니다.");
			
			throw new Exception("null이란다"); //throw 안붙이면 생성만 하고 쓰레기
			
			/*
			try {
				throw new NullPointerException ("null이란다");
			} catch (Exception e) {
				e.printStackTrace();
			} //생성해서 처리하라 명령 , 처리해야 쓸수있는 명령
	
		*/ 
	}
	}
	
}
