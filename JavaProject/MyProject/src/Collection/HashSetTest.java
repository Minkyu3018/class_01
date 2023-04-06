package Collection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		
		set.add("손흥민");
		set.add("박지성");
		set.add("이강인");
		set.add("손흥민");
		set.add("이강인");

		System.out.println("요소의 개수 : " + set.size());
		System.out.println("-------------------------");

		for (String name : set) {
			System.out.println(set);
		}

		System.out.println("-----------------------");

		HashSet<Integer> number = new HashSet<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(10);
		number.add(20);

		number.add(20);
		number.add(20);
		number.add(20);
		number.add(20);
		
		for (Integer numbers : number) {
			System.out.println(numbers);
		}

	}

}
