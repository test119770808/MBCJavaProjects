package quiz;

import java.util.Scanner;

public class OperatorQuiz3 {

	public static void main(String[] args) {
		// 2,3,4 => 두수를 입력 받아서 빼기, 곱하기, 나누기
		
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 객체 사용
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int minorResult = num1 - num2;
		int multiResult = num1 * num2;
		int divResult = num1 / num2;
		
		System.out.println("빼기 결과 : "+minorResult);
		System.out.println("곱하기 결과 : "+multiResult);
		System.out.println("나누기 결과 : "+divResult);
		
		// 객체 정리
		sc.close();
	}

}
