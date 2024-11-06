package ch8;

public class ServiceExample {

	public static void main(String[] args) {
		// 테스트
		// 인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();
		
		// 디폴트 메서드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		// 정적 메서드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

	}

}

// Service 인터페이스
interface Service {
	// default 메서드
	default void defaultMethod1() {
		System.out.println("default메서드1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("default메서드2 종속 코드");
		defaultCommon();
	}
	
	// private 메서드
	//  외부에 공개되지 않는 메서드를 구현.
	private void defaultCommon() {
		System.out.println("default메서드 중복 코드A");
		System.out.println("default메서드 중복 코드B");
	}
	
	// 정적 메서드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	// private 정적 메서드 -> 정적 메서드에서 사용할 private 메서드
	private static void staticCommon() {
		System.out.println("static메서드 중복 코드A");
		System.out.println("static메서드 중복 코드B");
	}
}

// service 구현체
class ServiceImpl implements Service { }





