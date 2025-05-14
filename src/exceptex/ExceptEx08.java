package exceptex;

public class ExceptEx08 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			System.out.println("try문 시작");
			findClass();
			System.out.println("try문 종료");
		} catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
			System.out.println("에러 사유: " + e);
		}
		System.out.println("프로그램 종료");
	}

	public static void findClass() throws ClassNotFoundException {
		System.out.println("findClass메소드 실행");
		/**
		 * Class.forName : 동적으로 클래스를 로딩할 떼 사용
		 * 문자열로 클래스 이름을 주면, 해당 클래스를 JVM 메모리에 로딩하고 Class 객체를 반환
		 */
		Class clazz = Class.forName("java.lang.String");
//		Class clazz = Class.forName("java.lang.WowClass");
		System.out.println(clazz);
	}
}
