package test;

public class Test02 {

	public static void main(String[] args) {

//		3. CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고,
//		if~else를 사용하는 형태로 변경해 보자.

		int num1 = 50;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("big : " + num1);
			System.out.println("diff : " + (num1 - num2));

		} else {
			System.out.println("big : " + num2);
			System.out.println("diff : " + (num2 - num1));

		}

	}

}
