package ch6;

import java.util.Scanner;

import ch6.obj.Calculator;

public class CalculatorEx2 {
	
	// 필드(멤버변수)
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
			
			String selectMenu = scan.next();  // 문자열... 
			
//					int num1, num2;
			int[] nums = new int[2];
			// 메뉴 선택에 따른 동작 구현
			
			// Calculator 객체 테스트
//			Calculator cal1 = new Calculator();
////			int [] testnums = {100, 200};
////			int [] testnums2 = new int[] {100, 200};
//			Calculator cal2 = new Calculator(new int[] {100, 200});
//			Calculator cal3 = new Calculator(1000, 2000);
//			// cal1.firstNumber : 0, cal1.secondNumber : 0
//			cal1.numsInfo();
//			// cal2.firstNumber : 100, cal2.secondNumber : 200
//			cal2.numsInfo();
//			// cal3.firstNumber : 1000, cal3.secondNumber : 2000
//			cal3.numsInfo();
			
			Calculator result = new Calculator();
			
			switch (selectMenu) {
				case "1": 
					System.out.println("더하기 계산을 합니다.");
					// nums = inputNum();
					// Calculator cal = new Calculator(nums);
					Calculator cal = new Calculator(inputNum());
					System.out.println("더하기 결과 : " + cal.plus());  
					break;
				case "2":
					System.out.println("빼기 계산을 합니다.");
					nums = inputNum();
					System.out.println("빼기 결과 : " + result.minus(nums));
					break;
				case "3":
					System.out.println("곱하기 계산을 합니다.");
					nums = inputNum();
					System.out.println("곱하기 결과 : " + result.multiple(nums[0], nums[1]));
					break;
				case "4":
					System.out.println("나누기 계산을 합니다.");
					Calculator cal4 = new Calculator(inputNum());
					System.out.println("나누기 결과 : " + cal4.division());
					break;
				case "0":
					System.out.println("종료 합니다.");
					break out;   // 종료시킬 while을 종료
				default:
					System.out.println("메뉴 선택이 잘못됐습니다.");
					System.out.println("다시 메뉴 선택해 주세요.");
			}
		}  // while 끝

	}
	
	// 두 정수를 입력받는 메서드
		public static int[] inputNum() {
			// int 배열 선언
			int[] nums = new int[2];   
			System.out.print("첫번째 정수 입력 : ");
			nums[0] = scan.nextInt();
			System.out.print("두번째 정수 입력 : ");
			nums[1] = scan.nextInt();
			return nums;
		}

}
