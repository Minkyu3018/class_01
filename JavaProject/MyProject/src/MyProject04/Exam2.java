package MyProject04;

public class Exam2 {

	public static void main(String[] args) {
		
		// Student 타입의 배열 생성 : 데이터 10개 저장가능
		Student[] students = new Student[10];
		students[0] = new Student("son01",100,100,100);
		students[1] = new Student("son02",90,95,80);
		students[2] = new Student("son03",80,90,70);
		students[3] = new Student("son04",75,80,75);
		students[4] = new Student("son05",70,70,50);
		students[5] = new Student("son06",65,75,60);
		students[6] = new Student("son07",60,70,80);
		students[7] = new Student("son08",50,90,70);
		students[8] = new Student("son09",55,60,80);
		students[9] = new Student("son10",63,50,100);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================");
		for(Student student : students) {
			System.out.println(student.result());
		}
	}
}
