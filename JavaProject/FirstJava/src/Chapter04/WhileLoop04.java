package Chapter04;

public class WhileLoop04 {

	public static void main(String[] args) {
		
		// 1~10까지 출력
		int num = 0;
		
		while(num < 10) {
			num++;
			
			if(num % 2 == 0 ) {
				continue;
			}
			
			System.out.println(num);
			
			
		}
		
	}
}
