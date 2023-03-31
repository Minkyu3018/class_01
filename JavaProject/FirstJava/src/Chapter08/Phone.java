package Chapter08;

public abstract class Phone {

	String phoneNumberString;

	public Phone(String phoneNumberString) {
		super();
		this.phoneNumberString = phoneNumberString;
	}
	
	void call() {
		System.out.println(phoneNumberString + " 에서 전화를 겁니다.");
	}
	
	abstract void turnOn();
}
