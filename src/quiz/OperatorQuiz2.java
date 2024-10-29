package quiz;

import java.util.Scanner;

public class OperatorQuiz2 {

	public static void main(String[] args) {
		// 1. 두 실수를 입력 받아서 더하기하는 프로그램 작성... 
		
		// 작업 순서...  Scanner 객체는 사용자의 입력값을 받는 객체 
		//  Scanner 객체 생성 > 객체 사용 > 객체 정리
		// 1단계 : Scanner 객체 생성
		Scanner scan = new Scanner(System.in); 
		
		// 2단계 : 객체 사용... 
		System.out.print("첫번째 실수 입력 : ");
		double num1 = scan.nextDouble();
		
		System.out.print("두번째 실수 입력 : ");
		double num2 = scan.nextDouble();
		
		double result = num1 + num2;
		
		System.out.println("계산 결과 : "+result);
		
		// 3단계 : 객체 정리
		scan.close();
	

	}

}
