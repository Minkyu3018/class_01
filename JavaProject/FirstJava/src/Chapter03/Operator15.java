package Chapter03;

public class Operator15 {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 5;
		
		int min = (num1 < num2) ? num1 : num2;
		System.out.println("작은수 : " + min);
		
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("큰수 : " + max);
		
		
		String result = num1 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		
		String result2 = num2 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result2);
	}

}
