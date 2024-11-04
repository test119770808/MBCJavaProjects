package ch7.obj;

// 부모 클래스... 
public class Person {
	
	// 1.멤버변수(필드)
	public String name;
	public int age;
	public double height;
	
	// 2. 생성자
	// 기본 생성자 - 생성자를 만들지 않으면 JVM이 생성. 
	public Person() {}
	
	// 필드 생성자 
	public Person(String name, int age) {
		this.name = name;  // this 객체 그 자신을 나타냄... 
		this.age = age;
	}
	
	public Person(String name) {
		this(name, 1);    // this()
		/*
		 *  this()와 super()
		 *   this는 현재 객체(자기 자신을 의미함)
		 *    - this. 인 경우,
		 *      현재 객체의 변수 또는 메서드를 참조.
		 *      ex) this.name, this.info()
		 *    - this() 인 경우,
		 *      자기 자신 클래스 내의 다른 생성자를 참조할 수 있음. 
		 *      ex) this(); // 기본 생성자
		 *          this(name, age);
		 *          this(name);
		 */
	}
	
	public Person(String name, int age, double height) {
		this(name, age);
		this.height = height;
	}
	
	// 3. 메서드
	public String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}

}
