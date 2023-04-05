package test;

public class Test11 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 0;
		int result = 0;

//		result = num1 / num2;
		
		
		if (num2 != 0) {    // 만약에 num2가 0이 아니면, 
			result = num1 / num2; // 결과값 num1 / num2
		} else {
			System.out.println("0으로 나눌 수 없습니다. "); //num2가 0이면 출력
		}
		System.out.println("result = " + result); // num2가 0이 아니면 출력
		System.out.println();

		try {
			result = num1 / num2;
			System.out.println("result = " + result);
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누면 발생하는 Exception");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}	
	
}
