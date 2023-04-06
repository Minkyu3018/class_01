package Collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ListMain {

	public static void main(String[] args) {

		// 1.축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고
//		출력하는 프로그램을 만들어 봅시다.
		ArrayList<FootballPlayer> myTeam = new ArrayList<>();

		myTeam.add(new FootballPlayer("손흥민", "7", "토트넘", 30));
		myTeam.add(new FootballPlayer("이강인", "18", "마요르카", 20));
		myTeam.add(new FootballPlayer("박지성", "7", "맨유", 40));

		System.out.println("나의 팀 선수정보");
		for (FootballPlayer player : myTeam) {
			System.out.println(player.toString());

		}
		System.out.println("===========set============");
		// 2.축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록
//		Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

		HashSet<FootballPlayer> playerSet = new HashSet<>();

		playerSet.add(new FootballPlayer("손흥민", "7", "토트넘", 30));
		playerSet.add(new FootballPlayer("이강인", "18", "마요르카", 20));
		playerSet.add(new FootballPlayer("박지성", "7", "맨유", 40));
		playerSet.add(new FootballPlayer("손흥민", "7", "토트넘", 30));

		for (FootballPlayer player : playerSet) {
			System.out.println(player);
		}
		System.out.println("=========treeset==========");

//		3.TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 
//		같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		TreeSet<FootballPlayer> playerTset = new TreeSet<FootballPlayer>();

		playerTset.add(new FootballPlayer("손흥민", "7", "토트넘", 30));
		playerTset.add(new FootballPlayer("이강인", "18", "마요르카", 20));
		playerTset.add(new FootballPlayer("박지성", "7", "맨유", 40));
		playerTset.add(new FootballPlayer("손흥민", "7", "토트넘", 30));

		for (FootballPlayer player : playerTset) {
			System.out.println(player);
		}
	
//		4.축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 
//		프로그램을 만들어봅시다.
		
	
	
	
	}
}
