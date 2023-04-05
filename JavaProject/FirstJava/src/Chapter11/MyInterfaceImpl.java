package Chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}

	
	public static void main(String[] args) {
		
		MyInterfaceImpl<String, Integer> my = null; 
		// null을 해주는 이유는 my는 지역변수, 변수는 초기화!!
//		my = new MyInterfaceImpl<String,Integer>(); 
		my = new MyInterfaceImpl<>(); // String,Interger 생략도 가능함
		
		System.out.println(my.method1("ten"));
		System.out.println(my.method2(10));
		
		
	}
}

