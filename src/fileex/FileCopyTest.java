package fileex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try{
			// 바이트 단위로 파일을 읽는 스트림
			FileInputStream fis = new FileInputStream("F:/Repository/genai-with-java-fullstack-Java/src/fileex/Exam/file.zip");
			// 바이트 단위로 파일을 쓰는 스트림
			FileOutputStream fos = new FileOutputStream("copy.zip");
			millisecond = System.currentTimeMillis(); //시스템의 현재 시간을 긴정수값으로 표현해주는 기능
			int i;
			// fis.read() 한 값이 -1이 아닐때 까지
			while( (i = fis.read()) != -1){
				fos.write(i);
			}			
			millisecond = System.currentTimeMillis() - millisecond;
			
			fos.close();			
			fis.close();			
		}catch(IOException e) {
			e.printStackTrace();
		}		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}


