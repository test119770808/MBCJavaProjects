package ch6;

import java.util.Arrays;

public class MethodExample1 {

	// 메서드
	//  클래스 행동 및 기능을 나타낸다. 다른 언어에서는 함수라고도 합니다. 
	//  JAVA에서는 클래스 내부에만 함수를 정의할 수 있기 때문에 메서드라는 용어를 사용함. 
	
	// 메서드 특징
	//  - 어떤 단어(이름) 뒤에 ()가 붙게 됩니다.
	//  - 한번 만들어 두면 여러번 사용이 가능합니다. 
	//  - 여러 기능들을 묶어서 이름을 붙여 놓은 것을 의미함... 
	//  - 값을 반환할 수 있다(return)
	
	/*
	 *    (접근제한자) (static) 반환타입 메서드명(매개변수타입 매개변수명) {
	 *    
	 *    		여러 기능 구현 코드들... 
	 * 
	 * 	  }
	 * 
	 *    접근 제한자 : public, default, protect, private ... 
	 *    static : static은 쓰거 생략이 가능함... 
	 *    반환 타입 : 메서드가 모든 기능을 수행 후에 반환할 값의 타입을 지정. 
	 *     ( int, String, Student, char, boolean ... , void)
	 *     ** void 타입 : 이 함수는 반환을 안합니다 라는 의미... 
	 *    메서드명 : 메서드 호출을 위해서 사용할 이름
	 *    매개변수 : 메서드(함수) 호출 시에 ()안에 함께 전달할 값을 받는 변수
	 *    매개변수 타입 : 매개변수의 타입을 의미. 
	 */
	
	// 로또 번호 생성하는 메서드...  ( 매개변수 X, 반환 타입 O)
	static int[] getLottoNumber() {
		
		final int LOTTO_SIZE = 6;  			// final - 한번 선언된 내용은 변경 X
		int[] lotto = new int[LOTTO_SIZE];  // 6개의 int형 데이터를 가진 배열을 선언
		
		for (int i = 0 ; i < LOTTO_SIZE; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);		// 랜덤값으로 1 - 45 숫자를 생성... 
			
			// 검증... 
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i --;		// 중복이 있기 때문에... 저장 공간 값을 줄여서 다시 실행... 
					break;
				}
			}
		}
		// 함수의 실행 결과 반환
		return lotto;
	}
	
	// 토끼 이모티콘 출력 내용을 createRabit() 메서드로 console 출력하는 메서드 구현...
	static void createRabit() {   // 매개변수 X, 반환 타입 X
		System.out.println("===================");
		System.out.println("      /)/)");     
		System.out.println("     (  ..)");
		System.out.println("     (   >♡");
		System.out.println(" Have a Good Time.");
		System.out.println("===================");
		return;  // 1. 함수(메서드) 종료, 2. 반환값 처리(void는 반환값이 없음)
	}
	
	// 메시지를 전달하면, 해당 메시지 "* * *" 값을 양쪽에 붙여주는 문자열을 만드는 메서드... 
	//  매개값 전달 : String
	//  반환값 : String
	static String makeBanner(String msg) {  // 매개변수 O, 반환값 O 
		return "* * * " + msg + " * * *";
	}
	
	
	// main 메서드... 
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			createRabit(); //메서드(함수) 호출
		}
		
		// 문자열을 넣으면 ***을 붙여서 반환하는 함수 : makeBanner("문자열")
		String result = makeBanner("알 림");
		System.out.println(result);
		System.out.println(makeBanner("오늘 할 일"));
		
		
		// 중복없이 6개의 숫자를 출력하는 함수
		int[] lottoNum = getLottoNumber();
		System.out.println(Arrays.toString(lottoNum));
		
		
	}

}
