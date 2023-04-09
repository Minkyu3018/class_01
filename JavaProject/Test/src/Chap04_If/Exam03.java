package Chap04_If;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.수학,2.과학,3.영어,4.역사");
		System.out.println("과목번호 : ");
		int key = scan.nextInt();
		
		
		switch (key) {
		case 1: 
			System.out.println("101호 입니다.");
			break;
		case 2: 
			System.out.println("102호 입니다.");
			break;
		case 3:
			System.out.println("201호 입니다.");
			break;
		case 4:
			System.out.println("202호 입니다.");
			break;


		default:
			System.out.println("상담원에게 문의");
		}
		scan.close();
		System.out.println("종료");
	}
	
}
