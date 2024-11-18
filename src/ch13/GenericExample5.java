package ch13;



public class GenericExample5 {

	// 와일드카드 타입 파라미터 : ?
	// 제너릭 타입을 매개값이나 린턴 타입으로 사용할 때 범위에 있는 모든 타입으로 대체할 수 있는
	// 타입 파라미터를 의미함. 
	
	public static void main(String[] args) {
		// 모든 사람이 신청 가능 ( Person 객체에 포함된 경우 가능하게 설정 )
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
//		Course.registerCourse1(new Applicant(10));
		
//		Course.registerCourse2(new Applicant<Person>(new Person()));	
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));	
		Course.registerCourse2(new Applicant<Student>(new Student()));  // 여기서 부터 학생 및 자식객체 
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

		Course.registerCourse3(new Applicant<Person>(new Person()));	
		Course.registerCourse3(new Applicant<Worker>(new Worker()));	
//		Course.registerCourse3(new Applicant<Student>(new Student()));  // 여기서 부터 학생 및 자식객체 
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}

// 과정 - Course클래스 생성
class Course {   // 여기서 와일드 카드 사용
	// 모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<? extends Person> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course1을 등록함");
	}
	
	// 학생만 등록 가능
	// <? extends Student> 의미는 Student 객체를 포함한 하위 객체들을 의미하게 됨.
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course2을 등록함");
	}
	
	// 직장인 및 일반인만 등록 가능
	// <? super Worker> 의미는 Worker객체를 포함 부모 객체까지라는 의미. 
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course3을 등록함");
	}
}

// 지원자 - Applicant 클래스 생성
class Applicant<T> {
	// 필드
	public T kind;
	
	// 생성자 
	public Applicant(T kind) {
		this.kind = kind;
	}
}

// 대상에 대한 클래스 - 상속 관계
class Person { }
class Worker extends Person {}	// Person의 자식
class Student extends Person {}	// Person의 자식
class HighStudent extends Student {}	// Student의 자식
class MiddleStudent extends Student {}	// Stuendt의 자식







