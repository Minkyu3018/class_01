package Inheritance01;

public class Person {

	// 1. 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의
	
	private String name;
	private String personNum;
	
	
	public Person(String name, String personNum) {
		super();
		this.name = name;
		this.personNum = personNum;
	}

	// 인사하는 메소드를 정의
	// "안녕하세요. 저는 OOO입니다. 00살 입니다." 문자열 출력 정의
	public void printGreeting() {
		System.out.println("안녕하세요, 저는 " + name + " 입니다." 
	+ getAge() + "살 입니다." );
	}
	
	// 주민번호를 통해서 나이를 추출
	
	int getAge () {
		
		int age = 0;
		//880101-1234567
		String year = personNum.substring(0, 2);
		char gender = personNum.charAt(7);
		
		if (gender < '3' ) {
			age = 2023 - (1900 + Integer.parseInt(year)) +1  ;
		} else {
			age = 2023 - (2000 + Integer.parseInt(year)) +1 ;
			
		}
		

		
		//		System.out.println(year + " : " + gender);
		
		return age;
	}
	
	
	public static void main(String[] args) {
		
		Person test = new Person("tester","871112-1234567");
		test.getAge();
		
//		System.out.println(test.getAge());
	}
}
