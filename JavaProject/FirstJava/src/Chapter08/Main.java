package Chapter08;

public class Main {

	public static void main(String[] args) {
		
		AbstractClass abstractClass; // 참조변수 선언, 상위타입
//		abstractClass = new AbstractClass(); // 인스턴스 생성불가
		
		NewClass class1 = new NewClass();
		class1.abstractMehod();
		class1.instenceMethod();
		class1.name = "BTS";
		class1.printData();
	}
	
}
