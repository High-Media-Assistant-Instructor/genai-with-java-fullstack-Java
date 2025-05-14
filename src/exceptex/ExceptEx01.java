package exceptex;

public class ExceptEx01 {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작 되었습니다.");
		int c;
		System.out.println("프로그램을 실행하는 중입니다.1");
		// try-catch 문 밖에서 에러가 발생되면 그대로 프로그램이 중단됨
		// c = 4 / 0;

		try {
			System.out.println("프로그램을 실행하는 중입니다.2");
			// try-catch 문 안에서 에러가 발생했기 때문에 catch문이 실행된다.
			// c = 4 / 0;
			System.out.println("프로그램을 실행하는 중입니다.3");
		}
		// ArithmeticException : 산술 연산 중 잘못된 연산이 발생할 때 던져지는 예외
		catch(ArithmeticException e) {

			System.out.println(
					"젯수(나누는 수)는 0이 될 수 없습니다."
					+ "\n0이상이 되도록 변경해주세요."
			);

			/**
			 * e.getMessage : 예외의 간단한 설명을 반환 (/ by zero)
			 * e.getCause : 다른 예외가 원인일때 예외의 원인을 반환 (null)
			 * System.out.println(e); : 예외의 전체 정보를 출력
			 */
			System.out.println(e.getMessage()+", "+ e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e);
		}

		System.out.println("프로그램이 정상 종료 되었습니다.");
	}

}
