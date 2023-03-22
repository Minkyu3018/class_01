package Chapter03;

public class Operator11 {
	
	public static void main(String[] args) {
		
		// 관계연산자 – 비교 연산과 자동 형변환 
		char c ='a';
		int num = 10;
		
		System.out.println(c > 10); // char > int -> int > int
		System.out.println('1' > '0'); // char > char -> int > int
		System.out.println(num == 10f); // int == float -> float == float
		
	}
}
