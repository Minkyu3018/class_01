package Chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader in = null;
		String str = null;

		// Reader 객체생성
		try {
			in = new BufferedReader(new FileReader("d:\\Test\\test-text2.txt"));

			while (true) {
				// 읽기
				str = in.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);

			}

			System.out.println("읽기종료");

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
