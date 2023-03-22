package Chapter03;

import javax.xml.transform.Source;

public class Operator12 {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 2;
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(); // 개행
		
		System.out.println(num1 > 10 && num1 < 50);
		
		System.out.println(); // 개행
		
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
	}

}
