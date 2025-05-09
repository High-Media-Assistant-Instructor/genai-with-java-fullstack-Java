package generic_000_none;
public class Box {
	// 멤버필드 Object 타입을 저장하는 object
	private Object object;

	// 멤버필드 object 를 반환하는 메소드 get
	public Object get() {
		return object;
	}

	// 매개변수로 object 타입을 받아 멤버필드 object를 지정하는 메소드 set
	public void set(Object object) {
		this.object = object;
	}
}
