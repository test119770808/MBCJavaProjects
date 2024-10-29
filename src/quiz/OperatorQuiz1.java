package quiz;

import java.util.Scanner;   // 해당 코드에 스캐너를 객체를 import

public class OperatorQuiz1 {

	public static void main(String[] args) {
		//예제1) 두 수(정수)를 입력 받아서 더하기 연산을 하세요!!
		
		// Scanner 사용
		// 1 단계 : Scanner 객체 생성
		Scanner scan = new Scanner(System.in); 
		
		// 2 단계 : Scanner 사용 단계...
		System.out.print("정수 입력1 : ");
		int num1 = scan.nextInt();
		System.out.print("정수 입력2 : ");
		int num2 = scan.nextInt();
		
		// 더하기 계산 결과 출력
		int result = num1 + num2;
		System.out.println("더하기 계산 결과 : "+result);
		
		// 3 단계 : Scanner 객체 정리
		scan.close();

	}

}
