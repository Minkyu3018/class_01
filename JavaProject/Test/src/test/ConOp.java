package test;

public class ConOp {

	public static void main(String[] args) {

		int num1=50, num2=100;
        int big, diff;
        big = (num1>num2)? num1:num2;
        System.out.println(big);
        diff = (num1>num2)? num1-num2: num2-num1;
        System.out.println(diff);
		
	}

}
