package ch14;

public class SafeStopExample {

	public static void main(String[] args) {
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		printThread.setStop(true);

	}

}

class PrintThread extends Thread {
	// 필드
	private boolean stop;
	
	// setter
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	
}
