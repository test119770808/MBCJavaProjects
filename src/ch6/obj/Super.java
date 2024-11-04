package ch6.obj;

// 부모 클래스
public class Super {
	
	// 필드
	public int num1 = 10;
	protected int num2 = 20;
	/* default */ int num3 = 30;
	private int num4 = 40;   // 같은 객체 내 접근
	
	// 메서드를 통해서 접근.
	public int getNum4() {
		return num4;
	}

}
