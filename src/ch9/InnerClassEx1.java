package ch9;

/*
 *  중첩 클래스(Inner 클래스)
 *   클래스 내에 또 다른 클래스를 생성하여 사용하는 클래스
 *   사용 이유는 클래스 맴버를 쉽게 사용할 수 있게 하고, 외부에서 중첩 관계 클래스인 것을 감춰서 
 *   코드의 복잡성을 줄여주기 위해서... 
 *   - 멤버 클래스 : 클래스 멤버로서 중첩 클래스 구현 (인스턴스 멤버 클래스, static 멤버 클래스)
 *   - 로컬 클래스 : 클래스 내에 있는 메서드의 내부에서 선언되는 중첩 클래스 
 */

// 인스턴스 멤버 클래스
public class InnerClassEx1 {

	public static void main(String[] args) {
		// 테스트 
		A a = new A();
		
		// 내부 클래스 접근시 "."(참조연산자)을 이용하여 접근 
		A.B b = a.field;
		A.B b1 = a.new B();
		//---------------------------------------------
		// 두번재 예제인 A1 객체 생성됨
		A1 a1 = new A1();
		
		// A1에 인스턴스 메서드 호출
		a1.useB1();

		// B1에 static 접근
		// 외부에서 클래스 A1에 B1 static 접근시 접근 방법
		System.out.println(A1.B1.field2);
		A1.B1.method2();
		// A1내부에 있는 B1 객체 생성
		A1.B1 b2 = a1.new B1();
//		A1.B1 b3 = A1.new B1();    // 인스턴스 멤버 클래스 이기 때문에... 
		
	}

}

class A {
	// 필드(멤버 변수)
	// 인스턴스 멤버 클래스
	class B {}
	
	// 인스턴스 필드 값으로 B 객체 대입
	B field = new B();
	
	A() {
		B b = new B();
	}
	
	// 인스턴스 메소드
	void method() {
		B b = new B();
	}
	
	
}

class A1 {
	
	// 인스턴스 멤버 클래스
	class B1 {
		//1. 필드 (멤버변수)
		int field1 = 1;				// 인스턴스 변수
		static int field2 = 2;      // 정적(static) 변수
		
		//2. 생성자
		B1() {
			System.out.println("B-inner클래스 생성자 실행");
		}
		
		//3. 메서드
		void method1() {
			System.out.println("B-inner클래스 메서드1 실행");
		}
		
		static void method2() {
			System.out.println("B-innner클래스 메서드2 실행");
		}  // java17부터 허용
		
	}  // class B end
	
	// A클래스 인스턴스 메서드
	void useB1() {
		// B1 객체 생성 및 인스턴스 필드 및 메서드 사용
		B1 b1 = new B1();
		System.out.println(b1.field1);
		b1.method1();
		
		// B1 inner 클래스의 정적 필드 및 메서드 사용
		System.out.println(B1.field2);
		B1.method2();
	}
	
	
}




