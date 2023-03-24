package Quiz01;

public class Answer11 {

	public static void main(String[] args) {

//		11. ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성

		int count = 0;

		for (int i = 1; i < 100; i++) {
			if (i % 5 != 0 || i % 7 != 0) { // 5의배수가 아니거나 7의배수가 아닌것
				continue; // =5의배수 또는 7의 배수
			}

			count++;

			System.out.println(i);

		}

		System.out.println("count: " + count);

	}
}

//int count = 0;
//
//for (int i = 1; i < 100; i++) {
//	if (i % 5 == 0 && i % 7 == 0) {
//
//		System.out.println(i);
//		count++;
//
//	}
//
//}
//
//System.out.println("count: " + count);