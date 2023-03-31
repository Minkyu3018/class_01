package Inheritance01;

public class Male extends Person {
	
	String msg;

	//초기화
	public Male(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = msg;
	}

	
		
	@Override
	public void printGreeting() {
		super.printGreeting();
		System.out.println(msg);
	}



	void hello() {
		System.out.println("안녕하세요!");
	}

	
	
	
}
