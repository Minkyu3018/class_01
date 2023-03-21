package Chapter02;

public class VarLongType {

	public static void main(String[] args) {

		
		long num = 100000000000L;
		
		long num2 = 100000000000l; /*가독성 때문에 대문자로 표현*/
		
		System.out.println(num);
		
		System.out.println(num2);
		
//		byte num3 = 300;  (127을 초과하여 오류가 발생함)
	}

}
