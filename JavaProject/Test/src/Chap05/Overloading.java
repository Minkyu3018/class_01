package Chap05;

public class Overloading {

	// 1. 번
	int add(int a, int b) {
		return a + b;
	}

	// 2.번
	// long add(int a, int b) {
//		return (long)(a+b);
//	}  1번과 중복 에러

	long add(int a, long b) {
		return a + b;
	}
	
	long add(long a, int b) {
		return a+b;
	}
	
	
}
