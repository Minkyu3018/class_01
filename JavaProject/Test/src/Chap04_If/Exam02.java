package Chap04_If;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("태어난 해(년도)를 입력하세요");

		int year = scan.nextInt();

//		Print1(year);
		Print2(year);

//		System.out.println(age);

	}

//		static void Print1(int year) {
//		
//			int age = 2023 - year +1;
//			
//			if(age<15 || age>=65) {
//				System.out.println("무료예방접종이 가능합니다");
//			} else {
//				System.out.println("무료 접종대상이 아닙니다");
//			}
//		}
//		
	static void Print2(int year) {

		int age = 2023 - year + 1;

		if (age >= 20 && (2024 + year) % 2 == 0) {
			System.out.println("20세이상 무료검진대상");
			System.out.println("짝수년 검사대상");

			if (age >= 40) {
				System.out.println("암검진 무료대상입니다.");
			}
		}
	}

}
