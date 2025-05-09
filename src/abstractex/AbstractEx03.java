package abstractex;

public class AbstractEx03 {
	public static void main(String[] args) {
		Shape1 ref = null;
		ref = new Circle1();
		System.out.println(ref.res);
		System.out.println(ref.area());
		ref.printArea();
		ref = new Rectangle(); 
		ref.area();
		ref.printArea();
	}
}


