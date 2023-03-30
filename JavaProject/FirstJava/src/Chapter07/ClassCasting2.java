package Chapter07;

public class ClassCasting2 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("011-9997-3018");
		
		IPhone iPhone = new IPhone("010-8997-3018");
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
		
	}
	
	public static void callByPhone(Phone p) {
		p.call();
	}
	
//	public static void callByPhone(AndroidPhone p) {
//		p.call();
//	}
//	
//	public static void callByPhone(IPhone p) {
//		p.call();
//	
//	}
	
}
