package Chap05Re;

public class LocalVariable {

	void method(int num) { // 메소드 정의부 매개변수(값을 지정하는 임의의 변수)=> 지역변수

		int lv = 10; // 메소드 블록 안에서 정의, 지역변수

		if (num < 10) {
			boolean check = true; // 블록 안에서 사용 가능 지역변수
		} else {
			boolean check = false;
		}

		for (int i = 0; i < 5; i++) { // for 블록 내부에서 사용 가능한 지역변수
			System.out.println(i);
		}

		while (lv < 0) {
			int lv2 = 0;
			System.out.println(lv2);
		}

	}

}
