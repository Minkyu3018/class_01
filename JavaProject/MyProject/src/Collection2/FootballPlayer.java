package Collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashMap;

// 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터 저장 ->인스턴스생성 -> 배열-> List이용
public class FootballPlayer implements Comparable<FootballPlayer> {

	private String name;
	private String number;
	private String team;
	private int age;

	public FootballPlayer(String name, String number, String team, int age) {
		super();
		this.name = name;
		this.team = team;
		this.number = number;
		this.age = age;
	}

	// 기본생성자
	public FootballPlayer() {

	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getNumber() {
		return number;
	}

	void setNumber(String number) {
		this.number = number;
	}

	String getTeam() {
		return team;
	}

	void setTeam(String team) {
		this.team = team;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Footballplayer : name=" + name + " team=" + team + " number=" + number + " age=" + age;
	}

	@Override
	public int hashCode() {
		return this.name.charAt(name.length() - 1) % 5;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj != null && obj instanceof FootballPlayer) {
			FootballPlayer sp = (FootballPlayer) obj;
			result = name.equals(sp.getName());

		}
		return result;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		int compare = this.team.compareTo(o.getTeam());
		if (compare == 0) {
			compare = this.name.compareTo(o.getName());
			if (compare == 0) {
				compare = this.number.compareTo(o.getNumber());
			}
		}
		return compare;
	}

	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}

}
