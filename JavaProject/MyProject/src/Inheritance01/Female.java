package Inheritance01;

public class Female extends Person {

	String msg;

	public Female(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = "안녕!";

	}

	public Female(String name, String personNum) {
		super(name, personNum);

	}

	@Override
	public void printGreeting() {
		super.printGreeting();
		System.out.println(msg);
	}

}
