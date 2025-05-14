package fileex;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileEX03 {

	public static void main(String args[]) throws IOException {
//		 바이트(숫자형) 스트림 파일을 출력하기 위한 객체 fos 생성
		FileOutputStream fos = new FileOutputStream("stream1.txt");

//		아스키 코드값으로 쓰기
		for (int i = 65; i < (65+26); i++) {
			fos.write(i);
		}
		fos.write('a'); //아스키코드값으로 치환됨 (유니코드는 바로 입력 못함)

//		바이트스트림은 유니코드를 바로 넣지 못하므로 byte화 시켜서 넣어주어야 함.
		String koreanChar = "가"; //유니코드 \uAC00 => 44032(10진수)
		byte[] bytes = koreanChar.getBytes(StandardCharsets.UTF_8);
		fos.write(bytes);

		fos.close();
		System.out.println("ByteStreamFile을 생성");

		FileWriter fw = new FileWriter("data1.txt");
//		아스키코드값으로 쓰기
		fw.write(48);
		fw.write(97);

//		char로 쓰기
		fw.write('A');

//		String으로 쓰기
		fw.write("가나다");
		fw.close();
		System.out.println("FileWriter을 생성");

//		바이트 스트림 입력을 위한 객체 fis 생성
		System.out.println("ByteStream을 File로부터 입력");
		FileInputStream fis = new FileInputStream("stream1.txt");

//		유니코드 데이터는 못 읽어오기 때문에 바이트화 하여 가져오기
		bytes = fis.readAllBytes(); // Java 9 이상
		String result = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(result);
		fis.close();

//		FileReader fis = new FileReader("data1.txt");
//		//FileReader fis = new FileReader("stream1.txt");
//
//		int i;
//		while ((i = fis.read()) != -1) {
//			System.out.println((char) i);
//		}
//		System.out.println("FileWriter데이터를 File로부터 입력");
//		fis.close();
	}

}
