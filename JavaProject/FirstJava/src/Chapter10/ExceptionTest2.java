package Chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("프로그램을 시작합니다");
		System.out.println("정수 하나를 입력하세요>>");

		int num1 = 0;
		int num2 = 0;

		try {
			num1 = sc.nextInt();
			System.out.println("두번째 정수를 입력하세요>>");
			num2 = sc.nextInt();
			System.out.println("결과는 : " + num1 / num2);

		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기는 불가합니다");
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
			
			
		} catch (Exception e) {
			System.out.println("예외발생!!!");
		
		} finally {
			// try 블록으로 진입하면 무조건 실행
			
			System.out.println("무조건 실행하는 구문입니다.");
		}

		System.out.println("프로그램을 종료합니다");
	}
}
