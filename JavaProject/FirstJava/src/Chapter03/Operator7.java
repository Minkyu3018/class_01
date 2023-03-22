package Chapter03;

public class Operator7 {

	public static void main(String[] args) {
		//산술연산자-문자형 연산 패턴
		char c1 = 'A'; // 유니코드 값이 저장
		int n1 = c1;
		System.out.println(c1); 
		System.out.println(n1);
		System.out.println(c1 + 1); // c1이 int 타입으로 변환되고 int+int로 연산
		
		char c2 = (char)(c1 + 1); // 형변환으로 연산하여 'B'로 출력
		System.out.println(c2);
		
	}
}
