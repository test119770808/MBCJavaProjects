package ch6;

import ch6.obj.Person;

public class TestClass2 {

	public static void main(String[] args) {
		// Person 클래스 테스트
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 19;
		hong.tall = 180.0;
		hong.info();
		
		Person kim = new Person();
		kim.name = "김수한";
		kim.age = 3000;
		kim.tall = 178.5;
		kim.info();

	}

}
