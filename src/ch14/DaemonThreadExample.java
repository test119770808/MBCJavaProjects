package ch14;

public class DaemonThreadExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);  // 데몬 스레드
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
		
	}

}

class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용이 저장됨.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}

