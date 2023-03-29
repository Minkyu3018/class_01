package MyProject03;

public class Scores {

	public static void main(String[] args) {

		// 국어점수
		System.out.println("===국어점수===");
		int[] score1 = { 90, 98, 87, 77, 76, 65, 50, 80, 55, 92 };
		for (int i = 0; i < score1.length; i++) {
			System.out.print(score1[i] + ",");

		}

		System.out.println();
		System.out.println("===영어점수===");
		// 영어점수
		int[] score2 = new int[] { 80, 98, 62, 66, 92, 62, 78, 82, 65, 82 };
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + ",");
		}
		System.out.println();
		System.out.println("===수학점수===");

		// 수학점수
		int[] score3 = new int[] { 92, 78, 65, 87, 94, 69, 58, 86, 85, 62 };
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + ",");
		}

	}
}
