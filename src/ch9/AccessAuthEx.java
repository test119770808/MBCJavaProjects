package ch9;

public class AccessAuthEx {

	public static void main(String[] args) {
		// AccessB 테스트
		// 객체 생성
		AccessA accessA = new AccessA();
		AccessA.AccessB accessB1 = accessA.new AccessB();
		
		AccessA.AccessB accessB2 = new AccessA().new AccessB();
		
		// AccessC 테스트
		AccessA.AccessC accessC = new AccessA.AccessC();
		accessC.method();

	}

}

class AccessA {
	// AccessA 인스턴스 필드와 메서드
	int field1;
	void method1() {}
	
	// 정적필드, 정적메서드 
	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스
	class AccessB {
		void method() {
			// AccessA 인스턴스 필드와 메서드 사용
			field1 = 10;
			method1();
			// AccessA의 정적 필드와 메서드 사용
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스
	static class AccessC {
		void method() {
			// AccessA 인스턴스 필드와 메서드 사용
			// field1 = 10;    	// 사용X
			// method1();			// 사용X
			// AccessA의 정적 필드와 메서드 사용
			field2 = 10;
			method2();
		}
	}
	
	
}





