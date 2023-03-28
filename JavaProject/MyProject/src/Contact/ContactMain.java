package Contact;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact c = new Contact("손흥민", "010-1111-3456", "son@gmail.com"
				, "런던", "20010101", "친구");
		
		
		System.out.println("이름 : " + c.getName());
		System.out.println("전화번호 : " + c.getPhoneNumber());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생일 : " + c.getBirthday());
		System.out.println("그룹 : " + c.getGroup());
	
		System.out.println("-----------------------");
		c.printData();
		
		c.setPhoneNumber("010-999-8888");
		c.setEmail("min@naver.com");
		c.setAddress("명왕성");
		c.setBirthday("2220년01월01일");
		
		System.out.println("-------------------");
		c.printData();
		
		
	
	}
}
