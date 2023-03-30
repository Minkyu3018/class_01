package MyProject05;

public class PersonImpl extends Person{

	String name;
	String idNum;
	
	
	public PersonImpl(String name, String idNum) {
		super();
		this.name = name;
		this.idNum = idNum;
	}


	@Override
	void hello() {
		super.hello();
		
		int age = Integer.parseInt(idNum.substring(0,2));
		char ch = idNum.charAt(7);
		if(ch == '1' || ch == '2') {
			age = 2023-(1900+age) +1;
		} else if( ch == '3' || ch == '4') {
			age = 2023-(2000+age) +1;}
		
		System.out.println("안녕하세요. 저는 " + name + " 입니다."+
		"나이는 " + age + " 입니다.");
	}
	
	public static void main(String[] args) {
		PersonImpl hello2 = new PersonImpl("손흥민", "900201-1234567");
		hello2.hello();
	}
	
	
}
