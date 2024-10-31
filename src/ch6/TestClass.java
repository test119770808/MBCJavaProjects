package ch6;

import ch6.obj.Bread;

public class TestClass {

	public static void main(String[] args) {
		// 생성된 클래스들을 테스트... 
		
		// 객체(instance) 생성
		Bread bread = new Bread();
		bread.price = 1000;
		bread.name = "식빵";
		
		bread.info();
		
		////
		Bread cake = new Bread();
		cake.price = 10000;
		cake.name = "딸기케익";
		cake.info();
		
		System.out.println("클래스를 사용하지 않은 경우");
		info();
		System.out.println();
		info2();

	}
	
	static int price = 1500;
	static String name = "피자빵";
	static void info() {
		System.out.println(price + "원");
		System.out.println(name);
	}
	
	static int price2 = 10000;
	static String name2 = "딸기케익";
	static void info2() {
		System.out.println(price2 + "원");
		System.out.println(name2);
	}
	

}
