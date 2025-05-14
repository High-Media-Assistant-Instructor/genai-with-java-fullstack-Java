package exceptex;

public class ExceptEx04 {
	public static void main(String[] args) {
		ExceptEx04 temp = new ExceptEx04();
		String[] strArr = {"1"};

		temp.temp(strArr);
	}

	public void temp (String[] args) {
		try {
//			해보기 : 
//			매개인자 1개 입력하고 실행하기 : 숫자로
//			매개인자 2개 입력하고 실행하기 : 숫자로, 젯수 0으로 입력하기
//			매개인자 String로 입력하고 실행하기
			System.out.println("args.length: "+args.length);
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println(" a = " + a + " b = " + b);
			System.out.println(" a를 b로 나눈 몫 = " + (a / b));
			System.out.println("나눗셈 수행");
			
		}
		// 0으로 나눌 때
		catch (ArithmeticException e) {
			
			System.out.println("==================================");
			System.out.println("산술 연산 오류 처리 루틴 : ");
			System.out.println(e + " 예외 발생");
			
		}
		// 인자가 1개 또는 0개 즉 배열의 길이가 1이하일때 실행
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("==================================");
			System.out.println("배열 범위 오류 처리 루틴");
			System.out.println(e + " 예외 발생");
		}
		// 문자열을 숫자로 변환할 수 없을떼
		catch (NumberFormatException e) {
			System.out.println("==================================");
			System.out.println("숫자 형식 오류 처리 루틴");
			System.out.println(e + " 예외 발생");
		}
		// 위에서 정의한 3가지 예외 사항이 아닌 다른 예외사항이 일어날 때
		catch (Exception e) {
			System.out.println("가장 최상위 에러(모든 에러) 처리 루틴");
		}
		// 무조건 실행
		finally {
			System.out.println("==================================");
			System.out.println("finally 블럭 수행");
		} //finally 종료 중괄호
	} //main메소드 종료 중괄호

} // class 종료 중괄호