package Inheritance;

public class Child extends Parent{
	// 상속 : 생성자,초기화 블럭 제외 모든 멤버 상속받는다.
	// 자손의 변경은 조상에 영향을 미치지 않는다.

	int z;
	
	public static void main(String[] args) {
		
		Child mm = new Child();
		
		mm.z=5;
		mm.x=6;
		
		Parent pp = new Parent();
		pp.print();
		
	}
	
}
