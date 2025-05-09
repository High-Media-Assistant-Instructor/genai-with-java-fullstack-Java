package abstractex;

class Rectangle extends Shape1 {
	public int w = 10, h = 10;

	public double area() {
		System.out.println("Rectangle area()메소드");
		res = w * h;
		return res;
	}
}