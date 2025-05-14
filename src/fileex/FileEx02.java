package fileex;

import java.io.*;

public class FileEx02 {
	public static void main(String[] args) throws IOException {

//		System의 Properties props에 key문자열과 기능 확인 가능
		String userName = System.getProperty("user.name");
		System.out.println("user.name: "+userName);

		String userHome = System.getProperty("user.home");
		System.out.println("user.home: "+userHome);

		String userDir = System.getProperty("user.dir");
		System.out.println("user.dir: "+userDir);

		File file = new File(userDir+"/test.txt");
		if (!file.exists())
			file.createNewFile();

		FileWriter fw = new FileWriter(file);
		char[] buf = { 'm', 'e', 's', 's', 'a', 'g', 'e'};
		for (int i = 0; i < buf.length; i++)
			fw.write(buf[i]);


//		 \r : 캐리지리턴, 그 줄의 처음으로 이동하라는 의미 (아스키코드: 13번)
//		 \n : 한 줄 바꿈의 의미 (new Line=> 아스키코드: 10번)
//		 \r\n : 개행문자 , 다음 줄의 처음으로 이동하라는 의미
//		한 칸 공백(=space) : 아스키코드: 32번
		fw.write("이 줄의 마지막에서 개행문자 \r\n");
		fw.close();

		FileReader fr = new FileReader(file);
		int EOF = -1;  // EOF(End Of File의 약어)
		int c;

//		fr.read() : 파일의 글자 하나하나를 유니코드,아스키코드 값으로 가져옴.
		while ((c = fr.read()) != EOF) {
			System.out.print("c: ");
			System.out.println(c);

			System.out.print("(char)c: ");
			System.out.print((char) c);
			System.out.println("\n===========\n");
		}
		fr.close();
	}
}




