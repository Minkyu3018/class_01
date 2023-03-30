package Chapter07;

public class SmartPhone2 extends Phone {

	
	// 상위 클래스에 매게변수가 있는 생성자가 있다면 상위클래스의 맴버를 초기화 할 데이터를 받아서
	// 상위 클래스의 생성자를 호출해 주어야 한다.
	// 현재 클래스의 맴버를 초기화 한다.
	
	String model;

	public SmartPhone2(String phoneNumber, String model) {
		// 상위 클래스의 생성자를 호출
		super(phoneNumber);
		
		// 현재 클래스의 인스턴스변수의 초기화
		this.model = model;
	}
	
	void game() {
		super.call();
		System.out.println(model + "게임을합니다.");
	}
	
	public static void main(String[] args) {
		SmartPhone2 smartPhone = new SmartPhone2("010-0000-1234", "S23");
		
		smartPhone.game();
	}

}
