package Chapter08.phone;

public class SmartPhone2 extends Computer implements Phone{

	boolean power; // false

	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_2);
		String number3 = String.valueOf(PHONE_NUM_3);
		System.out.println(number1+number2+number3+"에 전화합니다.");		
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		if(!power) { //꺼져있는 상태
			power = true;
		}
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
		if(power) { //전원이 켜져있으면 끈다
			power = false;
		}
	}
	
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.call();
	}
	

	
}
