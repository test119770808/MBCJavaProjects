package ch7;

import ch7.obj.Employee;
import ch7.obj.Person;
import ch7.obj.Student;
import ch7.obj.Teacher;

/*
 *  매개 변수의 다형성
 *   - promotion은 맴버변수의 값을 대입 할 때도 일어나지만, 메서드를 호출할 때 사용하는 매개변수에서도 발생합니다.
 *   - 보통 메서드를 호출할 때는 메서드 선언부에 지정한 데이터 타입과 일치하는 매개 값을 전달하여 호출합니다.
 *    하지만, 매개변수에 다형성을 적용하면 자식 객체를 전달할 수 있습니다.  
 */

public class PolymorphismEx2 {

	public static void main(String[] args) {
		
		// instanceof
		//  - 자바 키워드 중 하나로 instanceof는 객체가 지정한 클래스인지 아닌지 검사할 때 사용
		//  - instanceof는 왼쪽 항의 객체가 오른쪽 항의 클래스인지 검사한다는 의미로 맞으면 true, 틀리면 false
		//   ex) person instanceof Person
		
		Student s = new Student("홍길동", 15, "2024110501");
//		System.out.println("instanceof 결과 : "+ (s instanceof Person));
		printPersonInfo(s);
		
		Teacher t = new Teacher("도사님", 100, "도술");
		printPersonInfo(t);
		
		Employee e = new Employee("홍길자", 45, "식사담당");
		printPersonInfo(e);

	}

	public static void printPersonInfo(Person p) {
		// instanceof를 사용하여 각 객체별 배너의 값을 출력하게 만들어 보세요.
		/*
		 *   Student인 경우 배너는 Student Info로, Teacher인 경우 Teacher Info
		 *   Person인 경우 Person Info로 ....
		 */
		if (p instanceof Student) {
			System.out.println("*************** Student Info ****************");
		}else if (p instanceof Teacher) {
			System.out.println("*************** Teacher Info ****************");
		}else if (p instanceof Employee) {
			System.out.println("*************** Employee Info ***************");
		}else {
			System.out.println("**************** Person Info ****************");
		}
		System.out.println(p.getClass());
		System.out.println(p.info());
		System.out.println("*******************************************");
	}
	
}




