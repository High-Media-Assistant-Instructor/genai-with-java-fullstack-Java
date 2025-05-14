package fileex;

import java.io.*;

public class FileEx00 {

	public static void main(String args[]) throws IOException{
//		\n => 줄바꿈 이스케이프문자로 1칸 차지
		String source = "하늘을 우러러 한 점 부끄러움이 없기를\n"
				+ " 잎새에 이는 바람에도 나는 괴로워했다.\n";
//		String source = "하하하\n";
		System.out.println("source문자열 길이: " + source.length());

/*
		파일경로 없이 지정하면 프로젝트 경로를 root경로로 자동인식함
		따라서 C:\ijwork\first\data1.txt 경로에 파일로 생성됨.
		매개인자값이 한 개이면 파일 내용 덮어쓰기, append값이 false가 기본값
		new FileWriter("data1.txt") => 기존파일 존재하면 덮어쓰기, 없으면 생성하기
*/
		FileWriter fw = new FileWriter("data1.txt");
		fw.write(source);
		fw.close();  //반드시 close할 것!!!

		char[] intxt = new char[source.length()];
/*
		복사할객체명.getChars(
			복사할객체의 시작인덱스번호(int),
			복사할객체의 끝 인덱스번호(입력값-1 : int),
			복사해서 붙여넣기할 객체명,
			붙여넣을 객체의 시작 위치 인덱스 번호(int)
		);
*/
		source.getChars(0, source.length(), intxt, 0);
//		source.getChars(6, 20, intxt, 5);

/*
		FileWriter("파일주소", append여부);
		"파일주소" : "파일디렉토리경로/../파일명.확장자명" 형식으로 기술
		append여부 : false가 기본값(덮어쓰기), true(맨 뒤에 추가)
 */
		FileWriter fw1 = new FileWriter("data2.txt", true);
		fw1.write(intxt);
		fw1.close();

	}

}








