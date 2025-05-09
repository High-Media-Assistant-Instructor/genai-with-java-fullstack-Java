package inheritance;

public class Super02 {
	public static void main(String args[]) {
		Two super1 = new Two();
		Two super2 = new Two(10, 20);
		System.out.println("10의 제곱 : " + super2.d1);
		System.out.println("20의 제곱 : " + super2.d2);
	}
}


class One {
	int d1;
	int s;
	
	One(){
		System.out.println("One의 디폴트 생성자");
	}

	One(int s1) {
		System.out.println("One의 생성자");
		s = s1;
		d1 = s * s;
	}
}

class Two extends One {
	int d2;
	int t;
	
	Two(){
		this(10, 20);
		System.out.println("Two의 디폴트 생성자");
	}

	Two(int s1, int t1) {
		super(s1); 
		System.out.println("Two의 생성자");
		t = t1;
		d2 = t * t;
	}
}
