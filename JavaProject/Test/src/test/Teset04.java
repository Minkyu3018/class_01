package test;

public class Teset04 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while (num <= 1000) {
			
//			num++;

			
			if (num % 2 == 0 && (num % 7 == 0)) {
				System.out.println(num);
				
				System.out.println(sum);
				sum += num;
				
				
			}
			
			num++;
			
			
//			sum += num;
//			System.out.println(sum);
		}
		
		System.out.println(sum);

	}
}
