package javautilex;
import java.util.Scanner;

public class ScannerEx00 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("0번: ");
		// sc.next()가 공백을 기준으로 문자를 저장한다 하더라도 콘솔 입력창은 한 줄 단위로 데이터를 저장하기 때문에 공백을 입력한다해도 콘솔 입력창이 끝나거나 하지 않는다.
		String s1 = sc.next(); //끝 - 공백, 공백 X
		// 엔터를 침으로써 문자열의 공백 뒤의 문자들은 어떤식으로 들어와있을지 모르기때문에 입력 버퍼를 초기화 시켜줘야 한다.
		sc.nextLine();

		// sc.nextLine()은 엔터를 기준으로 문자를 저장하니 입력창에 입력한 모든 문자열을 저장한다.
		System.out.print(s1 + "\n1번: ");
		s1 = sc.nextLine(); //끝 - 엔터, 공백 O 

		// sc.next() : 입력창에 들어온 문자열이 정수형태로 저장 정수형태가 아닐 경우 오류 발생 공백을 기준으로 문자열 입력받음
		System.out.print(s1 + "\n2번: ");
		int i = sc.nextInt(); //끝 - 공백,  공백 X
		System.out.print(i + "\n3: ");

		s1 = sc.next(); //끝 - 공백,  공백 X
		System.out.print(s1 + "\n4: ");

		s1 = sc.next(); //끝 - 공백,  공백 X
		System.out.println(s1);
	}
}