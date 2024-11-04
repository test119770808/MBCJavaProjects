package ch6;

public class SingletonExample {

	/*
	 *  싱글톤(Singleton)이란? 클래스의 인스턴스 갯수를 제한하는 프로그래밍 방법을 의미함.
	 *   객체 생성시 "new 생성자()"가 실행될 때마다 객체는 계속 생성된다. 싱글톤은 외부에서
	 *   객체를 생성할 때 이를 제한하여 제한된 객체의 생성된 내용을 전달하는 방식으로 
	 *   주로 데이터베이스에서 연결 객체수 제한시 사용함. 
	 */
	
	public static void main(String[] args) {
		// Singleton 테스트
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();

		// 정적 메서드를 호출하여 싱글톤 객체를 얻어 보기.. 
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// 동일한 객체를 참조하는지 확인
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		System.out.println("obj1.num : " + obj1.getNum());   // 0
		obj1.increseNum();
		System.out.println("obj1.increseNum() 실행 시 : "+ obj1.getNum());
		System.out.println("obj2.increseNum() 실행 시 : "+ obj2.getNum());
	}

}

// Singleton 디자인 클래스... 
class Singleton {
	// 싱글톤 디자인 생성 단계.... 
	// 1. 필드 생성...
	//  필드는 자유롭게 만들되 객체(자신) 멤버변수를 생성. 접근 제한자는 private
	private String str;
	private int num;
	private static Singleton s = new Singleton(); // 객체 생성
	
	// 2. 생성자의 접근 제한자 설정을 private으로 설정
	//  객체를 외부에서 만들수 없게 하기 위해서... 
	private Singleton() {
		str = "SingletonTest";
		System.out.println(str + "객체 생성");
	}
	
	// 3. 객체 필드에 대한 getter 설정... 
	public static Singleton getInstance() {
		return s;
	}
	
	// num 값을 1씩 증가시키는 메서드... 
	public void increseNum() {
		num ++;
	}
	// num 값을 얻어오는 Getter 메서드... 
	public int getNum() {
		return num;
	}
	
	
	
	
	
	
	
	
	
	
	
}





