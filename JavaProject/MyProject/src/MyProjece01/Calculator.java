package MyProjece01;

public class Calculator {

	public static void main(String[] args) {

		// Calculater 클래스의 정의		

		System.out.println(add(20, 10));
		System.out.println(sub(20, 10));
		System.out.println(mul(10, 5));
		System.out.println(div(10f, 3f));
		
	}
	
	// 반환타입, 메소드 이름, 매개변수, 반환이 있다면 return 반환값
	// 1. 숫자 두개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.

	static long add(long num1, long num2) {

//		long result = num1 + num2;
//		return result;
		
		return num1 + num2 ;
	}
	
		// 2. 숫자 두개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	static long sub(long num1, long num2) {
	
		return num1 - num2 ;
	}

		// 3. 숫자 두개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	static long mul(long num1, long num2) {
		
		return num1 * num2 ;
	}
		// 4. 숫자 두개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	static float div(float num1, float num2) {
		
	return num1 / num2 ;
	}

}
