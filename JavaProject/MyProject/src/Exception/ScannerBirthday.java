package Exception;

import java.util.Scanner;

public class ScannerBirthday {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("태어난 년도를 입력하세요 ex)2023");

			int year = sc.nextInt();

		} catch (Exception e) {
			System.out.println("4자리 숫자로만 입력하세요");

		}

	}

}