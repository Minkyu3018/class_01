package MyProject04;

public class Exam1 {

	public static void main(String[] args) {
		
			
	
	// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 
	// 평균 점수를 출력하는 프로그램을 작성해봅시다.
	
	
	int[] korScore = { 90, 98, 87, 77, 76, 65, 50, 80, 55, 92 };
	int[] engScore = { 80, 98, 62, 66, 92, 62, 78, 82, 65, 82 };
	int[] mathScore = { 92, 78, 65, 87, 94, 69, 58, 86, 85, 62 };
	
	System.out.println("국어 \t영어 \t수학 \t총점 \t평균");
//	for(int i=0; i<10; i++) {
//		int sum = korScore[i]+ engScore[i]+ mathScore[i];
//		float avg = sum/3f;
//		System.out.println(korScore[i]+"\t"+engScore[i]+"\t"+mathScore[i]+"\t"
//				+sum + "\t"+avg+"\t");
//	}
	
	
	int[][] scores = {
			{100,90,80},	
			{70,90,80},	
			{60,70,80},	
			{55,80,80},	
			{100,60,80},	
			{60,50,80},	
			{100,90,80},	
			{90,80,80},	
			{90,70,70},	
			{85,90,80}	
	};
	
	for(int i=0; i<scores.length ; i++) {
		int sum = 0;
		for(int j=0; j<scores[i].length; j++) {
			System.out.print(scores[i][j]+"\t");
			sum += scores[i][j];
		}
		System.out.print(sum +"\t");
		System.out.print(sum/(float)scores[i].length);
		System.out.println();
	}
}

}