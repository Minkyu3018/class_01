package Chapter04;

public class WhileLoop3 {

	public static void main(String[] args) {

		//		반복제어를 위한 키워드 : break
		
		int num = 0;
		
		while (true) {
			if(num == 5) {
				break;
			}
			System.out.println(num);
			
			num++;
		}
		
	}

}
