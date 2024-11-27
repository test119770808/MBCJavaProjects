package ch14;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for(int i=0;i<3;i++) {
			Thread threadA = new Thread() {
				
				public void run() {
					System.out.println(getName() + " 실행");
				};
				
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread");  // 스레드 이름 설정
		// 디버깅할 때에 어떤 스레드가 작업하는지 알아보기 위해서... 
		chatThread.start();
		
		

	}

}
