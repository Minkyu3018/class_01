package test;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력");
		Scanner scanner = new Scanner(System.in);
		String put = scanner.nextLine();
		
		try {
			int put2 = Integer.parseInt(put);
			System.out.println(put2+1);
		
		} catch (Exception e) {
			System.out.println("예외가발생.");
		}
		
		
		
		
	}
}
