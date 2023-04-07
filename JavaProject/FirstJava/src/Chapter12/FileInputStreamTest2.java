package Chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("D:\\Test\\test1.txt");
		
			int i = 0;
			while(true) {
				i = fin.read(); // 읽어올 데이터가 없다면 -1을 반환
				if(i==-1) {
					break;
				}
				System.out.print((char)i);
			}
			
			System.out.println("------------------");
			
			fin.close();
			System.out.println("파일의 데이터를 읽어왔습니다.");
		
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
