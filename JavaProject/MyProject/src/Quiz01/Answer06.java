package Quiz01;

public class Answer06 {

	public static void main(String[] args) {

//  6.while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.

		int num = 1; // 증가값
		int sum = 0;

		while (num < 100) {    // 반복처리하는 문장 : 합을 구하는 연산

//			sum = sum + num;
			sum += num;

			num++;
		}
		sum = 0;
		int i;
		
		for(i=0; i<100; i++) {
			sum += i;
		}
		

		System.out.println("합 : " + sum);
	}	
}
