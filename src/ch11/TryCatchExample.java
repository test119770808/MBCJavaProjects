package ch11;

public class TryCatchExample {
	
	// 예외 사항이 0으로 나눠지는 상황 : ArithmeticException
	public static int divide(int a, int b) {
		return a/b;
	}
	
	// 강제로 예외 발생  - throw 키워드... 예외 발생.
	public static void doSomething(int a) throws Exception {
		if (a > 50) {
			throw new Exception("a가 50보다 큽니다.");  // throw new 예외객체 
		}
		System.out.println("50% 확률로 실행됩니다. ");
	}
	

	public static void main(String[] args) {
		int a = (int) (Math.random() * 100); // 0 ~ 99
		int b = (int) (Math.random() * 4);   // 0 ~ 3
		
		try {
			System.out.printf("a = %d, b = %d, result = %d\n", a, b, divide(a, b));
			doSomething(a);
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나누려고 하고 있어요.");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			System.out.println("예외발생 원인 : " + e.getMessage());  // getMessage() 예외 발생 메시지 출력
		} finally {     // 예외 처리시 항상 실행한 부분을 처리를 담당.
			System.out.println(a);
			System.out.println(b);
		}
		

	}

}
