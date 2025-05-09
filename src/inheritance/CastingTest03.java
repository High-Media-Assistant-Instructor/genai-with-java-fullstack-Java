package inheritance;

class PUnit { int u = 1; }
class Unit1 extends PUnit { int u1 = 2; }
class Unit2 extends Unit1 { int u2 = 3; }
class Unit3 extends Unit2 { int u3 = 5; }

public class CastingTest03 {
	public static void main(String[] args) {
		Unit2 unit1 = new Unit2();
		Unit3 unit2 = new Unit3();
		
		int result = unit1.u + unit1.u1 + unit1.u2;
		int result1 = unit2.u + unit2.u1 + unit2.u2 
			+ unit2.u3;
		System.out.println("1번: " + unit1.u + " + "
		+ unit1.u1 + " + " 
		+ unit1.u2 + " = " + result);
		System.out.println("2번: " + unit2.u + " + "
		+ unit2.u1 + " + " 
		+ unit2.u2 + " + " + unit2.u3 + " = " + result1);
		System.out.println("===============================");
		
		System.out.println("0번: "+ (unit1 instanceof PUnit));
		System.out.println("1번: "+ (unit1 instanceof Unit1));
		System.out.println("2번: "+ (unit1 instanceof Unit2));
		System.out.println("2번: "+ (unit1 instanceof Unit3));
		System.out.println("3번: "+ (unit2 instanceof PUnit));
		System.out.println("4번: "+ (unit2 instanceof Unit1));
		System.out.println("5번: "+ (unit2 instanceof Unit2));
		System.out.println("6번: "+ (unit2 instanceof Unit3));
	}
}








