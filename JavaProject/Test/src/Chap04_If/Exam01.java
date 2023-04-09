package Chap04_If;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = (int)(Math.random()*6)+1;
		
		if(score ==1) {
			System.out.println("Grade is : A");
			
		} else if(score ==2) {
			System.out.println("Grade is : B");
		} else if(score ==3) {
			System.out.println("Grade is : C");
		} else {
			System.out.println(score +"번출력");
		}
		
	}
	
}
