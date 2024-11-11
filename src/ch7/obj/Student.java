package ch7.obj;

// Person 클래스의 자식
public class Student extends Person {
	
	// 1. 필드(멤버변수)
	public String studentId;   	// 학번
	
	// 2. 생성자
	public Student() {}
	
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
		/*
		 *  super는 현재 객체의 부모 객체, 바로 위의 부모 객체를 의미함. 
		 *  super. 인 경우 
		 *   - 부모의 변수 또는 메서드 참조
		 *    ex) super.name, super.info()
		 *  super() 인 경우
		 *   - 부모의 생성자를 참조
		 *    ex) super(); // 부모의 기본 생성자
		 *        super(name, age); // 부모 객체의 Person(name,age)참조
		 *  ## this(), super() 생략한 경우... 자동으로 super() 를 자동으로 처리함. 
		 */
	}
	
	// 3. 메서드
	/*
	 *  메서드 재정의(Override)
	 *   부모 클래스로부터 상속받은 메서드를 자식 클래스에서 해위를 바꾸거나 보완하기 위해서 다시 정의해서 사용하는 것
	 *  
	 *  - 재정의 규칙
	 *    1. 상속을 전제로 한다.
	 *    2. 리턴타입, 매서드 이름, 파라미터(매개) 변수 설정이 일치해야 합니다.
	 *    3. 접근제한자는 같거나 more public 해야 한다.  
	 */
	@Override
	public String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId;
	}
	
	
	// Object의 매서드를 재정의
	@Override
	public int hashCode() {
		// 객체 동등비교를 위해서 사용하는 메서드, 재정의
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((studentId == null)? 0 : studentId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 객체 동등비교를 위해서 사용하는 메서드, 재정의
		if (this == obj) return true;   // 같은 객체. 주소가 같아요.
		if (obj == null) return false;  // 객체가 없는 경우.. 
		if (getClass() != obj.getClass()) return false;
		// getClass() 해당 객체의 클래스를 나타냄. 
		Student other = (Student)obj;
		if (age != other.age) return false;
		if (name == null) {
			if (other.name != null) return false;
		}else if (!name.equals(other.name)) return false;
		
		return true;
	}
	
	@Override
	public String toString() { // 객체를 문자열로 전환... 
		// 기본적으로 클래스명@hashcode 값으로 출력됨. (Object.toString()의 결과)
		// 재정의를 통해서 객체 내 정보를 확인하기 위한 용도 사용.
		return "[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId + "]";
	}
	
	
	
	
	

}
