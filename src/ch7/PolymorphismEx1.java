package ch7;

import ch7.obj.Employee;
import ch7.obj.Person;
import ch7.obj.Student;
import ch7.obj.Teacher;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		// 부모객체는 자식객체를 포함.
		Person p;   // 부모 객체 변수를 선언... 
		
		// 자식 객체를 부모 객체 넣어줌 -> Promotion(자동형변환)
		// 자동형변환이 일어나면, 
		//  자식 객체는 부모 객체가 가지고 있는 것들에 대해서 접근 및 실행이 가능함. 
		//  즉, 멤버변수(필드)와 메서드를 실행할 수 있음. 
		//  메서드는 재정의했다면, 재정의한 것으로 실행합니다.
		p = new Student("홍길동", 18, "2024110501");
		System.out.println(p.info());
		System.out.println(p.getClass());
		p = new Teacher("홍길동사부", 100, "도술");
		System.out.println(p.info());
		System.out.println(p.getClass());
		p = new Employee("홍길자", 45, "식사담당");
		System.out.println(p.info());
//		p.working();   // 부모 클래스인 Person에 working()가 없기 때문에 실행X
		System.out.println(p.getClass());
		
		Employee e1 = (Employee)p;  // casting을 통해서 형변환
		System.out.println(e1.info());
		e1.working();
		System.out.println(e1.getClass());
		
		
		
		
		

	}

}
