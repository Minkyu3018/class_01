package Collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ListMain {

	public static void main(String[] args) {

		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고
		// 선수들을 저장

		ArrayList<FootballPlayer> myTeam = new ArrayList<>();

		myTeam.add(new FootballPlayer("손흥민", "7", "토트넘", 30));
		myTeam.add(new FootballPlayer("이강인", "18", "마요르카", 20));
		myTeam.add(new FootballPlayer("박지성", "7", "맨유", 40));

		System.out.println("나의 팀 선수정보");
		for (FootballPlayer player : myTeam) {
//			player.showInfo();
			System.out.println(player.toString());

		}
		System.out.println("======set=======");

		HashSet<FootballPlayer> playerSet = new HashSet<>();

		playerSet.add(new FootballPlayer("손흥민", "7", "토트넘", 30));
		playerSet.add(new FootballPlayer("이강인", "18", "마요르카", 20));
		playerSet.add(new FootballPlayer("박지성", "7", "맨유", 40));
		playerSet.add(new FootballPlayer("손흥민", "7", "토트넘", 30));

		for (FootballPlayer player : playerSet) {
			player.showInfo();
		}
		System.out.println("=========treeset==========");

		TreeSet<FootballPlayer> playerTset = new TreeSet<FootballPlayer>();

		playerTset.add(new FootballPlayer("손흥민", "7", "토트넘", 30));
		playerTset.add(new FootballPlayer("이강인", "18", "마요르카", 20));
		playerTset.add(new FootballPlayer("박지성", "7", "맨유", 40));
		playerTset.add(new FootballPlayer("손흥민", "7", "토트넘", 30));

		for (FootballPlayer player : playerTset) {
			player.showInfo();
		}
	}
}
