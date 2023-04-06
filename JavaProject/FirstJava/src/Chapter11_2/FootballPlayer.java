package Chapter11_2;

import java.util.Objects;

// 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터 저장 ->인스턴스생성 ->배열-> List이용
public class FootballPlayer {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
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

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
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
		return Objects.hash(name, team, number, age);
	}


	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}

}
