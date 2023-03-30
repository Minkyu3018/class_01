package Chap05;

public class SmartPhone2 {

	String color = "red";
	float size = 5.7f;
	int volume = 0;
	
	public SmartPhone2(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	void call() {
		System.out.println("전화걸기");
	}
	
	void volumeUp() {
		volume += 1;
	}
	
	public static void main(String[] args) {
		
		SmartPhone2 sp = new SmartPhone2("Gold",4.5f ,3);
		
		System.out.println(sp.color);
		
		sp.call();
		
	}
	
}
