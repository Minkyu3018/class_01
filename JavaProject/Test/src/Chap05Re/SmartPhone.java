package Chap05Re;

public class SmartPhone {
	
	String color = "red";
	float size = 5.7f;
	int volume = 0;
	
	void call() {
		System.out.println("전화걸기");
	}
	
	void volumeUp() {
		volume += 1;
	}
	
	void volumeDown() {
		volume -= 1;
	}

}
