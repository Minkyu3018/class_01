package Chap05Re;

public class Person {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell() {
		System.out.println("하이 " + age + "살 " + name + " 입니다.");
	}
	
}
