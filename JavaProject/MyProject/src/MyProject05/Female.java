package MyProject05;

public class Female extends Person {

	// 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
		
	String gender;
	String hobby;
	
	void gender() {
		System.out.println("성별은, " + gender + " 입니다.");
	}
	
	void hobby() {
		System.out.println("취미는, " + hobby + " 입니다.");
	}

	public static void main(String[] args) {
		
		Female person2 = new Female();
		
		person2.name = "아이유";
		// 주민등록번호는 " - " 를  포함하여 입력.
		person2.idNum = "880101-2000000";
		person2.gender = "여자";
		person2.hobby = "노래부르기";
		
		person2.hello();	
		
		person2.gender();
		
		person2.hobby();
		
	}
	
}
