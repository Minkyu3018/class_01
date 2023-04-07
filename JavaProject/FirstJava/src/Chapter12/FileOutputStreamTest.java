package Chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("D:\\Test\\test.txt");
			fout.write(65);
			fout.close(); // i.o 에서는 스트림 사용 후 반드시 닫아준다!
			System.out.println("파일에 데이터 쓰기 성공");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
