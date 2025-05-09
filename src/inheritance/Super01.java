package inheritance;

public class Super01 {
	public static void main(String args[]) {
		Ch3 d = new Ch3();
		System.out.println(d.getX());
		System.out.println(d.getChaX());
		d.write();
	}
}


class Pa3 {
	int x = 1000; 
	public void display() { 
		System.out.println("상위클래스 display()");
	}
	public int getX() {
		return x;
	}
}


class Ch3 extends Pa3 {
	int x = 2000; 
	
	Ch3(){
		super.x = 5000;		
	}

	public void display() {  
		System.out.println("하위클래스 display()");
	}

	void write() { 
		super.display();
		this.display();	
		System.out.println("super.x : " + super.x);
		System.out.println("this.x : " + x);
	}
	
	int getChaX() {
		return x;
	}
}






