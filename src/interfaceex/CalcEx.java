package interfaceex;

public class CalcEx {

	public static void main(String[] args) {
		String s1 = "하하하";
		String s2 = new String("하하하");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		if(s1.equals(s2)) {
			System.out.println("true");
		}
		
//		Calc c = new CalcCha1();
//		c.add(5, "덧셈");
//		c.minus(5);
//		c.multi(5);
//		c.divi(3);
	}

}
