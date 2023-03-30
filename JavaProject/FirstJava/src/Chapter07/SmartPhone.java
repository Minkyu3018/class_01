package Chapter07;

public class SmartPhone extends Phone {
	
	String model;
	
	
	void game() {
		System.out.println(model + "게임을 합니다.");
	}

	
	
	public static void main(String[] args) {
	
		SmartPhone sp = new SmartPhone();
		
		sp.phoneNumber = "010-1234-5678";
		sp.call();
		
		sp.model = "Samsung S21+";
		sp.game();
		

		
	}
	
}
