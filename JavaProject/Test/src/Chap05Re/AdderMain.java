package Chap05Re;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder adder = new Adder();
		
		System.out.println(adder.add(10,20));
		
		System.out.println(adder.add(10.1f,20.2f));
	}
	
}
