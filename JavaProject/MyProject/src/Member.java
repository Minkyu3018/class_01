
public class Member {

	public static void main(String[] args) {

		// 자신의 이름을 출력
		System.out.println("나의 이름은 송민규 입니다.");
		
		// Calculater 클래스의 정의
		int a = 6;
		int b = 2;
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		System.out.println(); // 한줄띄기
		
		// String, int, double, boolean 정의
		String name = ("송민규");
		int age = 37;
		double height = 177.8;
		boolean hasBook = true;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
		System.out.println("책 보유 여부 : " + hasBook);
	}

}
