package Chapter09;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());

		cal.add(Calendar.HOUR, 1);  // 시간 1시간 증가
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, 0); // 날짜 1일 증가
		System.out.println(cal.getTime());
		
		
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal2.set(2023, 3, 1);
		cal3.set(2023, 5, 1);
		
		System.out.println(cal2.getTime());
		System.out.println(cal3.getTime());
		
		System.out.println(cal2.before(cal));
		System.out.println(cal3.before(cal));
		
		if(cal.before(cal2)) {
			System.out.println("이벤트 진행 중입니다");
		} else {
			System.out.println("이벤트 종료!!");
		}
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));

		
		
	}

}
