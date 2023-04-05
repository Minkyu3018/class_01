package Exception2;

import java.util.Scanner;

public class Exam1Main {

	public static void main(String[] args) /*throws Exception*/ {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();  // essen51
		
		// 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는
		for(int i=0; i<id.length();i++) {
			char c = id.charAt(i);
			// 영문자 대문자/소문자/숫자
			if(!(c>='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9')) {
				// 사용자 예외 클래스를 정의해서 예외를 발생시켜 봅시다.
				
				try {
//					throw new Exception(); // 예외발생
					throw new BadIdInputException(id);
					
					
				} catch(Exception e) {
					System.out.println("입력값은 영문(소문자,대문자),숫자만 사용가능!");
					System.out.println(e.getMessage());
					e.printStackTrace();
					return;   // 또는 break;
				// log 파일에 오류에 대한 내용을 쓰겠다.
				// 오류 내용을 DB에 저장하겠다.
				// 응답 및 결과는 프로그램 종료 후 다시 시작하도록 하겠다.
				}
				
			}
		}
	}
	
}
