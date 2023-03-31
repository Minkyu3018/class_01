package Chap05;

public class SmartPhone3 {

	String color = "red";
	float size = 5.7f;
	int volume = 0;
	
	public SmartPhone3(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	public SmartPhone3(String color, float size) {
		this.color = color;
		this.size = size;
	}
	
	public SmartPhone3(float size) {
		this.size = size;
		
	}
	
	void call() {
		System.out.println("전화걸기");
	}
	
	void volumeUp() {
		volume += 1;
	}
	
	void printSpec() {
		System.out.println("> 스마트폰의 색상 : " + color);
		System.out.println("> 스마트폰의 사이즈 : " + size);
		System.out.println("> 스마트폰의 볼륨 크기 : " + volume);
	}
	
	public static void main(String[] args) {
		
		SmartPhone3 sp = new SmartPhone3("Gold",4.5f ,3);
		SmartPhone3 sp1 = new SmartPhone3("Gold",4.5f);
		SmartPhone3 sp2 = new SmartPhone3(4.5f);

		sp.printSpec();
		System.out.println();
		sp1.printSpec();
		System.out.println();
		sp2.printSpec();
		System.out.println();
		
		sp.call();
		
	}
	
}
