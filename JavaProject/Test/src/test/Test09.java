package test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("거리를 입력하세요 >>");

		int i = Integer.parseInt(sc.nextLine());
		float k = 0f;
		
		
		if(i<1000) {
			System.out.println(i+"m");
			
		} else {
			k=i/(float)1000f;
			System.out.println(k+"km");
		}
		
	}
	
}
