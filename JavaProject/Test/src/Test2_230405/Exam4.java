package Test2_230405;

public class Exam4 {

	public static void main(String[] args) {
		
		// 총점과 평균을 구하는 프로그램
		// 점수는 5개로 세팅
		
		// 변수 정의
		int sum = 0;
		float avg = 0f;
		
		int[] score = {100,91,95,63,72};
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
			
		}
		avg = sum / (float)score.length;
		
		System.out.println(sum);
		System.out.println(avg);

		
		
	}
	
}
