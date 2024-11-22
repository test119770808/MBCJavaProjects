package program.obj;

import java.io.Serializable;

public class Customer implements Serializable{  // 직렬화  
	
	private static final long serialVersionUID = 1814984942127853970L;
	
	// 멤버변수(필드)
	String name;
	String gender;
	String email;
	int birthYear;
	
	// 생성자
	// 생략(기본 생성자 -> Customer() {}; )
	public Customer() {}
	
	public Customer(String name, String gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	// getter, setter : 객체외부에서 멤버변수(필드)에 접근하는 방법을 제공하는 메서드들... 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	 
	// 메서드
	@Override  // 재정의
	public String toString() {
		// toString()은 Object 클래스에서 정의한 메서드
		return "[이름 = "+ name +", 성별 = " + gender + ", 이메일 = " + email 
				+ ", 출생년도 : " + birthYear + "]";
	}

	
	
	
}
