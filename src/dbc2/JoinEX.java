package dbc2;

import java.sql.*;  // JDBC 관련 클래스 임포트
import java.util.Scanner;  // 사용자 입력을 위한 Scanner 클래스 임포트

public class JoinEX {
	/**
	 * 유효성검사: 영어 대소문자와 숫자만 입력 가능한지 체크하는 메소드
	 * ASCII 코드값을 기준으로 허용 범위를 검사
	 * @param str 검사할 문자열
	 * @return 허용되지 않는 문자가 있으면 1, 모두 허용되면 0 반환
	 */
	public static int cntResult(String str) {
		int cnt = 0;
		for(int i=0; i < str.length() ; i++) {
			int aciiCode = (int) str.charAt(i);
			// ASCII 48 미만은 숫자, 영문자가 아님
			if(aciiCode < 48 ) {
				cnt++;
				break;
			}
			// ASCII 57-65 사이는 숫자와 영문자 대문자 사이의 특수문자
			if(aciiCode >57 && aciiCode < 65){
				cnt++;
				break;
			}
			// ASCII 90-97 사이는 영문 대문자와 소문자 사이의 특수문자
			if(aciiCode > 90 && aciiCode < 97){
				cnt++;
				break;
			}
			// ASCII 122 초과는 영문자가 아님
			if(aciiCode > 122){
				cnt++;
				break;
			}
		}

		return cnt;
	}

	/**
	 * 유효성검사: 문자열 길이 제한 체크 메소드
	 * @param str 검사할 문자열
	 * @param limit 최대 허용 길이
	 * @return 제한 길이를 초과하면 1, 아니면 0 반환
	 */
	public static int strLenChk(String str, int limit) {
		int cnt = 0;
		if(str.length() > limit) {
			System.out.printf("최대 %d자 이하로 입력하셔야 합니다.\n", limit);
			cnt++;
		}
		return cnt;
	}

