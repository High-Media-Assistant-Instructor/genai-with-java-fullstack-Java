package thread02;

public class ThreadNameExample {
	/**
	 * 현재 실행 중인 스레드의 이름을 출력
	 * ThreadA 와 ThreadB 두 개의 스레드를 생성 및 시작하는 예제
	 * @param args
	 */
	public static void main(String[] args) {
		// 현재 실행 중인 메인 스레드 객체를 가져와 이름을 출력
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

		// 새로운 스레드를 생성
		ThreadA threadA = new ThreadA(); 
		System.out.println("작업 스레드 이름: " + threadA.getName()); 
		threadA.start();
		
		
		ThreadB threadB = new ThreadB();  
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
