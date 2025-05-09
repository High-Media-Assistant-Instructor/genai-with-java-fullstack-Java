package generic_000_none;

public class BoxExample {

	public static void main(String[] args) {
		// 자료형이 Box인 box 변수에 Box 기본생성자를 사용해서 참조값을 저장
		Box box = new Box();
		// box의 set 메소드를 사용해서 자료형이 String인 "홍길동" 전달
		box.set("홍길동");
		// box.get() 메소드는 자료형이 Object인 변수를 반환 String 타입의 저장하기 위해서 String으로 형변환 후의 저장
		String name = (String) box.get();
		// name을 반환
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		apple.setNum(100);
		System.out.println(apple.getNum());
	}
}
