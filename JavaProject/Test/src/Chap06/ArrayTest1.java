package Chap06;

public class ArrayTest1 {
	
	public static void main(String[] args) {
		
		int[] score = new int[5];
		score[3] = 100;
		
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		System.out.println("score[3] : " + score[3]);
		System.out.println("score[4] : " + score[4]);
		
		
		int value = score[3];
		System.out.println(value);
		
		int tmp = score.length;
		System.out.println(tmp);
	}
	
}
