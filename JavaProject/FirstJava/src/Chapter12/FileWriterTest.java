package Chapter12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		String str = "String";
		char ch = 'A';
		char[] charArr = { 'B', 'C' };

		try {
			FileWriter out = new FileWriter("D:\\Test\\test-text.txt");

			out.write(str);
			out.write(ch);
			out.write(charArr);

			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일에 문자열을 입력");
	}

}
