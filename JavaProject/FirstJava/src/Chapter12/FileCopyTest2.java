package Chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		
		// 원본파일 : 파일 데이터를 읽어와야 한다.
		// 복사본 : 원본파일의 데이터를 써야 한다.
		
		
		try {
			
			InputStream in = new FileInputStream("D:\\Test\\test1.txt");
			OutputStream out = new FileOutputStream("D:\\Test\\test1copy.txt");
		
			int byteData = 0;
			
			while (true) {
				byteData = in.read();
				if(byteData==-1) {
					break;
				}
				out.write(byteData);
			}
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다.");
		
				
		} catch (IOException e) {
			e.printStackTrace();
		
		}
	
		
	}
	
}
