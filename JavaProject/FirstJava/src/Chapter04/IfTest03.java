package Chapter04;

public class IfTest03 {

	public static void main(String[] args) {
//		- 점수가 90점 이상인 경우 “A”를 출력하고
//		- 80점 이상이면서 90점 미만인 경우 “B”를 출력
//		- 앞의 두 조건에 맞지 않는 이외의 경우에는 “C”를 출력하는 프로그램

		int score = 91;

		if (score >= 90) {
			//System.out.println("A"); // 90 이상일때 출력
			if (score > 96) {
				System.out.println("A+");
			} else if (score > 93) {
				System.out.println("A");
			} else {
				System.out.println("A-");
			}
		} else if (score >= 80) {
			System.out.println("B"); // 80이상 90이하일때 출력

		} else {
			System.out.println("C"); // 80점 미만일때 출력

		}

	}
}
