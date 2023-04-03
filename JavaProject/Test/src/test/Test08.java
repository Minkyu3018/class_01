package test;

public class Test08 {

	public static void main(String[] args) {
		
		int[] score;
		score = new int[5];	
		
		score[3] = 80;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		int value = score[3];
		int value2 = score[3];
		
		System.out.println(value);
		System.out.println(value2);
	}
	

}
