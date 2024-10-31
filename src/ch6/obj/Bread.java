package ch6.obj;

public class Bread {
	
	// 필드(멤버변수) -> 가격, 이름
	public int price;
	public String name;
	
	// 메서드 생성... : info() 
	public void info() {   // 필드(멤버변수의 값을 콘솔에 출력)
		System.out.println(price + "원");
		System.out.println(name);
	}

}
