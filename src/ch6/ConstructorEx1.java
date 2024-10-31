package ch6;

import java.util.Arrays;

public class ConstructorEx1 {
	// 생성자(Constructor)
	//  -> new를 통해서 클래스의 인스턴스를 생성할 때 호출되는 것
	//  클래스의 이름과 같은 이름을 지닌 메서드. 
	//  클래스에 생성자를 정의하지 않으면 기본 생성자를 호출합니다. 
	//  기본 생성자는 "클래스명()"인 생성자 입니다.
	//  다른 생성자가 정의되어 있다면 정의된 생성자를 반드시 사용해야 합니다. 
	public static void main(String[] args) {
		
		// Car instance 생성
		Car car1 = new Car();
		System.out.println(car1.brand);
		System.out.println(car1.wheel);
		System.out.println(car1.name);
		
		// 필드 초기화 생성자를 통한 Instance 생성
		Car car2 = new Car("미쉐린", 6, "BMW", "티코");
		System.out.println(car2.wheel);
		System.out.println(car2.brand);
		
		// 생성자 오버로딩 테스트
		Car car3 = new Car("niro", "KIA", "금호");
		System.out.println(car3.numOfWheel);
		System.out.println(car3.wheel);
		System.out.println(car3.name);
		
		
		
	}
}

// Car 클래스
class Car {
	
	// 필드
	String wheel;     	// 타이어 이름
	int numOfWheel;		// 타이어 개수
	String brand;		// 차 브랜드
	String name;		// 차 이름... 
	
	// 생성자는 새로운 인스턴스를 생성할 때 가장 먼저 호출되기 때문에 
	// 값을 초기화하는 용도로 많이 사용됩니다. 
	Car() {      // 기본 생성자... (매개값을 받지 않는, intance 생성자)
		// Car()인스턴스 생성시 동작을 구현...
		wheel = "금호";
		numOfWheel = 4;
		brand = "KIA";
		name = "K5";
	}
	
	// 필드(멤버변수) 초기화 생성자... 
	Car(String wheel, int numOfWheel, String brand, String name) {
		// this는 현재 생성된 인스턴스를 의미함. 
		
		// this는 언제 사용할까? 클래스의 변수(필드)와 매개변수의 이름이 같은 경우
		// 클래스의 변수를 지칭하기 위해서 this를 사용합니다. 
		this.wheel = wheel;
		this.numOfWheel = numOfWheel;
		this.brand = brand;
		this.name = name;
	}
	
	// 생성자 오버로딩
	// 오버로딩 -> 동일한 이름의 생성자 혹은 메서드의 매개변수를 달리하여 생성자 혹은 메서드를 여러개 선언하는 것
	//   왜, 사용할까?  동일한 이름의 구동을 다양한 매개변수를 통해서 구현하게 하기 위해서... 
	
	// - 오버로딩은 매개변수의 타입, 개수, 선언된 순서가 같은 경우 같은 생성자로 구분함.
	// - 즉, 타입, 개수, 순서가 달라야 다른 오버로딩으로 인식하게 됩니다. 
	
	
	Car(String name, String brand) {
		// this() 현재 인스턴스의 생성자를 가리킵니다.
		this("금호",4,brand, name);
	}
	
	Car(String name, String brand, String wheel) {
		this.name = name;
		this.brand = brand;
		this.wheel = wheel;
	}
	
	
	
	// 메서드(method)
	void go() {
		System.out.println(name +"앞으로 이동합니다.");
	}
	
	void stop() {
		System.out.println(name + "가 정지");
	}
	
}






