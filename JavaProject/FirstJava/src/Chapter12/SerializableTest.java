package Chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		
		// 객체 저장
		Person person = new Person("King", 20);
		String msg = "안녕하세요";
		
		ObjectOutputStream outputStream = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("instanceDate.ser");
		
			outputStream = new ObjectOutputStream(fos);
			
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
			
			
			System.out.println("저장");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
