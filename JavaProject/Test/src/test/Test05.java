package test;

import java.util.Scanner;

import org.w3c.dom.Text;


public class Test05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		
		String str = scan.nextLine();
		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		
		
		System.out.println("["+str.charAt(num-1)+"]");
		
	}

}
