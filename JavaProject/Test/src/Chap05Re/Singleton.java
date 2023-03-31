package Chap05Re;

public class Singleton {

	private Singleton() {		
	}
	
	private static Singleton s = new Singleton();
	
	public static Singleton getInstance() {
		s= new Singleton();		
		return s;
	}
	
}
