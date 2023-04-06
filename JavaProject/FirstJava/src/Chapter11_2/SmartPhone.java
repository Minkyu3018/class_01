package Chapter11_2;

import java.util.HashSet;
import java.util.Set;

public class SmartPhone implements Comparable<SmartPhone>{

	private String name;
	private String phoneNum;
	
	public SmartPhone(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getPhoneNum() {
		return phoneNum;
	}

	void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNum=" + phoneNum + "]";
	}

	@Override
	public int hashCode() {
		// 010-1234-5678 -> 0 1 2 3 4 5 6 7 8 9
		return this.phoneNum.charAt(phoneNum.length()-1) % 5 ;
	} // 0, 1, 2, 3, 4, 5

	
	
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if (obj != null && obj instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone) obj;
			result = phoneNum.equals(sp.getPhoneNum());
			
	}
		return super.equals(obj);
	
		
		
	}	
	
	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName())*-1;
	}

	public static void main(String[] args) {
		
		Set<SmartPhone> phones = new HashSet<>();
		
		phones.add(new SmartPhone("손흥민", "010-1234-5678"));
		phones.add(new SmartPhone("박지성", "010-3333-8888"));
		phones.add(new SmartPhone("이강인", "010-1234-5678"));
	
		for (SmartPhone sp : phones) {
			System.out.println(sp);
		}
	
//		phones.stream().sorted().forEach(System.out::println);
	}
}
