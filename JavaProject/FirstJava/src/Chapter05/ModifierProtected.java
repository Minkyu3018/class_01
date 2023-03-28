package Chapter05;

public class ModifierProtected {  // public을 빼면 상속되어 있는 클래스에서 접근 안됨.

	protected String name;
	protected int age;
	
	protected void tell() {
		System.out.println("안녕하세요 " + age + "살 " + name + " 입니다.");
	}
}
