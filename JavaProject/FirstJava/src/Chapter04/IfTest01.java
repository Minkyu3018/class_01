package Chapter04;

public class IfTest01 {

	public static void main(String[] args) {

		// 시험 점수가 60점 이상일 때 => 조건식 
		// “PASS”를 출력하는 프로그램을 만들기 => 조건의 결과가 참일때 처리

		int score; // 시험점수 데이터
		
		score = 90; // 시험점수 입력
		
		if (score >= 60) // 조건식 , 한줄이므로 {} 생략
			System.out.println("PASS!!"); // 출력
			System.out.println();
			
		int age;
		
		age = 20;
		
		if (age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
	}

	
}
