package ch12;

/*
 *   Object 클래스 
 *    클래스 선언시 기본으로 상속하는 클래스. 모든 클래스의 최상위 부모 클래스
 *    
 *   - equals() : 객체의 번지를 비교하여 boolean 값으로 비교 결과를 리턴
 *              (재정의를 통해서 객체 비교시 사용)
 *   - hashCode() : 객체를 식별하는 정수. 객체의 메모리 번지(주소)를 이용하여 해시코드를 생성.
 *               때문에 생성되는 객체마다 다른 정수값을 가지게 됨. 이 기능을 이용하여 동등 객체 비교시 사용 
 *   - toString() : 객체를 문자열로 표현한 것. -> 클래스명@16진수해시코드
 *   
 *   참고 => ch7.obj에 있는 Student.class의 재정의 내용을 확인
 *   보통은 각 클래스에 맞게 재정의해서 사용하는 경우가 많음. 
 *   
 *   ** 레코드 선언
 *    데이터 전달을 위한 DTO 작성시 반복적으로 사용되는 코드를 줄이기 위해서 도입됨. 
 */

public class ObjectExample {

	public static void main(String[] args) {
		// 레코드 선언 테스트
		Person person = new Person("홍길동",19);
		System.out.println(person.name());  // 레코드에 있는 이름
		System.out.println(person.age());   // 레코드에 있는 나이
		System.out.println(person.toString());
		
		// record 키워드를 사용한 경우에는 매개변수로 전달된 데이터의 값에 따라서 객체를 구분함. 
		//  같은 값을 전달하면 같은 객체로, 다른 값을 전달하면 다른 객체로 구분함. 
		Person p1 = new Person("testuser1", 20);
		Person p2 = new Person("testuser1", 20);
		Person p3 = new Person("testuser2", 20);
		System.out.println("p1.hashCode() : " + p1.hashCode());
		System.out.println("p2.hashCode() : " + p2.hashCode());
		System.out.println("p3.hashCode() : " + p3.hashCode());
		System.out.println("p1.equals(p2) : " + p1.equals(p2));

	}

}

// 레코드 선언 : 데이터를 전달하기 위해서 만들어지는 반복적 코드를 줄이기 위해서 사용.
// record 키워드는 해당 클래스가 DTO(데이터 전달을 위한 객체)를 위한 클래스임을 나타냄
record Person(String name, int age) {}   // String name, int age는 클래스의 필드 값이 됨. 








