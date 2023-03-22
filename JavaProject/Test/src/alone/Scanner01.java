package alone;

import java.util.Scanner;

public class Scanner01 {
	
	public static void main(String[] args) {
		
//		Scanner hello = new Scanner(System.in);
//			System.out.println("이름을 입력하세요 ▼▼▼");
//			
//			String name = hello.nextLine();
//			System.out.println("안녕하세요. " + name + "님");
//			System.out.println(name + "님\n반갑습니다");

		Scanner chicken = new Scanner(System.in);
		System.out.println("아무거나 입력하세요.");
		
		String name = chicken.nextLine();
			System.out.println(name+ "~치킨은 살 안쪄요.");
	}

}
