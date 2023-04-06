package Test2_230405;

public class SubExam extends Exam6 {
	
	public void sub() {
		System.out.println(this.left - this.right);
	}

	public static void main(String[] args) {

		SubExam ex = new SubExam();

		ex.setOp(10, 15);
		ex.sum();
		ex.avg();
		ex.sub();

	}
}
