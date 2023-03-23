package Chapter04;

public class IfTest04 {

	public static void main(String[] args) {

		// 양수, 음수

		int num = -13;

		if (num > 0) {
			System.out.println("양수"); // num이 0보다 클떄

		} else if (num < 0) {
			System.out.println("음수"); // num이 0보다 작을때

		} else {
			System.out.println("0"); // num이 둘다 해당안될떄 = 0과 같을떄
		}

	}
}

