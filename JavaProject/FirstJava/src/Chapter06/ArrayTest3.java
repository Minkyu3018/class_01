package Chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[] korScore; // int 타입의 배열 인스턴스 주소를 가지는 변수
		korScore = new int[15]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
	
		korScore[0]=68;
		korScore[1]=85;
		korScore[2]=78;
		korScore[3]=72;
		korScore[4]=86;
		korScore[5]=69;
		korScore[6]=100;
		korScore[7]=95;
		korScore[8]=94;
		korScore[9]=91;
		korScore[10]=68; 
		korScore[11]=50; 
		korScore[12]=60; 
		korScore[13]=70; 
		korScore[14]=80; 
		
		resultPrint(korScore);
		
	}
	
	// 점수를 저장하고있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	static void resultPrint(int[] arr) {  //int[] arr = korScore;
		
		// 전달 받은 배열은 : int 타입의 배열이다! size 제약은 없다.
		
		int sum = 0;
		float avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum/(float)arr.length;
		
		System.out.println("================");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
