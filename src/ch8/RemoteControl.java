package ch8;

// RemoteControl 인터페이스 생성... 
/* public interface 인터페이스이름 {
 * 		상수
 * 		추상메서드... 
 * }
 * 
 * 인터페이스
 *  - abstract class와 유사한데 여러개 상속 받을 수 있음.(추상클래스의 단점을 보완)
 *  - 인터페이스에 포함된 메서드들은 모두 abstract method(기본값)이다.
 *  - abstract class와 다르게 인스턴스 변수와 인스턴스 메서드를 만들 수 없음. 
 *  - static 변수와 static 메서드는 사용이 가능하다. (자동으로 final이 된다)
 *  - 클래스와 다르게 구현체가 여러개 일 수 있어요. 
 */

public interface RemoteControl {
	
	// 상수 필드(멤버변수) : 인터페이스 내에 멤버변수(필드)설정을 하면 이것은 상숙 값이 됩니다. 
	// public static final 이 생략됨.... 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드 -> 구현측에서 반드시 재정의해야 함.
	//  1. 반환 타입, 2. 매개변수 타입과 갯수를 지정, 3. 메소드 이름
	void turnOn();   // public abstract 가 생략... 
	void turnOff();
	void setVolume(int volume);
	
	int getVolume();
	
	// 디폴트 메서드 -> {}를 사용하여 코드 실행부분이 존재함. 
	// 키워드로 default를 사용함.  상수 필드를 읽거나 추상 메서드를 호출하는 코드를 작성할 수 있음.
	// 무음...(Mute) 버튼 
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리를 합니다.");
			setVolume(MIN_VOLUME);  // 위에 있는 추상 메서드를 호출... 
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static 메서드
	//  형식 : [public | private] static 리턴타입 매소드명(매개변수,... ) { ... }
	//  선언시 public 생략했다면, 자동으로 컴파일 과정 중에 public이 붙게 됨. 
	//  실행부 작성시에 상수 필드(멤버변수)를 제외한 추상 메서드, 디폴트 메서드, private 메서드 등을 호출할 수 
	//  없다.(****)
	static void changeBattery() {
		System.out.println("리모콘 건전지 교환합니다.");
	}
	
}





