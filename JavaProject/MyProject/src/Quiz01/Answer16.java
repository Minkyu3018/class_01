package Quiz01;

public class Answer16 {

	public static void main(String[] args) {

//		16.	1 부터 99까지의 합을 구하는 프로그램 작성
//		while문, for문, do while 문을 각각 사용

		int num = 1;
		int sum = 0;

		while (num < 100) {

			sum += num;
			num++;
		}
		System.out.println(sum);

		num = 1;
		sum = 0;

		for (num = 1; num < 100; num++) {
			sum += num;
		}
		System.out.println(sum);

		num = 1;
		sum = 0;

		do {
			sum += num;
			num++;

		} while (num < 100);

		System.out.println(sum);
	}

}
