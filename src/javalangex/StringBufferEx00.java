package javalangex;

public class StringBufferEx00 {

	public static void main(String[] args) {
		/**
		 * String은 불변이라서 기존 객체를 수정하지 않고 새로운 객체를 생성
		 * String은 문자열을 바꿀 때마다 새로운 객체를 생성하므로 주소가 계속 바뀐다.
		 */
		String str = new String("Java");
		System.out.println("str 문자열 주소1: "+ System.identityHashCode(str));
		
		str = str + " 수업" ;
		System.out.println("str 문자열 주소2: "+ System.identityHashCode(str));
		
		str = str + " 시간" ;
		System.out.println("str 문자열 주소3: "+ System.identityHashCode(str) + "\n");

		/**
		 * StringBuffer는 가변 객체이므로 주소가 변하지 않는다.
		 * StringBuffer는 문자열을 수정해도 객체가 재사용되므로 주소가 그대로 고정된다.
		 */
		StringBuffer strb = new StringBuffer("");
		// strb = "가나다라마바사"; // 해당하는 방식으로는 StringBuffer의 값을 변경할 수 없다.
		System.out.println("[원본문자열] : " + strb);
		System.out.println("strb 문자열 주소1: "+ System.identityHashCode(strb));
		System.out.println("길이1: " + strb.length());
		
		strb.append("Java 수업");
		System.out.println("strb 문자열 주소2: "+ System.identityHashCode(strb));		
		System.out.println(strb);
		System.out.println("길이2: " + strb.length());

		strb = strb.append(" 수업 수업 수업");
		System.out.println("strb 문자열 주소3: "+ System.identityHashCode(strb));		
		System.out.println(strb);
		System.out.println("길이3: " + strb.length());
		
		strb = strb.append(" 수업");
		System.out.println("strb 문자열 주소4: "+ System.identityHashCode(strb));		
		System.out.println(strb);
		System.out.println("길이4: " + strb.length());
		
	}

}
