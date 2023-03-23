package Quiz01;

public class Answer06 {

	public static void main(String[] args) {

//  6.while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.

		int num = 1; // 증가값
		int sum = 0;

		while (num < 100) {
//			System.out.println(sum);

			sum = sum + num;

			num++;
		}

		System.out.println("합 : " + sum);

	}

}
