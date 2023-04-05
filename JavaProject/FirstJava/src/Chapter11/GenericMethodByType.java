package Chapter11;

public class GenericMethodByType {

	public <T> void introduce (T t) {
		System.out.println("안녕하세요 " + t.toString() + " 입니다." );
	}
	
	public static void main(String[] args) {
		
		GenericMethodByType byType = new GenericMethodByType();
		
		byType.<String>introduce("1");
		byType.<Integer>introduce(1);
		byType.introduce("1"); // String 생략가능
		byType.introduce(true);

	}
	
}
