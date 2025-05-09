package interfaceex;

public interface A {
	final int CONS = 5;

	// 추상메소드 : 구현 클래스에서 재정의 필요
	void imd();
	public void display(String s);

	// private 메소드 : interface 내부에서만 사용 가능
	private void pmd() { 
		System.out.println("A인터페이스 안의 pmd");
	}

	//원래 public default임. 접근제어자의 default가 아닌 몸체를 가질 수 있는 메소드임.
	// 즉 원래 public default를 가지고 있는 메소드들은 무조건 Override 해야 되지만 얘는 할 필요 없음
	default void dfmd(String str) {
		System.out.println(
				"A인터페이스 안의 dfmd메소드의 str변수 값: " 
				+ str + "와 CONS의 값: " + CONS
		);
	}

	// static 메소드 interface를 구현하지 않고 직접 호출 가능
	static int stmd(int c) {
		return CONS+c;
	}
	
}



