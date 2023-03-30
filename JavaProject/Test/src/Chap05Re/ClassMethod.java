package Chap05Re;

public class ClassMethod {

	String name = "kkk";
	
	void hi() {
		System.out.println("안녕, 나는" + name + " 야.");
	}
	
	public static void main(String[] args) {

		ClassMethod hi = new ClassMethod(); // 인스턴스 정의
		hi.hi();
	}
	
}
