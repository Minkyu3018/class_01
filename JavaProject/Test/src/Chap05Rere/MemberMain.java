package Chap05Rere;

public class MemberMain {

	
	
	public static void main(String[] args) {
		
		Member mb = new Member("송민규", "010-1234-5678", "구매", 3, 
				"2@gmail.com", "1987-07-22", "일산");
		
		Member mb2 = new Member("송민규", "010-1234-5678", "구매", 3, 
				"2@gmail.com");
		
		mb.print();
		System.out.println("=======================");
		mb2.print();
	}
		
	
	
}
