package thread04;

public class User1 extends Thread {	
	MyThread mt;
	
	public void run() {
		System.out.println("User1스레드 시작");
		try {
			mt.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for(int i=0; i <5 ; i++) {
			System.out.println("동");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

