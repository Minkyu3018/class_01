package Chap05Re;

public class InstanceVariable {

	String name = "KKK";  // 인스턴스 변수 선언
	int age = 200; 		  // 인스턴스 변수 선언
	
	void tellName() {
		System.out.println("나의 이름은 " + name + " 입니다.");
	}
	
	void tellAge() {
		System.out.println("나이는 " + age + "살 입니다.");
	}
	
	public static void main(String[] args) {
		InstanceVariable print = new InstanceVariable();
		print.tellName();   // 인스턴스 메소드 호출
		print.tellAge();	// 인스턴스 메소드 호출
	}
	
}
