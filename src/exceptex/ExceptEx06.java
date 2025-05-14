package exceptex;

public class ExceptEx06 {

	public static void main(String[] args) {
		try {
			String c = null;
			System.out.println(" 문자열 값 :  " + c.toString());
		} catch (Exception e) {
			
			System.out.println(" >> 예외처리 구문 <<");
			System.out.println(" >> e << ");
			// java.lang.NullPointerException: Cannot invoke "String.toString()" because "c" is null
			System.out.println(e);
			
			System.out.println(" >> e.toString() << ");
			// java.lang.NullPointerException: Cannot invoke "String.toString()" because "c" is null
			System.out.println(e.toString());
			
			// 발생한 예외 클래스의 인스턴스에 저장된 메시지 얻어오기
			System.out.println(" >> e.getMessage() <<");
			// Cannot invoke "String.toString()" because "c" is null
			System.out.println(e.getMessage());
			
			// 예외 발생 당시의 호출 스택에 있는 메소드의 정보와 예외 메시지를 화면에 출력
			System.out.println(" >> e.printStackTrace() <<");
			// java.lang.NullPointerException: Cannot invoke "String.toString()" because "c" is null
			//	at exceptex.ExceptEx06.main(ExceptEx06.java:8)
			e.printStackTrace(System.out);
		}finally{
			System.out.println("finally처리");
		}
		System.out.println("완료");
		
	}//main메소드 종료 중괄호

}//class 종료 중괄호



