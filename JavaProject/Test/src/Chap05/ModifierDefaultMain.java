package Chap05;

public class ModifierDefaultMain {

	public static void main(String[] args) {
		
		ModifierPrivate mp = new ModifierPrivate();
		
		mp.name = "손";
		mp.age = 28;
		
		mp.tell();
		
	}
	
}
