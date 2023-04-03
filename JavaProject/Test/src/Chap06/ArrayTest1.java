package Chap06;

public class ArrayTest1 {

	int num1;
	int num2;
	
	public ArrayTest1() {}

	public ArrayTest1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void plus() {
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {

		ArrayTest1 array = new ArrayTest1();

		array.plus();
		
	}
}
