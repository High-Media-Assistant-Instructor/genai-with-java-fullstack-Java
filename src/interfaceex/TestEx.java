package interfaceex;

public class TestEx {

	public static void main(String[] args) {
		Test ts = new Test();	
		
//		if(PaTest.KIND.equals("사람"))
//			ts.trueKind();
//		else ts.falseKind();
		
		String nm = "동물";
		if(nm.equals(PaTest.KIND)){
			ts.trueKind();
		}else{
			ts.falseKind();
		}
	}

}
