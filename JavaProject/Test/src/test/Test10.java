package test;

public class Test10 {

	int a,b ;
	
	int add() {
		return a + b;
	}
	
	static int add(int a, int b) {
		return a + b ;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(add(20, 40));
		
		
		Test10 ad = new Test10();
		ad.a = 10;
		ad.b = 20;
		System.out.println(ad.add());
	}
	
}
