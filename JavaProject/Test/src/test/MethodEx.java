package test;

public class MethodEx {
	
	
	int var1, var2; // 멤버변수들

	public int sum(int a, int c) { // 메서드 멤버함수

		return a + c;

	}

	public static void main(String[] args) {

		MethodEx me = new MethodEx();

		int ret = me.sum(1000, -300);

		System.out.println("ret =" + ret);

	}
}
