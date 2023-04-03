package Chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		// append 
//		sb.append('~'); // "Hello~"
//		sb.append("  JAVA"); // Hello~ JAVA"
		
		// 체인(붙혀나가기)
		sb.append('~').append("  JAVA");
		System.out.println(sb);
		
		
		// 지우기, 지정 자리 숫자부터 지정자리 숫자까지(-1)
		sb.delete(5, 7); // 5~ (7 - 1) 지우기
		System.out.println(sb); // 출력값 : Hello JAVA
		
		// insert 끼워넣기
		sb.insert(5, '~');  // Hello~ JAVA
		System.out.println(sb);
		sb.insert(6, "~! ");
		System.out.println(sb); // Hello~~!  JAVA
		sb.insert(sb.length(), false);
		System.out.println(sb); // Hello~~!  JAVAfalse
		
		// reverse
		sb.reverse();
		System.out.println(sb);
		
		String result = new String(sb);
		
		System.out.println(result);
		
	}
}
