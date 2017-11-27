package step01;

public class Test {
	//변수
	String name; //멤버 변수들은 초기값을 지정 안해줘도 됨
	int age;

	//생성자
	Test(){} // 생성자 : 메모리에 확보 가능하게 해줌
	//메소드
	String getName(){ //메소드 : 반환타임  메소드명([...])
		return name;
	}
	void setName(String name){ //파라미터의 이름과 멤버변수의 이름이 같은경우는 this 를 써줌
		this.name = name; 
	}
	int getAge(){
		return age;
	}
	void setAge(int age){
		this.age = age;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.name = "윤인아";
		t.age = 24;
		System.out.println(t.name + "" + t.age);
		
		t.setName("유성현");
		t.setAge(28);
		System.out.println(t.getName() + "" + t.getAge());
		
	}

}
