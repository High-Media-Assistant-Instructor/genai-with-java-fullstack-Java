package interfaceex;

class A1 implements A {
	int a = 10;
	static final int CONS = 2;
	
	void pmd() {
		System.out.println("A1인터페이스 안의 pmd: "+CONS);
	}
	
	public void display(String s) {
		System.out.println("display 메소드 구현 " + s);
	}
	
	public void imd() {  System.out.println("imd메소드 재정의"); }
	
	static int stmd(int c) { return CONS + c; }
} 
