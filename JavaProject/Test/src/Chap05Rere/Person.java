package Chap05Rere;

public class Person {

	private String name;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void print () {
		System.out.println("안녕, " + name + " 이야." + age + " 살이야.");
	}
	
}
