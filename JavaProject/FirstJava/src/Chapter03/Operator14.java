package Chapter03;

public class Operator14 {

	public static void main(String[] args) {
		
		short snum1 = 20;
		short snum2 = 30;
		
		snum1 += snum2; // snum1 = snum1 + snum2
//		snum1 = snum1 + snum2; //오류
		
		System.out.println(snum1);
		
		
		// 복합대입 연산자
		// + 를 많이 사용하게 될 것
		System.out.println();
		
		int num =10;
		
		num += 5; // num = num + 5 => num = 10 + 5
		System.out.println(num); // 15
		
		num -= 5; // num = num - 5 => num = 15 - 5
		System.out.println(num); // 10
		
		num *= 2; // num = num * 2 => num = 10 * 2
		System.out.println(num); // 20
		
		num /= 2; // num = num / 2 => num = 20 / 2
		System.out.println(num); // 10
		
		num %= 3; // num = num / 3 => num = 10 / 3
		System.out.println(num); // 1
		
	}

}
