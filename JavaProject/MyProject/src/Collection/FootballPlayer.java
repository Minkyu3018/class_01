package Collection;

import java.util.ArrayList;

public class FootballPlayer {

//	1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 
//	인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
//	String name;
//	int number;
//	String team;
//	int age
	 
	public static void main(String[] args) {

		ArrayList<String> players = new ArrayList<String>();
		
		ArrayList<Integer> numberAge = new ArrayList<Integer>();
		
		players.add("손흥민");
		numberAge.add(7);
		players.add("토트넘");
		numberAge.add(32);
		
		System.out.println("축구선수의 정보 출력합니다.");
		System.out.println("이름 : " + players.get(0));
		System.out.println("번호 : " + numberAge.get(0));
		System.out.println("소속팀 : " + players.get(1));
		System.out.println("나이 : " + numberAge.get(1));

		
		
		
		
	}

}
