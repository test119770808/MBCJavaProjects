package ch9;

public class InnerClassEx2 {

	public static void main(String[] args) {
		// 테스트

		// staticB 객체 생성
		staticA.staticB b = new staticA.staticB();
		staticA.staticB b1 = staticA.field2;        // static인 경우
		staticA.staticB b2 = new staticA().field1;  // 인스턴스 경우... 
		
		// static 메서드
		staticA.staticB mb1 = new staticA().method1();
		staticA.staticB mb2 = staticA.method2();
		
		//--------------------------------------------
		// StaticB1객체 생성 및 인스턴스 필드 및 메서드 사용
		StaticA1.StaticB1 staticB1 = new StaticA1.StaticB1();
		System.out.println(staticB1.field1);
		staticB1.method1();
		
		// StaticB1 클래스의 정적 필드 및 메서드 접근
		System.out.println(StaticA1.StaticB1.field2);
		StaticA1.StaticB1.method2();
		
		

	}

}

class staticA {
	// 1. 필드
	// static 멤버 클래스
	static class staticB {}
	
	// 인스턴스 필드 값으로 B객체를 대입
	staticB field1 = new staticB();
	// 정적 필드 값으로 B객체 대입
	static staticB field2 = new staticB();
	
	// 2. 생성
	staticA() {
		staticB b = new staticB();
	}
	
	// 3. 메서드
	staticB method1() {
		staticB b = new staticB();
		return b;
	}
	static staticB method2() {
		staticB b = new staticB();
		return b;
	}
	
}

// 정적 멤버 클래스
class StaticA1 {
	// 1. 필드
	// 정적 멤버 클래스 
	static class StaticB1 {
		// 필드
		int field1 = 1;
		
		static int field2 = 2;
		
		// 생성
		public StaticB1() {
			System.out.println("StaticB 생성자 실행");
		}
		
		// 메서드
		void method1() {
			System.out.println("StaticB 메서드1 실행");
		}
		static void method2() {
			System.out.println("StaticB 메서드2 실행");
		}  // java17부터 허용
	}
	
	// 2. 생성자
	
	// 3. 메서드
	
}




