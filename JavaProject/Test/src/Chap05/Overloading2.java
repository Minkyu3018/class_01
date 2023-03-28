package Chap05;

public class Overloading2 {
	
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.println("long add(int a, long b) - ");
		return a+b;
	}

	
	public static void main(String[] args) {
		Overloading2 add = new Overloading2();
		System.out.println(add.add(2, 3));
		System.out.println(add.add(2, 3));
		
	}
}
