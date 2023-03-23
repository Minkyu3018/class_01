package Quiz01;

public class Answer09 {

	public static void main(String[] args) {

//		9.for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
		
		int num = 1;
		for (int i = 1; i < 11; i++) {
			num *= i;
		}

		System.out.println(num);
	
	}

}
