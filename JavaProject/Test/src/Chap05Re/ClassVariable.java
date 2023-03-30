package Chap05Re;

public class ClassVariable {
	
	static String name = "KKK";
	static int age = 10;
	
	void tellName() {
		System.out.println("이름은 : " + name);
	}
	
	void tellAge() {
		System.out.println("나이는 : " + age);
	}
	public static void main(String[] args) {
		System.out.println(ClassVariable.name);
		System.out.println(ClassVariable.age);
		System.out.println("=========================");
	
	ClassVariable variable = new ClassVariable();
	System.out.println(variable.name);
	System.out.println(variable.age);
	
	variable.tellAge();
	variable.tellName();
	
	
	}

}
