package Chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {

		int[] korScore; // int 타입의 배열 인스턴스 주소를 가지는 변수
		korScore = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		// 값을 넣어주지 않으면 기본값은 0으로 출력된다
		for(int i=0; i<korScore.length; i++) {
			System.out.println(korScore[i]);
		}
		
		// 배열 요소의 참조
		// 배열이름[index]
		// index => 0 ~ 개수 -1
		// 요소의 개수 => 배열변수.length
		System.out.println(korScore.length);
		
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
	//	korScore[10]=68; //실행 시 오류발생
		
		System.out.println(korScore[5]);
		System.out.println("----------------");
		
		// 총합
		int sum = 0;
		// 평균값
		float avg = 0f;
		
		// index => 0~9 
		for(int i=0; i<korScore.length; i++) {
			System.out.println(korScore[i]);
			sum +=korScore[i];
		}
		
		avg = sum / (float)korScore.length;
		
		System.out.println("점수의 합계는 : " + sum + "점 입니다.");
		System.out.println("점수의 평균은 : " + avg + "점 입니다.");
		
	}

}
