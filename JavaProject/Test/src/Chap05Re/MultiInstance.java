package Chap05Re;

public class MultiInstance {

	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		
		sp1.color = "Gold";
		sp1.size = 7.2f;
		sp1.volume = 2;
		
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp1.volume);
		
		sp2.color = "White";
		sp2.size = 10.2f;
		sp2.volume = 3;
		
		System.out.println("===========sp2===========");
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		System.out.println(sp2.volume);
	}
	
}
