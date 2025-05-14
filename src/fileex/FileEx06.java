package fileex;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx06 {

	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attribute = "";
			String size = "";

			if (files[i].isDirectory()) {
				attribute = "DIR";
			} else {
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}

			System.out.printf(
					"최종 수정일: %s , 파일속성: %3s , 용량: %6s바이트, 파일명: %s\n",
					df.format( new Date( f.lastModified() ) ), attribute, size, name
			);

		} //for문 종료 중괄호

		String[] listing = new File("C:\\jwork").list();
		for (String x : listing) {
			System.out.println("디렉토리 및 파일 목록 : " + x);
		}

	} //main메소드 종료 중괄호
	

} //클래스 종료 중괄호




