package CodingTest1;

// 정수 a와 b가 주어집니다. 
// 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
// 입출력 예 (입력 4 5 ) 출력 ( a=4 b=5)
import java.util.Scanner;

public class Ct2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자a를 입력하세요");
		int a = sc.nextInt();
		System.out.println("숫자b를 입력하세요");
		int b = sc.nextInt();
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
	}
	
}
