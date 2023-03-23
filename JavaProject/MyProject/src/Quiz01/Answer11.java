package Quiz01;

public class Answer11 {

	public static void main(String[] args) {

//		11. ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성

		int count = 0;
		
		for (int i = 1; i < 100; i++) {
			if (i % 5 != 0 || i % 7 != 0) {
				continue;
			}
			
			count++;
			
			System.out.println(i);

		}
		
		System.out.println("count: " + count);

	}
}
