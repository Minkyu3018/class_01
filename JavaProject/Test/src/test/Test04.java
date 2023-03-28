package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요>>");
		int year = scan.nextInt();
		int age = 2023 - year + 1;

		if (age >= 20) {
			System.out.println("무료로 2년마다 검진가능.");
			if (age % 2 == 0) {
				System.out.println("검진대상입니다.");
				if (age >= 40) {
					System.out.println("암 검사도 무료입니다.");
				}

			}
		} else {
			System.out.println("대상자가 아닙니다.");
		}

	}
}