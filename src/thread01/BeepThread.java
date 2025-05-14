package thread01;
// Thread 클래스를 상속하여 run 메소드를 정의
public class BeepThread extends Thread {
	@Override
	public void run() {		
		for(int i=0; i<5; i++) {		
			System.out.println("딩");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

