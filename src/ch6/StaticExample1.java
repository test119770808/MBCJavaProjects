package ch6;

public class StaticExample1 {
	
	// 정적 맴버 변수(필드) 및 메서드 => static
	//  정적 멤버 변수 -> 전역변수(프로그램 전에 영향을 주는 변수) 설정과 비슷함.
	//  전역변수는 프로그램 시작과 동시에 선언되어서 사용되거나 혹은 중간에 선언되어도 프로그램 종료까지 사용됨.
	//  전역변수와 반대되는 지역변수는 {}(블럭) 내에 선언되어지는 변수. 블럭을 벗어나면 사라져요.

	public static void main(String[] args) {
		// static 확인, Count 객체 생성
		Count c1 = new Count();   // 인스턴스 객체
		c1.a++;
		c1.b++;
		System.out.println("Non-static a : " + c1.a);
		System.out.println("Static b : " + c1.b);
		
		Count c2 = new Count();  // 인스턴스 
		c2.a++;
		c2.b++;
		System.out.println("Non-static a : " + c2.a);
		System.out.println("Static b : " + c2.b);

		Count.b++; // 클래스 멤버로 접근
		System.out.println("c1.a : " + c1.a);
		System.out.println("c2.a : " + c2.a);
		System.out.println("Count.b : " + Count.b);
		
		// static 메서드
		System.out.println("Count.doIt() : " + Count.doIt());
		System.out.println("Count.doIt() : " + Count.doIt());
		
	}

}

class Count {
	
	// 멤버변수(필드)
	public int a = 0; 			// 인스턴스 멤버변수
	public static int b = 0;	// 클래스 멤버변수(static 사용)
	
	// 메서드 doIt() - static 메서드... 
	public static int doIt() {
//		return ++a;   	// Cannot make a static reference to the non-static field a
		return ++new Count().a;	// 인스턴스 생성 후 a멤버 변수 참조... 
//		return ++b;		// static을 이용한 클래스 맴버변수 
	}
	
}







