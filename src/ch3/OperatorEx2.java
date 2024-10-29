package ch3;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 3항 연산자... 
		// 3개의 피연산자 항을 통해서 결과를 출력하는 연산자
		//  (조건식) ? (참인경우 동작 연산식) : (거짓인 경우 동작 연산식);
		
		int x = 11;
		// 3항 연산식
		boolean result = (x == 10) ? true : false;
		System.out.println("x는 10인가요? " + result);
		   
		// 정수를 입력 받아... 짝수이면 짝수를 출력, 홀수이면 홀수를 출력
		// 하는 코드를 작성해 보세요... 
		// 입력은 Scanner를 사용해서 nextInt()를 통해서 값을 전달 받습니다.
		
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 입력값 처리 - 정수 입력
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		// 입력값이 홀수, 짝수 판별해서 홀수면 "홀수", 짝수면 "짝수"
		// (num1 % 2 == 0) -> 2로 나눴을 때 나머지가 0이면 참, 
		String str = (num1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("입력 값은 : " + str);
		
		// 정수 입력 값이 3의 배수 이면서 짝수이면 그 값을 출력해 주세요.
		// ( num1 % 3 == 0 && num1 % 2 == 0)
		// ( num1 % 6 == 0 )
		int result2 = ( num1 % 3 == 0 && num1 % 2 == 0) ? num1 : 0; 
		System.out.println("입력값이 3의배수이면서 2의배수인 경우의 값 : "+result2);
		// scan객체 정리
		scan.close();
		
	}

}
