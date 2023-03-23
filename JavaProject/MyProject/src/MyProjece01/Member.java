package MyProjece01;

public class Member {

	public static void main(String[] args) {

		// 자신의 이름을 출력
		System.out.println("나의 이름은 송민규 입니다.");
		
				
		// 1.String, 2.int, 3.double, 4.boolean 정의
		String name = ("송민규");  // 1. String
		int age = 37;             // 2. int
		double height = 177.8;    // 3. double
		boolean hasBook = true;   // 4. boolean
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
		System.out.println("책 보유 여부 : " + hasBook); // 5. 출력
	}

}
