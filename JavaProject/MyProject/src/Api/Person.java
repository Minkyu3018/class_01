package Api;

public class Person {
//	1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 
//	인스턴스로 판별하는 프로그램을 만들어봅시다. 


	
	String name;
	String personNumber;
	
	
	// equals 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		// 주민번호 같으면,,,
		// 매개변수로 전달받은 obj를 Person 타입으로 형변환(null 아닌 상태에서 형변환 여부체크)
//		->	personNumber 비교 => 결과값을 반환
		
		if (obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			result = this.personNumber.equals(p.personNumber);
		}
		
		
		return result;
	}

	// 생성자 생성
	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Song", "870722-1234567");
		Person p2 = new Person("Min", "870722-1234567");
		System.out.println(p1.equals(p2));
	}
	
	
	
}
