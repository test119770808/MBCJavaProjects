package ch14;

public class InterruptExample {

	public static void main(String[] args) {
		// 스레드 생성
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();  // 일시정지 상태의 스레드는 InterruptException 발생

	}

}

class PrintThread2 extends Thread {
	 @Override
	public void run() {
		 // 방법1
//		try {
//			while(true) {
//				System.out.println("실행 중...");
//				Thread.sleep(1);  // 스레드 일시 정지 상태... 
//			}
//		} catch (InterruptedException e) {
//			System.out.println("InterruptException 발생");
//		}
		
		// 방법2
		while(true) {
			System.out.println("실행중 .... ");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
