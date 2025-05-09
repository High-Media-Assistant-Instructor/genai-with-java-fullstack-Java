package generic_001_yes;

/**
 * 제네릭 클래스 Box<T>
 * @param <T>
 *     <T> : 타입 매개변수
 *     T : 임의의 타입
 *     실제 사용할 때 사용할 구체적입 타입을 지정한다.
 */
public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
