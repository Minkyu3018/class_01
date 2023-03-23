package Quiz01;

public class Answer01 {

	public static void main(String[] args) {

		// 1. 아래 예제는 두 개의 if문을 사용하고 있다. 
		//	  한 개의 if 문만 사용하는 방식으로 변경해보자.

			int num = 120;

			if (num > 0 && (num % 2) == 0) {
        //if((num%2)==0)   <<< (삭제) 한줄로 변경

				System.out.println("양수이면서 짝수.");
			}
	}

}
