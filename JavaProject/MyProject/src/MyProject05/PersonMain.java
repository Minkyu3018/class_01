package MyProject05;

public class PersonMain {

	public static void main(String[] args) {

		Male person = new Male();

		person.name = "송민규";
		// 주민등록번호는 " - " 를 포함하여 입력.
		person.idNum = "870722-1000000";
		person.gender = "남자";

		person.hello();

		person.gender();

		System.out.println("==================================");

		Female person2 = new Female();

		person2.name = "아이유";
		// 주민등록번호는 " - " 를 포함하여 입력.
		person2.idNum = "880101-2000000";
		person2.gender = "여자";
		person2.hobby = "노래부르기";

		person2.hello();

		person2.gender();

		person2.hobby();

	}

}
