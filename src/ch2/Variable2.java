package ch2;

public class Variable2 {

	public static void main(String[] args) {
		// 문자열 처리... String 타입
		// 문자열 : ""로 감싼 문자들.. 
		String var1 = "A";
		String var2 = "홍길동";
		System.out.println(var1);
		System.out.println(var2);
		
		// 이스케이프 문자 : 특수한 기능을 하거나, 특수한 기능하는 문자를 일반문자로 변환.
		//  "\"가 붙어 있는 문자. 
		System.out.println("\"");  // " 문자열 하나 출력
		System.out.println("'");   // " 문자열 하나 출력
		System.out.println('\'');  // ' 문자 하나 출력
		System.out.println("\\");   // \ 문자열 하나 출력
		// \u0000 16진수 유니코드 문자를 출력
		System.out.println("\u0065\u0064\u0063\u0062\u0061");
		// 대문자 A는 ??
		System.out.println("\u0041");
		// 탭간격 \t
		System.out.println("\\t사용 예시 : A\tB C");
		// 줄바꿈 \n
		System.out.println("\\n사용 예시 :\n나는\n오늘\n아침을\n먹었다.");
		// 캐리지 리턴 \r
		System.out.println("\\r사용 예시 :\n나는\r오늘\r아침을\r먹었다.");
		

	}

}
