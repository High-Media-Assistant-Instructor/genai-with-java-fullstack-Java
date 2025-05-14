package thread01;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//Runnable객체를 직접 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
		Runnable beepTask = new BeepTask();
		Thread thread1 = new Thread(beepTask);
		// 동 출력
		thread1.start();

		for(int i=0; i<5; i++) {
			System.out.println("하");
			try { Thread.sleep(500); } catch(Exception e) {}
		}


		//Thread를 상속받은 하위클래스로 객체를 생성하면 
		//Runnable객체를 구현하지 않아도 스레드 작업이 가능하다.
		Thread thread2 = new BeepThread();
		// 딩 출력
		thread2.start();

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

