package fileex;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) throws IOException {
//		디렉토리 경로
		String path = "C:/upload";
//		String path = "C:/upload/file.txt";
		File file = new File(path);

//		mkdirs() : 파일이 아닌 디렉토리 생성 메소드
		if(!file.isDirectory()) { file.mkdirs(); }
//		if(!file.exists()) { file.mkdirs(); }

//		파일 경로 완성
		path = path+ "/file.txt";


//		빈 파일 생성방법 1
		file = new File(path);
		file.createNewFile();


//		빈 파일 생성방법2
//		FileWriter fw = new FileWriter(path, true);
//		fw.close(); //close에는 flush가 숨겨져있다.


//		FileWriter fw = new FileWriter(path, true);
//		fw.write("FileWriter는 한글로된 " + "\n");
//		fw.write("문자열을 바로 출력할 수 있다." + "\n");
//		fw.flush();
////		fw.close(); //close에는 flush가 숨겨져있다.

		System.out.println("파일에 저장되었습니다.");
	}
}
