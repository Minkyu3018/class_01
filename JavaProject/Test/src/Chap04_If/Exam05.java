package Chap04_If;

public class Exam05 {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		
		while (a<10) {    // a는 10미만까지 반복
			while(b<10) {  // b는 10 미만까지 반봅
				System.out.println(a*b); 
				b++;   // b가1씩증가 1*1 ->9까지
				}
			 b=1; // b를 1로 재설정
			 a++;  // a는 2로증가
		}
}
}