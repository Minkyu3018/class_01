package Chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableTest2 {

	public static void main(String[] args) {
		
		ObjectInputStream inputStream = null;
		
		FileInputStream in;
		try {
			in = new FileInputStream("instanceData.ser");
			inputStream = new ObjectInputStream(in);
			Person p = (Person) inputStream.readObject();
			String newStr = (String) inputStream.readObject();
		
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
