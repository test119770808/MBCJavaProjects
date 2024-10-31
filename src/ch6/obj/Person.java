package ch6.obj;

public class Person {
	
	// 필드(멤버변수) - 이름, 나이, 키
	public String name;
	public int age;
	public double tall;
	
	// 메서드
	public void info() {
		System.out.println(name);
		System.out.println(age + " 살");
		System.out.println("키 : "+tall+"cm ");
	}
	

}
