package Chapter04;

public class Switch01 {

	public static void main(String[] args) {
//      switch~case 문 
//		점수가 90점 이상인 경우 “A”를 출력하고, 
//		80점 이상이면서 90점 미만인 경우 “B”를 출력, 앞의 두 조건에 맞지
//		않는 이외의 경우에는 “C”를 출력하는 프로그램

		int score = 60;
		
		// score / 10 
		// 100 -> 10
		// 90 ~ 99 -> 9
		// 80 ~ 90 -> 8
		// 70 ~ 79 -> 7
		switch (score / 10) {
		
		case 10 :
			System.out.println("A");
			break;  // 감싸고 있는 블록을 탈출
			
		case 9 :
			System.out.println("A");
			break;
			
		case 8 :
			System.out.println("B");
			break;
			
		case 7 :
			System.out.println("D");
			break;
			
		default :
			System.out.println("F");
			break;
			
			// break 를 입력하지 않으면 모두 출력됨
		}
		
	}

}
