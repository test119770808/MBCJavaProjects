package ch7.obj;

//Person 클래스의 자식
public class Employee extends Person {
	
	public String department;
	
	public Employee() {};
	public Employee(String name, int age, String department) {
		super(name,age);
		// super는 부모 객체를 의미함.... 
		// super. 인 경우,
		//  : 부모 필드와 메서드에 접근
		// super() 인 경우, 
		//  : 부모 생성자에 접근
		this.department = department;
	}
	
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 나이 : "+ age +", 부서 : " + department;
	}

}
