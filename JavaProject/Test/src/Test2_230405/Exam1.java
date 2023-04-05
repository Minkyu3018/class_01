package Test2_230405;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		String aa = scan.nextLine();
		
		try {
			int bb = Integer.parseInt(aa);
			System.out.println(bb);
			
			
		} catch (Exception e) {
			System.out.println("올바른 형식이 아닙니다.");
			System.out.println(e.getMessage());
		}
		
	}
	
}
