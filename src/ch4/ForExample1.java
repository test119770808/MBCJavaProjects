package ch4;

public class ForExample1 {

	public static void main(String[] args) {
		// for문
		// 같은 코드를 여러번 반복하고 싶은 때 사용함.
		/*
		 *  for(초기값 ; 조건식(condition); 증감식) {
		 *  	조건식이 참인경우 실행할 코드(반복 실행할 코드)
		 *  }
		 */
		
		// for문 기본 형식
		for (int i = 0; i < 10; i++) {
			System.out.println("i의 값 : " + i);
		}
		
		// for문의 초기값과 증감값의 위치는 변경이 가능함....
		int i = 0; //초기값
		for ( ; i < 10; ) {
			System.out.println("i의 값 : " + i++);  // 증가값의 위치... 
		}
		// 위와 같이 사용은 잘하지 않음... 왜? 보기 불편함... 
		
		// 예제1. for문을 사용하여 1부터 100까지 숫자의 합 구하기... 
		// 1 + 2 + 3 + 4 + 5 + ... + 97 + 98 + 99 + 100 = ?
		int sum = 0; // 더한 값이 저장될 변수...
		for (int j = 1; j <= 100; j++) {
			sum += j;
		}
		System.out.println("1부터 100까지 숫자의 합 : "+sum);
		
		// 예제2. for문을 사용하여 1부터 100까지 홀수의 합을 구하는 프로그램 작성...
		sum = 0;
		for (int j = 1; j <= 100; j++) {
			// 홀수의 합... 
			if ( j % 2 == 1) {  // 홀수인 경우... 
				sum += j;
			}
		}
		System.out.println("1부터 100까지 홀수의 합 : "+sum);
		
		// 문제1. 100부터 1까지 순서대로 화면에 출력하기... 
		// 옆으로 출력해주세요... 
		for (int j = 100; j > 0; j--) {
			System.out.print(j + " ");
		}
		
		
		
	}

}
