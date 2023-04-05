package Chapter11;

import Chapter08.Phone;
import Chapter08.SmartPhone;

public class GenericMethodByType3 {

	public void introduce (Myclass<? super SmartPhone> t) {
		System.out.println("안녕하세요 " + t.toString());
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType2 byType = new GenericMethodByType2();

		Myclass<Phone> class1 = new Myclass<Phone>();
		class1.setVal(new SmartPhone("010-1234-5678", "IOS"));
		
		byType.introduce(null);
	}
	
}
