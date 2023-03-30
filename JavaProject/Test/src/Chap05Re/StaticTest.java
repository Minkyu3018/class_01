package Chap05Re;

public class StaticTest {

	static void print () {  // 클래스 메소드 선언
		System.out.println("스테틱 프린트 테스트");
	}
	
	void print2 ( ) {
		System.out.println("프린트 테스트");
	}
	
	public static void main(String[] args) {
		
		StaticTest.print();
		
		StaticTest print = new StaticTest();
		print.print2();
		
	}
	
}
