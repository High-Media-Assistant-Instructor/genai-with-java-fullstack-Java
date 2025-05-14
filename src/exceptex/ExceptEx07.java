package exceptex;

public class ExceptEx07 {

	public static void main(String[] args) {
		System.out.println("메인메소드 실행\n");

//		System.out.println("method1()메소드 실행 전");
//		method1();
//		System.out.println("method1()메소드 실행 후\n");

		try  {
			System.out.println("main의 try-catch 구문에서 try 실행");
			System.out.println("method1()메소드 실행 전");
			method1();
			System.out.println("method1()메소드 실행 후\n");

		} catch (Exception e)	{
			System.out.println("main의 try-catch 구문에서 catch 실행");
			System.out.println("main 에서 예외 처리");
			System.out.println(e.getMessage());
		}
		System.out.println("종료");
	}

	static void method1() {
		System.out.println("method1메소드 실행");
		try {
			System.out.println("method1의 try-catch 구문에서 try 실행");
			throw new Exception("예외 발생111"); // 예외를 고의로 발생시킴
		} catch (Exception e) {
			System.out.println("method1의 try-catch 구문에서 catch 실행");
			System.out.println("method1메소드 내 예외캐치");
			e.printStackTrace();
		}
	}

//	static void method1() throws Exception {
//		System.out.println("method1메소드 실행");
//		throw new Exception("예외 발생222"); // 예외를 고의로 발생시킴
//	}

}














