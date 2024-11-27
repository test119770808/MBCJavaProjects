package ch14;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
//		try {
//			Thread.sleep(2000);  // main 
//		} catch (InterruptedException e) {}
		
		try {
			// join() 호출한 스레드는 일시 정지. 여기서 join()를 호출한 스레드는? main
			// main 스레드가 실행 대기 상태가 되려면, join()메서드를 가진 스레드가 종료 되어야
			// 한다. join()를 가지고 있는 스레드는? sumThread
			sumThread.join();
		}catch (InterruptedException e) {}
		
		
		System.out.println("1 ~ 100 합 : "+ sumThread.getSum());

	}

}

class SumThread extends Thread {
	// 필드
	private long sum;  // 총합

	// 생성자 생략... 
	
	// getter, setter
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i <= 100; i++) {
			sum+=i;
		}
	}
	
}
