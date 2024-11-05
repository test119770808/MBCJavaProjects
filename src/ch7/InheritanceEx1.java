package ch7;

import ch7.obj.Employee;
import ch7.obj.FinalClass;
import ch7.obj.Person;
import ch7.obj.Student;
import ch7.obj.Teacher;

public class InheritanceEx1 {

	// 상속 테스트를 위한 클래스..
	/*
	 *  상속(Inheritance)
	 *   - OOP에서 상속은 기존의 클래스를 확장하여 새로운 클래스를 이끌어 내는 것을 의미함.
	 *   - 기존 코드를 재사용함으로써 불필요한 코드를 재작성하지 않아도 됨.
	 *   - 클래스의 상속은 단일 상속만 가능함.
	 *     단, 인터페이스는 다중 상속이 가능함
	 *   - 상속은 extends라는 키워드를 사용하여 상속을 표현함. 
	 *   - 어떤 클래스가 다른 클래스로부터 상속을 받아 만들어지면 새롭게 만들어진 클래스를
	 *    자식 클래스(child or sub)라고 부르며, 멤버변수와 메서드를 물려준 클래스를 
	 *    부모 클래스(parent or super)라고 합니다.
	 *   - 상속을 하게 되면 부모 클래스의 멤버변수(필드)와 메서드를 자식 클래스에 상속하게 
	 *    됩니다. 하지만, 생성자를 상속되지 않습니다. 
	 *   - 자바의 모든 클래스는 Object 클래스를 상속받고 있습니다. Object가 최상위 클래스
	 *   - final 클래스는 상속이 불가능. abstract 클래스는 반드시 상속해서 처리해야 함.
	 *    (abstract 클래스는 추상 클래스)
	 *    
	 *   상속을 잘 사용한 경우와 그렇지 않는 경우
	 *   - 잘못 사용한 경우 : 개별 클래스들이 중복된 속성(멤버변수,필드)/기능(메서드)을 포함하게 됨. 
	 *   - 잘 사용한 경우 : 중복된 기능은 빼고, 새로운 클래스를 작성한 후에 구체화
	 *        일반화된 클래스는 부모 클래스로, 구체화된 클래스를 자식 클래스로 사용
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Person과 Student, Teacher, Employee의 관계
		// 자식 객체 생성
		Employee emp = new Employee();
		Teacher te = new Teacher();
		Student st = new Student();
		Person test1 = new Person("테스터", 26);
		
		emp.name = "홍길동";
		emp.age = 18;
		emp.height = 180.8;
		emp.department = "교육부";
		System.out.println(emp.info());
		
		te.name = "이황";
		te.age = 47;
		te.subject = "프로그래밍";
		System.out.println(te.info());
		
		st.name = "이율곡";
		st.age = 15;
		st.studentId = "program001";
		System.out.println(st.info());
		
		Student s1 = new Student("이율곡", 15, "program001");
		System.out.println(s1.info());
		System.out.println(s1);		// override한 결과 :  [이름 : 이율곡, 나이 : 15, 학번 : program001]
		Teacher t1 = new Teacher("이황", 47);
		System.out.println(t1.info());
		System.out.println(t1);     // override 안함 : ch7.obj.Teacher@270421f5
		
		// 객체 비교... 
		System.out.println("s1 - 이율곡, 15의 해쉬값 : " + s1.hashCode());
		Student s2 = new Student("이율곡", 10, "program001");
		System.out.println("s2 - 이율곡, 10의 해쉬값 : " + s2.hashCode());
		Student s3 = new Student("이율곡", 15, "program0001");
		s3.height = 180;
		System.out.println("s3 - 이율곡, 15의 해쉬값 : " + s3.hashCode());
		System.out.println("s1과 s3의 비교 결과 : " + (s1 == s3));
		// 재정의한 equals를 통해서 비교
		System.out.println("s1과 s3의 비교 결과 : " + s1.equals(s3));
		
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
		System.out.println(new Person().getClass());
		

		// final 메서드 확인
		FinalClass finaltest = new FinalClass();
		finaltest.method();  // 오버라이드는 안되지만, 부모에게 상속받은 메서드 사용은 가능함. 
		
	}

}
