package Chapter06;

public class ArrayTest4 {

	public static void main(String[] args) {

		int [][] arr;
		
		
		// 배열의 사이즈
		arr = new int[3][2];
		System.out.println("2차원 배열의 사이즈 : " + arr.length);
		
		System.out.println("첫번째 1차원 배열의 사이즈 : " + arr[0].length);
		System.out.println("두번째 1차원 배열의 사이즈 : " + arr[1].length);
		System.out.println("세번째 1차원 배열의 사이즈 : " + arr[2].length);
		
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[1][0] = 21;
		arr[1][1] = 22;
//		arr[2][0] = 31;    // 오류
//		arr[2][1] = 32;	   // 오류
		
		
		System.out.println("arr의 [0][0]의 값은 : " + arr[0][0]);
		System.out.println("arr의 [0][1]의 값은 : " + arr[0][1]);
		System.out.println("arr의 [1][0]의 값은 : " + arr[1][0]);
		System.out.println("arr의 [1][1]의 값은 : " + arr[1][1]);
//		System.out.println(arr[2][1]);   // 오류
//		System.out.println(arr[2][2]);   // 오류
	}

}
