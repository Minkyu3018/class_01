package Chapter05.phone;

public class Member {

	// 변수
		String name;
		String email;
		int age;
		String phoneNumber;
		SmartPhone phone;  //<<추가
		
		public Member(String name, String email, int age, String phoneNumber, SmartPhone phone) {
			this.name = name;
			this.email = email;
			this.age = age;
			this.phoneNumber = phoneNumber;
			this.phone = phone; // <<추가
		}

		public Member(String name, String email) {
			this.name = name;
			this.email = email;
			this.age = 20;
			this.phoneNumber = "입력데이가 없습니다.";
			this.phone = new SmartPhone();	 // <<추가	
		}
		
		void showData() {
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
			System.out.println("나이 : " + age);
			System.out.println("전화번호 : " + phoneNumber);
			this.phone.call();
		}
}
