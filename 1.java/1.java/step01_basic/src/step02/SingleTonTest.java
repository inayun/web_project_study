package step02;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon s = SingleTon.getInstance();
		System.out.println(s.getMsg());
	}

}
