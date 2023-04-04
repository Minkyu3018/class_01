package Chapter10;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();

		try {
			if (!(score >= 0 && score <= 100)) {
				BadInputException e = new BadInputException("시험점수는 1~100까지의 점수만 입력!");
				throw e;
			}
		} catch (BadInputException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
