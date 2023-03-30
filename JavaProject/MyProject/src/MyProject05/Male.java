package MyProject05;

public class Male extends Person {

	// 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
		
	String gender;
	
	void gender() {
		System.out.println("성별은, " + gender + " 입니다.");
	}

	public static void main(String[] args) {
		
		Male person = new Male();
		
		person.name = "송민규";
		// 주민등록번호는 " - " 를  포함하여 입력.
		person.idNum = "870722-1000000";
		person.gender = "남자";
		
		person.hello();	
		
		person.gender();
		
	}
	
}
