package ch14;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);

		threadA.start();
		threadB.start();
		
	}

}

class WorkObject {
	// 동기화 메서드 선언
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify();   // wait() 메서드로 인해 일시 정지 상태인 스레드를 실행 대기 상태로 만듬
		try {
			wait();  // 동기화 블럭 내에서 스레드를 일시 정지 상태로 만듬.
		} catch (InterruptedException e) {}
		
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify();   // wait() 메서드로 인해 일시 정지 상태인 스레드를 실행 대기 상태로 만듬
		try {
			wait();  // 동기화 블럭 내에서 스레드를 일시 정지 상태로 만듬.
		} catch (InterruptedException e) {}
	}
}

class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		workObject.methodA();
	}
	
}

class ThreadB extends Thread {
private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		workObject.methodB();
	}
}


