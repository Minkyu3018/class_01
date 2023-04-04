package Chap06;

import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		
//		int[] ar = new int[5];
		int[] ar = {10,20,30,40,50};

//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
		
		int[] iArr = {100,95,80,70,60};
		int[] iArr2 = new int[6];
				
		
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i]+", ");
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.println();
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(iArr2));
		
	}
	
}
