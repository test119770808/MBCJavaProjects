package quiz;

import java.util.Scanner;

public class CalculatorEx1 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 계산기 프로그램 작성하기.... 
		out : while (true) {
			// 1-1 메뉴 구성하기... 
			System.out.println("[ 계산 프로그램 ]");
			System.out.println(" 1. 더하기");
			System.out.println(" 2. 빼기");
			System.out.println(" 3. 곱하기");
			System.out.println(" 4. 나누기");
			System.out.println(" 0. 종료");
			System.out.print("선택 > ");
			
			// 입력값 받기...
			// Scanner 객체 생성
			
			String selectMenu = scan.next();
			
			// 메뉴 선택에 따른 동작 구현
			switch (selectMenu) {
				case "1": 
					System.out.println("더하기 계산을 합니다.");
					plus();
					break;
				case "2":
					System.out.println("빼기 계산을 합니다.");
					minus();
					break;
				case "3":
					System.out.println("곱하기 계산을 합니다.");
					multiplication();
					break;
				case "4":
					System.out.println("나누기 계산을 합니다.");
					division();
					break;
				case "0":
					System.out.println("종료 합니다.");
					break out;   // 종료시킬 while을 종료
				default:
					System.out.println("메뉴 선택이 잘못됐습니다.");
					System.out.println("다시 메뉴 선택해 주세요.");
			}
		}  // while 끝
		
	} // main() 끝
	
	// 더하기 메서드.. .
	public static void plus() {
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.println("더하기 결과 : "+ (num1 + num2));
		
	}
	
	// 빼기 메서드
	public static void minus() {
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.println("더하기 결과 : "+ (num1 - num2));
		
	}
	
	public static void multiplication() {
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.println("더하기 결과 : "+ (num1 * num2));
		
	}
	
	public static void division() {
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("더하기 결과 : "+ (int)((num1 / (double)num2) * 100)/(double)100);
		
	}

}
