package exceptex;

public class ExceptEx03 {

	public static void main(String[] args) {
		String c = null; 
//		System.out.println(" 문자열 값은 :  " + c.toString());

		try {
			// null 값은 String으로 변환이 불가능함 NullPointerException 발생
 			System.out.println(" 문자열 값은 :  " + c.toString());
		} catch (NullPointerException e) {
			System.out.println("예외가 발생하여 Exception 객체가 잡음");
			System.out.println(e);
			System.out.println(e.getMessage()+", "+ e.getCause());
		}
		// 예외 발생 여부와 관계없이 항상 실행
		finally {
			System.out.println("finally 블럭 수행");
		}
		System.out.println("정상 종료");
	}

}
