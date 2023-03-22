package Chapter03;

public class PostfixOperator {

	public static void main(String[] args) {
		
		// 증감연산자 : 후위형
		int num1 = 5;
		System.out.println("num1 : " + num1);
		int num2 = num1++ ;
		
		System.out.println("num2 : " + num2);
		System.out.println("num1 : " + num1);
		
		System.out.println("num1++ : " + num1++);
		System.out.println("num1 : " + num1);
		
	}

}
