package Api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam4Main {
	
	public static void main(String[] args) {
		
//		4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지
//		출력하는 프로그램을 만들어봅시다.

		LocalDate birthday = LocalDate.of(2020, 10, 27);
		LocalDate now = LocalDate.now();
		
		System.out.println("오늘은 : " + now);
		System.out.println("생일은 : " + birthday);
		
		long days = ChronoUnit.DAYS.between(birthday, now);
		System.out.println(days);
		
		LocalDate cDay = LocalDate.parse("2023-12-25");
		System.out.println("크리스마스 : " + cDay);
		long days2 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println(days2);
	}

}
