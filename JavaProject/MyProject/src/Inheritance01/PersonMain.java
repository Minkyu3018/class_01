package Inheritance01;

public class PersonMain {

	public static void main(String[] args) {
		
		Male m1 = new Male("손흥민", "870101-1234567", "축구선수입니다");
		m1.printGreeting();
		
		Person p1 = (Person)m1;
		p1.printGreeting();
//		p1.hello();
		
		Person p2 = new Female("아이유","950201-2345678");
		p2.printGreeting();
	}
}

