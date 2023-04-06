package Test2_230405;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		try {
			System.out.println("숫자를 입력하세요");
			String aa = scan.nextLine();
			int bb = Integer.parseInt(aa);
			System.out.println("입력하신 숫자는" + "\"\""+ bb +"\"\""+ "입니다.");
			
			
		} catch (Exception e) {
			System.out.println("올바른 형식이 아닙니다.");
			System.out.println(e.getMessage());
			

			
		}
		
		
	}
	
}
