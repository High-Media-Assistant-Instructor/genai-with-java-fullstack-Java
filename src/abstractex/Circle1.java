package abstractex;

class Circle1 extends Shape1 {
	public int r = 5;

	public double area() {
		System.out.println("Circle1 area()메소드");
		res = r * r * Math.PI; //3.14159265358979323846
		return res;
	}
}
