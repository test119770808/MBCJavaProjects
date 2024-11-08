package ch9;

// Local 클래스 : 클래스 내에 메서드에서 생성된는 클래스를 의미함. 
public class LocalClassEx1 {

	public static void main(String[] args) {
		// LocalA1 객체 생성
		LocalA1 localA1 = new LocalA1();
		
		// LocalA1에 있는 메서드를 호출
		localA1.useLocalB1();
		
		// LocalA2.method1 호출
		LocalA2 localA2 = new LocalA2();
		localA2.method1(10);

	}

}

// 구성
class LocalA {
	// 필드
	
	// 생성자
	public LocalA() {
		// 로컬 클래스 선언
		class LocalB {}
		// 로컬 객체 생성
		LocalB b = new LocalB();
	}
	
	// 메서드
	void method() {
		// 로컬 클래스 선언
		class LocalB {}
		// 로컬 객체 생성
		LocalB b = new LocalB();
	}
	
}

class LocalA1 {
	// 필드
	// 생성자
	// 메서드
	void useLocalB1() {  // 로컬 클래스는 메서드 내에서 선언되어 사용됨... 
		// 로컬 클래스
		class LocalB1 {
			// 필드
			int field1 = 1;
			static int field2 = 2;
			// 생성자
			LocalB1() {
				System.out.println("LocalB1 생성자 실행");
			}
			// 메서드
			void method1() {
				System.out.println("LocalB1의 메서드1 실행");
			}
			static void method2() {
				System.out.println("LocalB1의 메서드2 실행");
			}
		}
		
		LocalB1 localB1 = new LocalB1();
		System.out.println(localB1.field1);
		localB1.method1();
		System.out.println(LocalB1.field2);
		LocalB1.method2();
		
	}
}

class LocalA2 {
	public void method1(int arg) {		// final int arg
		// 로컬 변수
		int var1 = 1;					// final int var1 = 1;
		
		// 로컬 클래스
		class LocalB2 {
			// 메서드
			void method2() {
				// 로컬 변수 읽기
				System.out.println("arg : " + arg);
				System.out.println("var : " + var1);
				
				// 로컬 변수 수정
				// arg = 2;
				// var1 = 2;
			}
		}
		
		// 로컬 클래스 객체 생성
		LocalB2 localB2 = new LocalB2();
		// 로컬 클래스 객체 메서드 호출
		localB2.method2();
		
		// 변수 수정
		// arg = 3;
		// var1 = 3;

		
	}
}




