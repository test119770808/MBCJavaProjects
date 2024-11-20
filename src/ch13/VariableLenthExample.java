package ch13;

public class VariableLenthExample {

	public static void main(String[] args) {
		// 가변 인자
		log("Hello");
		log("VariableLengthExample","Hello");
		log("a","b","c");
		log();
	}
	
	public static void log(String... msg) {  // 가변 인자 "..." 를 사용함.
		// 가변인자는 일반인자(매개변수) 앞에 사용할 수 없어요.
//		System.out.println(msg.length);
		System.out.println("로그 : ");
		for (String message: msg) {
			System.out.print(message + ",");
		}
		System.out.println();
	}
	
}
