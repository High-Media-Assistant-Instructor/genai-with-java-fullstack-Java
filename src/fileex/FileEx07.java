package fileex;

import java.io.*;

public class FileEx07 {
	/**
	 * 사용자가 시스템 콘솔창에 입력한 문자열들을
	 * utf-8형식과 ms949형식으로 각각 저장후
	 * ms949 형식으로 저장된 파일을 읽어와서 다시 출력하는 코드
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// 파일 출력용
		FileOutputStream fos1 = new FileOutputStream("F:/Repository/genai-with-java-fullstack-Java/out_utf8.txt", true);
		FileOutputStream fos2 = new FileOutputStream("F:/Repository/genai-with-java-fullstack-Java/out_ansi.csv");
		
		//ANSI계열 인코딩 유형 - ms949 : 확장완성형
		//한글 깨짐의 보완하려면 ms949를 사용하는 것이 좋다.
		//unicode 기반의 인코딩 유형 - utf-8 : 조합형
		OutputStreamWriter osw1 = new OutputStreamWriter(fos1, "utf-8");
		OutputStreamWriter osw2 = new OutputStreamWriter(fos2, "ms949"); 

		int c;

		System.out.println(
				"아무 내용이나 입력하세요. 꼭 엔터를 해 주어야만 글이 입력됩니다."
			  + "\n종료를 원하시면 ctrl + d를 눌러주세요"
		);

		InputStreamReader isr = new InputStreamReader(System.in);
		while ((c = isr.read()) != -1) {
			osw1.write(c);
			osw2.write(c);
		}

		System.out.println("작업 완료\n");
		
		//닫을 때는 꼭 역순으로 닫아준다.
		isr.close();
		osw1.close();
		osw2.close();
		fos1.close();
		fos2.close();

		FileInputStream fis = new FileInputStream("F:/Repository/genai-with-java-fullstack-Java/out_ansi.csv");
		isr = new InputStreamReader(fis, "ms949");

		c = 0;

		while ((c = isr.read()) != -1) {
			System.out.print((char) c);
		}

		System.out.println();
		System.out.println("출력 끝");

		isr.close();
		fis.close();
	}

}








