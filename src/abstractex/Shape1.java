package abstractex;

abstract class Shape1 {
	public double res = 0;
	public abstract double area();
	public void printArea() {
		System.out.println("면적은 " + res);
	}
}