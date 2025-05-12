package javautilex;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력을 해주세요.");

		// Scanner 객체로 들어온 값이 정수 값이라면
		if(sc.hasNextInt()) {
			// Scanner 객체 그대로 출력
			System.out.println("1번["+sc.nextInt()+"] : 정수값입니다.");
		}
		// Scanner 객체로 들어온 값이 정수 값이 아니라면
		else {
			// 엔터를 기준으로 저장
			String str = sc.nextLine();

			// 객체의 공백이 포함된다면
			if(str.contains(" ")) { //" " => 공백한 칸 입니다.
				System.out.println("2번[ "+str+" ] : 공백을 포함한 문자열 값입니다.");
			}
			// 객체의 공백이 없다면
			else {
				System.out.println("3번[ "+str+" ] : 공백이 없는 단어 단위의 문자열 값입니다.");
			}
		}
	}

}
