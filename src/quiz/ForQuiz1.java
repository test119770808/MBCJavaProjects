package quiz;

public class ForQuiz1 {

	public static void main(String[] args) {
		// quiz1. 1 ~ 200 사이의 숫자 중에서 (2 또는 3의 배수)가 아닌 수 들의 총 합을 
		// 구하세요. 
		int sum = 0;
		for (int i = 1; i <= 200 ; i++) {
			// 2 또는 3의 배수가 아닌 것들... 
			if (i % 2 != 0 && i % 3 != 0) sum += i;
		}
		System.out.println("총 합(2 또는 3의 배수 제외한)은 : "+ sum);
		
		// quiz2. 랜덤 알파벳 대문자 50개를 생성해서 출력하는 프로그램을 만들어 보세요. 
		//  10줄 마다 줄바꿈도 실행해야 합니다. 
		//   출력 예 >	DFDQWAZCXV
		//				SADFSGWQVC
		//				.... 
		//  1. 사용하는 함수(메서드) Math.random()을 활용해서 작업합니다.
		//  2. char 자료의 특징을 생각해서 작업을 진행합니다. 
		//     - 정수 자료
		//     - 1글자 출력. (ASCII 코드 참조)
		
		char a = 'A';  // 65  , 영문자 개수 : 26
		int b = 66;
		int z = 90;
		System.out.printf("a의 코드 값 : %d \n", (int)a );
		System.out.printf("b의 코드 값으로 출력 : %c\n", (char)b);
		System.out.printf("b의 코드 값으로 출력 : %c\n", (char)z);
		// Math.random() -> 0.0 ~ 1.0 실수 값들...
		// (int)(Math.random() * 10) + 10 -> 0+10 ~ 9 + 10
		int ran = (int)(Math.random() * 10); // 0 ~ 9(10개)
		ran = (int)(Math.random() * 26);     // 0 ~ 25(26개)
		ran = (int)(Math.random() * 26) + 65;// 65 ~ 90(26개)
		
		// 영문자(대) -> 50개 생성...
		// 영문자 개수를 모를 경우... 
		int symbol_size = 'Z' - 'A' + 1; // 1은 처리... 
		for(int i = 0; i < 50; i++) {
			int ch = 'A'+((int)(Math.random()* symbol_size));
			System.out.printf("%c",(char)ch);
			if (i % 10 == 9) System.out.println();
		}
		
	}

}
