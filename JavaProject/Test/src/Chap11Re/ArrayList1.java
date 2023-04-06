package Chap11Re;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
	// 기본길이(용량, capacity)가 10인 ArrayList를 생성
	ArrayList list1 = new ArrayList(10);
	// ArrayList에는 객체만 저장가능
	// autoboxing에 의해 기본형이 참조형으로 자동변환
	
	list1.add(new Integer(5));
	list1.add(new Integer(4));
	list1.add(new Integer(2));
	list1.add(new Integer(0));
	list1.add(new Integer(1));
	list1.add(new Integer(3));
	
	ArrayList list2 = new ArrayList(list1.subList(1, 4));
	print(list1, list2);
	
	
	list2.add("B");
	list2.add("C");
	list2.add("A");
	print(list1, list2);
	
	list2.set(3, "BB");
	print(list1, list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}
