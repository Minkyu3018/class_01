package Quiz01;

public class Answer05 {

	public static void main(String[] args) {

//		num < 0 이라면 “0 미만” 출력 if로
//		0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//		100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//		200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//		300 ≤ num 이라면 “300이상 “ 출력

		int num = -1;

		switch (num / 100) {

		case 0:
			if (num < 0) {
				System.out.println("0미만");
				break;
			}
			System.out.println("0이상 100 미만");
			break;

		case 1:
			System.out.println("100이상 200 미만");
			break;

		case 2:
			System.out.println("200이상 300 미만");
			break;

		default:
			System.out.println("300이상");
			break;

		}
		System.out.println();

		//if문 내에 switch case 를 넣어 사용 방법
		int num1 = 0;

		if (num1 < 0) {
			System.out.println("0미만");
		} else {
			switch (num1 / 100) {
			case 0:
				System.out.println("0이상 100 미만");
				break;

			case 1:
				System.out.println("100이상 200 미만");
				break;

			case 2:
				System.out.println("200이상 300 미만");
				break;

			default:
				System.out.println("300이상");
				break;
			}
		}

	}
}
