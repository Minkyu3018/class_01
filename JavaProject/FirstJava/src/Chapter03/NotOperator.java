package Chapter03;

public class NotOperator {

	public static void main(String[] args) {


		boolean led = true;
		
		System.out.println(led);
		System.out.println(!led);
		System.out.println(led);

		int num1 = 5;
		int num2 = 13;
		
		System.out.println("num1 > num2 => " + (num1 > num2));  //정상값
		System.out.println("!(num1 > num2) => " + !(num1 > num2));  //논리부정
	}

}
