package Contact;

import java.util.Scanner;

public class ContactMain2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 > ");
		String strAge = in.nextLine();
		
		int age= Integer.parseInt(strAge);  // string 타입을 int 타입으로 변경해줌
		
//		System.out.println(strAge);
		
		if (age > 19) {
			System.out.println("성인!");
		} else {
			System.out.println("미성년!");
		}
		
	}
	
}
