package ch12;

/*
 *  포장 객체(Wrapper Class)
 *   기본타입의 값을 갖는 객체들을 의미함. 
 *   (Byte, Character, Short, Integer, Long, Float, Double,Boolean)
 *   포장(Boxing)하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하기 위해서 사용. 
 *   - boxing : 기본 타입 값을 포장개체로 만드는 과정. 포장 클래스에 기본 값 대입시 발생
 *   - unBoxing : 포장 객체에서 기본 타입 값을 얻어내는 과정. 기본 타입 변수에 포장 객체가 대입시 발생 
 * 
 */

public class WrapperExample {

	public static void main(String[] args) {
		// boxing
		Integer obj = 100;   // Integer obj = new Integer(100); deprecate됨 
		System.out.println("value : " + (obj.intValue() + 100));  // 정수...
		
		// unboxing
		int value = obj;    
		System.out.println("value : " + value);
		
		// 연산시 자동으로 unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
		
//		Integer test = 100;
//		test.
		// 문자열 값을 int값으로 변환... 
		int test = Integer.parseInt("1000");
		System.out.println(test);
		
		// 값 비교...(기억해두세요...) 
		// -128 ~ 127 초과값인 경우... 값의 범위가 1byte 크기를 넘는 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== : " + (obj1 == obj2));   // 객체이기 때문입니다.
		System.out.println("equals : " + obj1.equals(obj2));
		
		// -128 ~ 127 범위 내의 값인 경우... 
		Integer obj3 = 30;
		Integer obj4 = 30;
		System.out.println("== : " + (obj3 == obj4));   // 같다고 나옴.... 
		System.out.println("equals: " + obj3.equals(obj4));
		// 객체를 비교할 때는 equals()를 이용해서 비교하는 것이 좋아요.

	}

}
