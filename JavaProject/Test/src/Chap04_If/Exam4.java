package Chap04_If;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num>0 && num%2 == 0) {
			System.out.println("짝수");			
		} else {
			System.out.println("홀수");
		}
		
		if(num<0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}
}
