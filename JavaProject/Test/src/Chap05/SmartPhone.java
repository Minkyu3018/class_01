package Chap05;

public class SmartPhone {

	String color = "red";
	float size = 5.7f;
	int volume = 0;
	
	public SmartPhone(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
		
	public SmartPhone(String color, float size) {
		this.color = color;
		this.size = size;
		this.volume = 0;
	}



	void call() {
		System.out.println("전화걸기");
	}
	
	void volumeUp() {
		volume += 1;
	}
	
	void volumeDown() {
		volume -= 1;
	}
	
	void printSpec () {
		System.out.println("색상:" + color);
		System.out.println("사이즈:" + size);
		System.out.println("볼륨:" + volume);
	}
	
	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("green", 3.3f, 10);
		SmartPhone sp2 = new SmartPhone("black", 5.3f);
		SmartPhone sp3 = new SmartPhone("black", 4.3f);
		
		sp1.printSpec();
		sp2.printSpec();
		sp3.printSpec();
	}
	
}
