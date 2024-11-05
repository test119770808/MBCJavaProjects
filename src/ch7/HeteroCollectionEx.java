package ch7;

import ch7.obj.Employee;
import ch7.obj.Person;
import ch7.obj.Student;
import ch7.obj.Teacher;

/*
 *   이종모음(Heterogeneous Collection)
 *    - 이종모음은 배열에 다형성을 적용시키는 원리. 
 *    - 예로 int[] iarr = new int[10]; 이런 구조의 배열을 만들어 둔다면, 
 *      int형 데이터만을 저장할 수 있음. 
 *    - 하지만, 다형성을 적용하면 이종 모음 구조를 가진 객체 배열을 생성할 수 있음... 
 */

public class HeteroCollectionEx {

	public static void main(String[] args) {
		// Person을 객체로 하는 4개짜리 배열을 선언
		Person[] pArr = new Person[4]; 
		
		// 배열에 각 요소에 값을 대입
		pArr[0] = new Person("홍길동", 18);
		pArr[1] = new Student("이율곡", 15, "24110502");
		pArr[2] = new Teacher("이황", 47, "자바 프로그래밍");
		pArr[3] = new Employee("신사임당", 35, "교무처");
		
		for (int i = 0 ; i < pArr.length ; i++) {
			System.out.println(pArr[i].info());
		}
		
		// Object 배열
		Object[] objArr = new Object[5];
		
		objArr[0] = new Person("홍길동", 18);
		objArr[1] = new Student("이율곡", 15, "24110502");
		objArr[2] = 100;
		objArr[3] = new String("신사임당");
		objArr[4] = new java.util.Date();
		
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		
		
		
	}

}





