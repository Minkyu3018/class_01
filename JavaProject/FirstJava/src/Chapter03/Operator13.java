package Chapter03;

public class Operator13 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		
		boolean result = false;
		
		result = (num1 += 10) < 0 && (num2 += 10) > 0;   
		// num1 += 10 =>   num1 = num1+10 , num2의 값이 증가하지 않는다.
		// 앞의 값이 false 이기 때문에 뒤의 값을 계산하지 않음
		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		// or 에서 앞의값이 true 이기 때문에 뒤의 값을 계산하지 않음
		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
	}

}
