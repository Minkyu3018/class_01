package Quiz01;

public class Answer08 {

	public static void main(String[] args) {
//		8. 1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자를 출력하고, 
//		그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성

		int i = 1;
		int sum = 0;

		while (i <= 1000) {                    // 1000이하의 숫자를 반복

			if (i % 2 == 0 && i % 7 == 0) {    // 2의배수와 7의배수를 뽑아냄
				System.out.println(i);         // 뽑아낸 숫자를 출력함
				sum = sum + i;                 // 출력된 숫자를 더함
			}
			i++;							   // i가 1씩 증가(1000이 될때까지)
		}
		System.out.println("합 : " + sum);      // 반복해서 더해진 값을 출력함
	
	}

}