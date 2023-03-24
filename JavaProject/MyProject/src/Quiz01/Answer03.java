package Quiz01;

public class Answer03 {

	public static void main(String[] args) {
		// 3. CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고,
		// if~else를 사용하는 형태로 변경해 보자.

		// 두 수의 큰수(big)를 찾아 출력하고 두 수의 차(diff)를 출력.
		// 큰 수 -> 두 수를 비교해서 판별
		// 두 수의 차 -> 두 수의 큰수와 작은 수를 구해서 큰수에서 작은수를 빼준다.

		int num1 = 50;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("big : " + num1);
			System.out.println("diff : " + (num1 - num2));

		} else {
			System.out.println("big : " + num2);
			System.out.println("diff : " + (num2 - num1));
		}
		System.out.println();

		int num3 = 50;
		int num4 = 100;

		int big = 0; // 큰 수를 저장
		int diff = 0; // 두 수의 차이값을 저장

		if (num3 > num4) {
			big = num3;
		} else {
			big = num4;
			diff = num4 - num3;
		}
		System.out.println("큰수 : " + big);
		System.out.println("차이 : " + diff);

	}

}
