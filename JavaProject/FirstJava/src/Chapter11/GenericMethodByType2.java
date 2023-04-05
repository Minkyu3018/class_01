package Chapter11;

import Chapter08.Phone;
import Chapter08.SmartPhone;

public class GenericMethodByType2 {

	public <T extends Phone> void introduce (T t) {
		System.out.println("안녕하세요 " + t.toString() + " 입니다." );
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType2 byType = new GenericMethodByType2();
		
		SmartPhone p = new SmartPhone("010-1234-5678", "IOS");
		
//		byType.<String>introduce("1");
//		byType.<Integer>introduce(1);
//		byType.introduce("1"); // String 생략가능
//		byType.introduce(true);
		
		byType.<SmartPhone>introduce(p);
		byType.introduce(p);

	}
	
}
