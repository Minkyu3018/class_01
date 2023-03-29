package Chapter06;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] score1 = { 100, 90, 70, 80, 65, 60 };
		System.out.println("score1 배열의 사이즈 : " + score1.length);
		for(int i=0; i<score1.length; i++) {
			System.out.print(score1[i]+ "," );
			
		}
		System.out.println();
		
		int[] score2 = new int[] { 100, 90, 70, 80, 65};
		System.out.println("score2 배열의 사이즈 : " + score2.length);
		for(int i=0; i<score2.length; i++) {
			System.out.print(score2[i] + ",");
		}

		
	
		int[] score3;
		score3 = new int[] { 100, 90, 70, 80, 65};
	}

}
