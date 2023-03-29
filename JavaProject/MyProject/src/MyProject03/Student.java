package MyProject03;

public class Student {

	String studentName;
	int korScore;
	int engScore;
	int mathScore;
	
	
	public Student(String studentName, int korScore, int engScore, int mathScore) {
		this.studentName = studentName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}


	@Override
	public String toString() {
		return "Student [이름=" + studentName + ", "
				+ "국어점수=" + korScore + ", 영어점수=" + engScore
				+ ", 수학점수=" + mathScore + "]";
	}
	
	
}
