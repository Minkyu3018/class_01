package test;

public class Test06 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) { // 수직방향(행)의 반복을 위한 for 반복문을 정의
			for (int j = 1; j <= 9; j++) { //수평방향(열)의 반복을 위한 for 반복문을 정의
			System.out.print(i + " x" + j + " = " + i*j + "\t");
			}
			System.out.println();
			
		}
		
	}

}