	/**
	 * 유효성검사: 한글 입력 체크 메소드
	 * 자음이나 모음만 단독으로 입력된 경우를 검사 (완성된 한글만 허용)
	 * @param str 검사할 문자열
	 * @return 자음/모음만 있으면 1, 완성된 한글이면 0 반환
	 */
	public static int hangleChk(String str) {
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			int code = (int) str.charAt(i);
			// 유니코드 범위 12593-12643은 한글 자음/모음만 해당
			if(code >= 12593 && code <= 12643) {
				System.out.println("한글은 자음만 또는 모음만 입력하실 수 없습니다.");
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// JDBC 객체 선언
		Connection conn = null;  // 데이터베이스 연결 객체
		PreparedStatement ps = null;  // SQL 실행 객체

		try {
			// 1. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. 데이터베이스 연결
			// 주의: URL에 오타가 있습니다. "jdbc:mysql://localhost:3306:hi" -> "jdbc:mysql://localhost:3306/hi"로 수정 필요
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306:hi", "root", "1111"
			);

			// 3. SQL 쿼리 준비 (회원 정보 삽입)
			String sql ="insert into member (mid, mpw, mnm, mph, mzip, maddr) "+
					"values (?, ? ,?, ? ,?, ?)";
			ps = conn.prepareStatement(sql);

			// 4. 사용자 입력 및 SQL 실행
			Scanner sc = new Scanner(System.in);
			info:  // 라벨 선언 (중첩 루프 제어용)
			while(true) {
				System.out.println("회원가입 메뉴");
				System.out.println("다음 메뉴 중 선택하세요.");
				System.out.println("1.회원가입 2. 시스템종료");

				int ys = sc.nextInt();
				if(ys == 1) {
					// 아이디 입력 및 유효성 검사
					while(true) {
						System.out.print("아이디(영어대소문자,숫자포함20자이내)>>");
						String mid = sc.next();

						// 영어/숫자만 포함되고 20자 이내인지 검사
						if(cntResult(mid) == 0 && strLenChk(mid, 20) == 0) {
							ps.setString(1, mid);  // 쿼리의 첫 번째 파라미터에 아이디 설정
							break;
						}else {
							System.out.println("영어대소문자, 숫자만 입력하실 수 있습니다.");
						}
					}

					// 비밀번호 입력 및 유효성 검사
					while(true) {
						System.out.print("비밀번호(영어대소문자,숫자포함20자이내)>>");
						String mpw = sc.next();
						if(cntResult(mpw) == 0  && strLenChk(mpw, 20) == 0) {
							ps.setString(2, mpw);  // 쿼리의 두 번째 파라미터에 비밀번호 설정
							break;
						}else {
							System.out.println("영어대소문자, 숫자만 입력하실 수 있습니다.");
						}
					}

					// next() 메소드 사용 후 버퍼에 남은 엔터키 처리
					sc.nextLine();

					// 이름 입력 및 유효성 검사
					while(true) {
						System.out.print("이름입력>>");
						String mnm = sc.nextLine();  // 공백 포함 이름 입력 가능
						if(strLenChk(mnm, 200) == 0 && hangleChk(mnm) == 0 ) {
							ps.setString(3, mnm);  // 쿼리의 세 번째 파라미터에 이름 설정
							break;
						}
					}

					// 전화번호 입력 및 유효성 검사
					while(true) {
						System.out.print("전화번호입력(예: 01012341234)>>");
						String mph = sc.next();
						if(strLenChk(mph, 11) == 0) {
							ps.setString(4, mph);  // 쿼리의 네 번째 파라미터에 전화번호 설정
							break;
						}
					}

					// 우편번호 입력 (선택사항)
					System.out.print("우편번호입력(예: 12345)>>");
					System.out.println("입력여부 선택: 1.예  2.아니오");
					int yes_no = sc.nextInt();
					if(yes_no == 1){
						while(true) {
							System.out.print("우편번호입력>>");
							String mzip = sc.next();
							if(strLenChk(mzip, 5) == 0) {
								ps.setString(5, mzip);  // 쿼리의 다섯 번째 파라미터에 우편번호 설정
								break;
							}
						}
					}else {
						ps.setString(5, "");  // 우편번호 미입력 시 빈 문자열 설정
						System.out.println();
					}

					// next() 메소드 사용 후 버퍼에 남은 엔터키 처리
					sc.nextLine();

					// 주소 입력 (선택사항)
					System.out.print("주소 입력>>");
					System.out.println("입력여부 선택: 1.예  2.아니오");
					yes_no = sc.nextInt();
					if(yes_no == 1){
						sc.nextLine();  // nextInt() 후 버퍼에 남은 엔터키 처리
						while(true) {
							System.out.print("주소 입력>>");
							String maddr = sc.nextLine();  // 공백 포함 주소 입력 가능
							if(strLenChk(maddr, 200) == 0) {
								ps.setString(6, maddr);  // 쿼리의 여섯 번째 파라미터에 주소 설정
								break;
							}
						}
					}else {
						ps.setString(6, "");  // 주소 미입력 시 빈 문자열 설정
					}

					// 입력 완료 후 처리 메뉴
					while(true) {
						System.out.println("다음 중 선택하세요.");
						System.out.println("1.입력완료 2.다시입력 3.시스템종료");
						int result = sc.nextInt();
						switch(result) {
							case 1 :
								// SQL 실행 및 결과 확인
								int rowCount = ps.executeUpdate();  // INSERT 쿼리 실행
								if(rowCount > 0) System.out.println("회원가입 완료");
								else System.out.println("회원가입 실패");
								continue info;  // 최상위 메뉴로 이동
							case 2 :
								System.out.println("입력했던 데이터는 모두 초기화 됩니다.");
								continue info;  // 최상위 메뉴로 이동
							case 3 :
								break info;  // info 라벨이 붙은 루프 종료
							default :
								System.out.println("잘못된 값을 입력하셨습니다.");
								continue;  // 현재 루프 재실행
						}
					}

				}else {
					break;  // 메인 루프 종료
				}

			}

			System.out.println("시스템이 종료되었습니다.");

		}catch(Exception e) {
			// 예외 처리
			System.out.println("드라이버 연결실패 또는 SQL명령 오류");
			e.printStackTrace();  // 추가: 오류 상세 내용 출력
		}finally {
			// 5. 리소스 해제 (커넥션, PreparedStatement 객체 닫기)
			try {
				if(ps != null) ps.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				System.out.println("객체 닫기 오류");
			}
		}
	}
}
