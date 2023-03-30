package MyProject05;

public class Person {
	
	String name;
	String idNum;
	
	
	public Person(String name, String idNum) {
		this.name = name;
		this.idNum = idNum;
	}


	public Person() {}
	
	
	void hello () {
		int age = Integer.parseInt(idNum.substring(0,2));
		char ch = idNum.charAt(7);
		if(ch == '1' || ch == '2') {
			age = 2023-(1900+age) +1;
		} else if( ch == '3' || ch == '4') {
			age = 2023-(2000+age) +1;
		}
		
		System.out.println("안녕하세요. 저는 " + name + " 입니다. " + age + " 살 입니다.");
	}
	
	
//	public static void main(String[] args) {
//		
//		Person person = new Person();
//		
//		person.name = "송민규";
//		// 주민등록번호는 " - " 를  포함하여 입력.
//		person.idNum = "870722-1000000";
//		
//		person.hello();		
//		
//}

}
