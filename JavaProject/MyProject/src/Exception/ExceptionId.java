package Exception;

import java.util.Scanner;

public class ExceptionId {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력하세요(영문,숫자만 가능!)");
		String id = sc.nextLine();

		try {
			for (int i = 0; i < id.length(); i++) {
				char c = id.charAt(i);
				if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
					BadIdInputException e = new BadIdInputException("사용할 수 없는 ID입니다.");
					throw e;
				}

			}

		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		}
	}
}
