package Test2_230405;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		String password = "abc123";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("비번을 입력");
		String input = scanner.nextLine();
		
		 do {
			System.out.println("비번을 입력하세요");
			input = scanner.nextLine();
		} while (input.equals(password) != true);
		
		System.out.println("올바로 입력");
	}
}
