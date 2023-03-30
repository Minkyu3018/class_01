package Chapter07;

public class SmartPhoneImpl2 extends Phone {

	String model;

	public SmartPhoneImpl2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		System.out.println(model + "이어팟을 이용해서 통화합니다.");
	}
	
	void playMusic() {
		System.out.println("음악을 듣습니다.");
	}
	
	
	
	
	public static void main(String[] args) {
		
		// 다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있는것
		Phone p = new SmartPhoneImpl2("010-8997-3018","ios");
		p.call(); // 하위타입 인스턴스에 정의되어 있는 오버라이딩 된 call 메소드가 호출된다.
//		p.playMusic();
		
//		SmartPhoneImpl2 p2 = new SmartPhoneImpl2("000", "111")
		
		SmartPhoneImpl2 p2 = (SmartPhoneImpl2)p;
		p2.playMusic();
		
	}
	
}
