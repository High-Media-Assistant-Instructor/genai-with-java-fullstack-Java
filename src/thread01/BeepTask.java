package thread01;

// Runnable 인터페이스를 구현하여 run 메소드를 정의
public class BeepTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("동");
			System.out.println("동");
			System.out.println("동");
			System.out.println("동");
			System.out.println("동");

			try {
				// 0.5초 일시정지
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
/**
 * 스레드는 언제 시작하는가?
 */