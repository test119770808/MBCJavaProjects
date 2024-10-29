package ch4;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// 예제 1) 정수를 입력 받아 정수가 3의 배수이면 
		// "3의 배수입니다." 출력. 2의 배수이면 "2의 배수이고, 짝수입니다."
		// 2배수도 아니고, 3의 배수도 아니면 "2의 배수도 3의 배수도 아닙니다."
		// 라는 문자열을 출력하는 프로그램을 작성해 보세요... 
		
		// 1. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 2. Scanner 객체를 통해서 입력값 받기
		System.out.print("정수를 입력해 주세요 : ");
		int num1 = scan.nextInt();
		// 3. 입력 판별... 2의 배수 여부, 3의 배수 여부 => if 사용... 
		//    결과 출력... 
//		// 단순 if문을 사용한 경우... 
//		if (num1 % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}
//		if (num1 % 2 == 0) {
//			System.out.println("2의 배수이거나 짝수입니다.");
//		}
//		if (num1 % 3 != 0 && num1 % 2 != 0) {
//			System.out.println("2의 배수도 3의 배수도 아닙니다.");
//		}
		
		// if ~ else 이용한 경우... 
		if (num1 % 3 == 0 || num1 % 2 == 0) {
			if (num1 % 3 == 0) {
				System.out.println("3의 배수입니다.");
			}
			
			if (num1 % 2 == 0) System.out.println("2의 배수이거나 짝수입니다.");
			
		}else {
			System.out.println("2의 배수도 3의 배수도 아닙니다.");
		}
		
		int score = 86;
		// if ~ else if ~ else
		// 90점 이상 A, 80이상 B, 70이상 C, 60점 이상 D, 60미만 F
		if (score >= 90) {
			System.out.println("A 입니다.");
		}else if (score >= 80) {
			System.out.println("B 입니다.");
		}else if (score >= 70) {
			System.out.println("C 입니다.");
		}else if (score >= 60) {
			System.out.println("D 입니다.");
		}else {
			System.out.println("F 입니다.");
		}
		
		
		
		// 4. Scanner 객체 정리
		scan.close();

	}

}
