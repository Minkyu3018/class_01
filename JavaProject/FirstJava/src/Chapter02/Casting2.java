package Chapter02;

public class Casting2 {

	public static void main(String[] args) {

		byte b = 10;
		int i = (int)b;  // b앞의 (int)표시는 명시적 목적으로 표현함. 생략가능함
		System.out.println("i = " + i);
		System.out.println("b = " + b);
		
		int i2 = 300;
		byte b2 = (byte)i2;  // byte의 값이 300을 표현하지 못해 왜곡이 생긴다.
		System.out.println("i2 = " + i2);
		System.out.println("b2 = " + b2);
	}

}
