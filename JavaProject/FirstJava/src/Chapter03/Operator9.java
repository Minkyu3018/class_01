package Chapter03;

public class Operator9 {

	public static void main(String[] args) {
		
		// 관계연산자
		int num1 = 30;
		int num2 = 2;
		
		int age = 12;
		
		// 관계연산의 결과 값은 => 논리값 true / false
		System.out.println(num1 == num2);
		System.out.println(num1 == 30);
		System.out.println(age > 19);
		System.out.println(age < 19);
		System.out.println();
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 != num2);
		
		System.out.println();
		
		// if문을 이용한 성인판단
		if(age > 19) {
			// true => 실행코드
			System.out.println("참일때 실행되는 구문");
			System.out.println("성인인증! 입장하세요");
		} else {
			// false => 실행코드
			System.out.println("거짓일때 실행되는 구문");
			System.out.println("아이들은 오면 안돼요!!");
		}
	}

}
