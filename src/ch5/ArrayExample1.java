package ch5;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		// 배열
		//  같은 타입의 변수를 한번에 여러개 선언하는 방법 
		
		// 배열 선언 방법
		// 1. 타입명[] 변수명 = new 타입명[배열의 길이];
		// 2. 타입명[] 변수명 = { 데이터들 };   // 데이터는 ","로 구분
		// 3. 타입명[] 변수명 = new 타입명[]{ 데이터들 }; 
		
		int[] numbers = new int[10];    // 정수형 변수 10개를 가진 배열...
		// int는 0으로 초기화 됨... 
		boolean[] win = { true, false, true, false, false, true };
		String[] welcome = new String[] {"오늘 날씨는 괜찮네요", "오세요! 학원으로..", "환영합니다."};
		
		// 배열 값 사용하기
		// 변수명[인덱스] 로 데이터 접근.   * 인덱스는 위치값
		System.out.println(welcome[0]);
		System.out.println(welcome[1]);
		System.out.println(welcome[2]);
		
		// 배열의 길이 알아오기... 
		// 배열.length : 배열의 길 값이 저장되어 있음.
		System.out.println("win[]의 길이 : "+ win.length);   // 6
		System.out.println("welcome[]의 길이 : "+welcome.length);  // 3
		
		// 배열과 반복문... 
		for (int i = 0; i < win.length; i++) {
			if (win[i]) {
				System.out.println(i+1 +"번째 전적 : 승리");
			}else {
				System.out.println(i+1 +"번째 전적 : 패배");
			}
		}
		
		// 배열의 내용 출력...
		// (단순히 배열 변수만으로 출력하면 내용 출력 X)
		// Arrays.toString()를 통해서 배열 내용을 출력
		System.out.println(Arrays.toString(win));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(welcome));
		
		// 배열은 선언시 자동적으로 기본값으로 초기화를 합니다.... 
		// (초기화 값이 없는 경우...)
		//  초기화 기본값 
		//   정수 : 0
		//   실수 : 0.0
		//   boolean : false
		//   참조형(reference) : null 
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));
		
		// 배열의 얕은 복사(swallow copy)와 깊은 복사(deep copy)
		String[] byeMessage2 = new String[] {"good bye","bye bye","see you"};
		
		// 얕은 복사(swallow copy)  -> 참조 객체 주소를 복사... 
//		byeMessage = byeMessage2;
//		
//		System.out.println(byeMessage);
//		System.out.println(byeMessage2);
//		
//		byeMessage2[1] = "bye bye bye ya~~~";
//		System.out.println(Arrays.toString(byeMessage));
//		System.out.println(Arrays.toString(byeMessage2));
		
		// deep copy 
		//  배열의 주소 아닌 값 그 자체를 복사.... 
		// System.arraycopy() 를 사용하여 배열의 값을 복사.... 
		// System.arraycopy(src, srcPos, dest, destPos, length);
		//   - src : 원본 배열의 이름
		//   - srcPos : 원본 배열에 복사를 시작할 위치
		//   - dest : 복사 붙여넣기할 배열의 이름
		//   - destPos : 붙여 넣기 할 배열의이 시작 위치를 지정
		//   - length : 복사할 갯수
		System.arraycopy(byeMessage2, 1, byeMessage, 5, 2);
		
		System.out.println(Arrays.toString(byeMessage));
		System.out.println(Arrays.toString(byeMessage2));
		
		byeMessage[0] = "Good bye!";
		
		System.out.println(Arrays.toString(byeMessage));
		System.out.println(Arrays.toString(byeMessage2));
		
		
		
	}

}
