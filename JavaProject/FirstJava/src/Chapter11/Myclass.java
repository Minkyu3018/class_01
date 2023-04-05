package Chapter11;

import java.util.Date;

public class Myclass<T> {

	// 변수, 메도스의 반환타입, 매개변수의 타입
	T val;
	
	
	public Myclass() {
		super();
	}

	public Myclass(T val) {
		super();
		this.val = val;
	}

	T getVal() {
		return val;
	}
	
	void setVal(T val) {
		this.val = val;
	}
	
	public static void main(String[] args) {
		
		// 제네릭 클래스의 정의방법 (꺾쇠까지 클래스 이름)
		Myclass<String> myclass = new Myclass<String>();
		myclass.setVal("KING"); // String 타입의 데이터만 반환..

//		myclass.setVal(new Date()); // 잘못된 타입이 저장되지 않도록 처리된다!!
		System.out.println(myclass.getVal());
	}
}
