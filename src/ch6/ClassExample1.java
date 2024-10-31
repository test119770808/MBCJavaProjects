package ch6;

public class ClassExample1 { 

	public static void main(String[] args) {
		// 객체지향 프로그래밍 : OOP -> Object Oriented Programing
		
		// 객체(Object) : 세상에 존재하는 모든 것들... (사물, 추상적인 것들...)
		//  - 세상에 존재하는 모든 것들은 변수(필드, 속성)과 메서드(기능, 동작)으로 표현이 가능함.
		//  - 메서드는 객체의 행동 및 기능을 나타내고, 변수는 상태(설정값)를 나타냅니다.
		
		// 클래스 (Class)
		//  - 객체를 프로그래밍 언어로 표현한 것
		//  - 객체의 설계도
		//  - 클래스를 통해 만드는 하나의 실제 객체를 인스턴스라고 부릅니다.
		//  - 클래스의 메서드는 객체의 행동, 클래스의 변수는 객체의 현재 상태를 나타낸다.
		//  - 클래스는 참조형 변수 타입입니다.
		
		// JAVA 클래스의 규칙들... 
		//  - public class는 파일 이름과 같아야 한다. 
		//  - public class는 한 파일 내에서 한 개만 존재할 수 있음. 
		//  - 같은 패키지 내에서는 같은 이름의 클래스를 사용할 수 없다. 
		//  - 다른 패키지에서 import할 때는 public class에만 접근할 수 있음. 
		//  - public class는 파일의 이름이기 때문에 그 소스 파일 전체의 주제를 알 수 있는 이름을 
		//   짓는 것이 좋다. 
		//  - 클래스의 이름은 대문자로 시작하는 것이 좋다. 
		
		// 학생이라는 인스턴스 객체 생성.... 
		Student s1 = new Student();
		Student s2 = new Student();
		
		// 클래스 타입의 배열도 생성하여 사용할 수 있음.. 
		Student[] kids = new Student[100];    // kids라는 배열은 Student 인스턴스 100개 짜리 배열
		
		for (int i = 0; i < kids.length; i++) {
			kids[i] = new Student();				// 객체 생성 후 배열에 저장
			kids[i].name = "default name"+(i+1);    // 생성 객체 속성 값 정의
			System.out.println(i+1 + "번째 학생의 이름 : " + kids[i].name);		// 출력
		}
		
		// Student[] 타입이므로 값을 꺼내면.... 
		Student s50 = kids[50];
		s50.name = "51번째 학생의 이름입니다..... ";
		System.out.println(s50.name);
		
		for (int i = 0; i < kids.length; i++) {
			System.out.println(i+1 + "번째 학생의 이름 : " + kids[i].name);
		}
		
		s1.kor = 100;
		s1.math = 70;
		s1.eng = 90;
		s1.his = 95;
		s1.name = "홍길동";
		
		System.out.println(s1);
		System.out.println(s1.kor);
		System.out.println(s1.his);
		System.out.println(s1.getTotal());
		System.out.println(s1.getName());
		

	}

}

//  Student 클래스 정의.... 
class Student {  // 학생이라는 클래스 선언... 
	
	// 필드, 멤버변수, 속성... 
	public String name;   	// 이름
	public int age;			// 나이
	// 과목
	public int kor;			// 국어
	public int eng;			// 영어
	public int pro;			// 프로그램
	public int his;			// 역사
	public int math;		// 수학
	
	public int getTotal() { // 메서드... 
		// 메서드의 타입
		// 1. 매개값이 있고, 반환 값이 있는 경우
		// 2. 매개값이 있고, 반환 값이 없는 경우
		// 3. 매개값이 없고, 반환 값이 있는 경우
		// 4. 매개값이 없고, 반환 값도 없는 경우
		
		// 반환 값은 return 키워드를 사용하고 반환 값을 지정... 
		
		// 메서드 구조... 
		// [접근제한자] [반환 타입] [매서드명] (매개 변수들...) {
		// 		메서드 동작 코드.... 
		// }
		
		// 과목별 점수 총점을 구할 수 있음... 
		return (eng + his + kor + math + pro);
	}
	
	public String getName() {
		return name;
	}
	
	
}





