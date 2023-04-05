package Collection;

import java.util.ArrayList;

public class FootballPlayers {

	String name;
	int number;
	String team;
	int age;
	
	public static void main(String[] args) {
		
		ArrayList<FootballPlayers> players = new ArrayList<>();
		
		FootballPlayers player1 = new FootballPlayers();
		FootballPlayers player2 = new FootballPlayers();
		FootballPlayers player3 = new FootballPlayers();
		FootballPlayers player4 = new FootballPlayers();
		
		player1.name = "손흥민";
		player1.number = 7; 
		player1.team = "토트넘";
		player1.age = 32;
		
		player2.name = "황희찬";
		player2.number = 11; 
		player2.team = "울버햄튼";
		player2.age = 28;
		
		player3.name = "이강인";
		player3.number = 19; 
		player3.team = "토트넘";
		player3.age = 23;
		
		player4.name = "차범근";
		player4.number = 0; 
		player4.team = "독일";
		player4.age = 71;
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		
		for(FootballPlayers player : players) {
			System.out.println("이름:"+ player.name + " 번호:" + player.number 
					+ " 팀:"+ player.team + " 나이:" + player.age);
		}
		
	}
}
