package ch14;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		// Calculator 객체 생성
		Calculator calculator = new Calculator();  // memory
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();

	}

}

class Calculator {
	// 필드
	private int memory;
	
	// getter
	public int getMemory() {
		return memory;
	}
	
	// 메서드 선언부에 synchronized를 사용!
	public synchronized void setMemory1(int memory) {  // 동기화 메서드 설정
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ ": " + this.memory);	
	}
	
	public void setMemory2(int memory) {
		// synchronized 블럭 생성... 
		synchronized (this) {   // synchronized (공유객체) {} 
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+ ": " + this.memory);
		}
	}
}

class User1Thread extends Thread {
	// 필드
	private Calculator calculator;
	
	// 생성자
	public User1Thread() {
		setName("User1Thread");
	}
	
	// setter 메서드
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
	
}

class User2Thread extends Thread {
	// 필드
	private Calculator calculator;
	
	// 생성자
	public User2Thread() {
		setName("User2Thread");
	}
	
	// setter 메서드
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
	
}



