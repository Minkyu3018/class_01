package Chapter04;

public class While01 {

	public static void main(String[] args) {

//		반복문 : while 문
		
		// A를 5번 출력 기능
		int num = 0;
		
		while (num < 5) {
			System.out.println("A : " + num);
			num = num + 1 ; // num++; 대체 가능
		}
		
	}

}
