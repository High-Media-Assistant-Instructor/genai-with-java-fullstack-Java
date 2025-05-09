package abstractex;

// 인터페이스 PAbs
interface PAbs{
	// 모든 메소드는 public abstract
	void i();
	void j();
	void k();
}

// 추상클래스인 Abs
abstract class Abs {
	// 정의가 있는 일반메소드 => 상속받아서 그대로 사용 가능
	void a() { System.out.println("일반-a메소드"); }
	public void d() {};

	// 추상메소드 => 서브 클래스가 반드시 구현해야 함
	public abstract void b();
	public abstract void c();
}

// 추상클래스인 Abs를 상속받고 인터페이스인 PAbs를 구현하는 클래스 Cbs
class Cbs extends Abs implements PAbs {

	// 인터페이스 PAbs의 추상 메소드인 i를 구현한
	@Override
	public void i() {
		System.out.println("인터페이스인 PAbs의 i 메소드 재정의");
	}

	@Override
	public void j() {
		System.out.println("인터페이스인 PAbs의 j 메소드 재정의");
	}

	@Override
	public void k() {
		System.out.println("인터페이스인 PAbs의 k 메소드 재정의");
	}

	@Override
	public void b() {
		System.out.println("추상클래스인 Abs의 추상메소드인 b 메소드 재정의");
	}

	@Override
	public void c() {
		System.out.println("추상클래스인 Abs의 추상메소드인 c 메소드 재정의");
	}
}

// Main 메서드가 있는 메인 클래스 AbstractEx04
public class AbstractEx04 {
	public static void main(String[] args) {
		// 자료형이 Abs라 Abs에서 정의한 메소드만 사용 가능
		Abs ca = new Cbs();
		ca.a();
		ca.b();
		ca.c();
		ca.d();

		// 자료형이 Cbs라 Cbs가 상속하고 구현하는 모든 메서드들을 사용 가능함
		Cbs ca1 = new Cbs();
		ca1.i();
		ca1.j();
		ca1.k();
		ca1.a();
		ca1.b();
		ca1.c();
		ca1.d();

		// 자료형이 PAbs라 PAbs에서 정의한 메소드만 사용 가능
		PAbs ca2 = new Cbs();
		ca2.i();
		ca2.j();
		ca2.k();
	}
}
