package ch4;

/**
 *  API 설명을 위한 Document 작성을 위한 주석... 
 */

public class IfExample1 {

	/*
	 *  여러줄 주석... 
	 *  
	 *  변수 작명 규칙(권장 사항 -> 필수는 아닙니다.... )
	 *  1. _ 를 활용해서 두 단어 이상의 이어진 변수 또는 메서드 명을 지정합니다.
	 *    이유? 변수명에서는 " "를 사용하면 안됨. 
	 *    ex) int plus result (x) ->  int plus_result
	 *  2. 두 단어 이상을 이어붙일 때 변수명 지정시 대문자 활용할 수 있어요.(낙타 표기법-카멜)
	 *    ex) int plusResult
	 *  3. 변수명과 메서드명은 첫글자는 소문자를 사용합니다. 
	 *  4. 클래스명은 첫 글자를 대문자를 사용합니다.
	 *  5. 이름은 추측할 수 있는 단어를 사용하는 것 좋습니다. 
	 *  
	 *  (절대로 지켜야 할 내용)
	 *  1. 이름의 첫 글자는 숫자를 사용할 수 없다. 
	 *  2. 이름의 첫 글자는 영문자 혹은 _ 를 사용해야 하기 때문입니다.
	 *  3. 변수 사이에는 공백을 사용할 수 없어요. 
	 *  4. 특수 문자는 _, $만 사용이 가능합니다. 
	 *  5. 이미 사용하고 있는 예약어(키워드-> if, for, while ... )는 변수명으로 사용 X
	 *    키워드들... int, public, static, void, class, if, for, while .... 
	 */
	
	
	public static void main(String[] args) {
		// 조건문 if
		// (condition) -> 조건식의 값이 true이면, {}(블럭) 안에 있는 내용을 실행. 
		
		int a = 1;
		// 단순 if
		if ( a == 0 ) {  // 조건이 참인 경우... 
			System.out.println("단순 if 문 실행됨...");
		}
		
		// if ~ else
		if ( a == 0 ) {  // if의 조건이 참인 경우 실행
			System.out.println("if ~ else문의 if문 실행");
		}else {			// if의 조건이 거짓인 경우 실행
			System.out.println("if ~ else문의 else문 실행");
		}
		
		// if ~ else if ~ else
		if ( a == 0 ) {   // a == 0일 때
			System.out.println("a가 0인 경우 출력");
		}else if (a == 11) {  // a == 11
			System.out.println("a가 11인 경우 출력");
		}else if (a == 12) {  // a == 12
			System.out.println("a가 12인 경우 출력");
		}else {  // 그밖에... (즉, a가 0, 11, 12가 아닌 경우)
			System.out.println("a가 0, 11, 12가 아닌 경우 출력");
		}
		
		// 중첩 if : if문 안에 또 다른 if문을 사용하는 경우... 
		if ( a % 3 == 0) {  // 3의 배수이면 참.... 
			System.out.println("3의 배수 입니다....");
			if ( a % 2 == 0 ) {   // 2의 배수 혹은 짝수이면 참... 
				System.out.println("6의 배수입니다. ");
			}else {
				System.out.println("3의 배수 이지만 6의 배수는 아닙니다....");
			}
		}
		
		
		System.out.println("main 코드.... ");
		
		
	}

}
