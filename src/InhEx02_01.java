//package inheritance;
//
//class AA {
//	int i;
//	int j;
//
//	public void setij(int x, int y) {
//		i = x;
//		j = y;
//	}
//}
//
//class BB extends AA {
//	int total;
//
//	public void sum() {
//		total = i + j;
//	}
//}
//
//public class InhEx01 {
//	public static void main(String args[]) {
//		BB subOb = new BB();
//
//		subOb.setij(10, 12);
//		subOb.sum();
//		System.out.println("합계 : " + subOb.total);
//	}
//	package inheritance;
//
//
//public class InhEx02_01 {
//	public static void main(String[] args) {
//		C c = new C();
//		c.md();
//		c.md1();
//		//업케스팅- 하위클래스(=서브클래스=자식클래스)자료형이 상위클래스로 변환되는 것
//		P c1 = new C();  //pa - cha케이스
//		c1.md();
//		c1.md1();
//	}
//}
//
//class P {
//	void md() {
//		System.out.println("Pa의 md메소드");
//	}
//}
//
//class C extends P {
//
//	public void md() {
//		System.out.println("Cha의 md메소드");
//	}
//
//	public void md1() {
//		System.out.println("md1()메소드 호출");
//	}
//}
//}
