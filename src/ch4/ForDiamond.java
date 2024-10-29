package ch4;

import java.util.Scanner;

public class ForDiamond {

	public static void main(String[] args) {
		/*
		 *           힌트  : 공백, 별, 단(줄)
			      *			
			     ***		1. 홀수 줄수로 만들어야 완성됨. 
			    *****		2. 줄간 별의 갯수는 +2 또는 -2
			   *******		3. 줄간 공백의 갯수의 차이는 +1, -1 
			  *********		4. 전체 줄 수의 반에 해당하는 위치까지 
			   *******		   별이 +2씩 증가하고, 공백은 -1 감소합니다.
			    *****		5. 전체 줄 수의 반 이상인 경우에는 
			     ***		   별이 -2씩 감소하고, 공백은 +1 증가합니다. 
			      *			
		*/
		// 줄 수를 입력받아서 다이아몬드 별찍기... 
		// 1. 객체 생성(Scanner 객체 생성)
		Scanner scan = new Scanner(System.in);
		
		// 2. 입력 값 처리... 
		System.out.print("줄 수 를 입력하세요(홀수로 입력하세요) :");
		int dan = scan.nextInt();
		
		// 입력 값을 토대로 다이어몬드 별찍기 처리... 
		// * 변수 선언 : sp(여백), st(별), dan(줄)
		//    flag(boolean) -> true(피라미드), false(역피라미드)
		int space = dan/2;
		int star = 1;
		boolean flag = true;
		
		// 다이아몬드 그리기 위한 for문... 
		for (int i = 0; i < dan; i++) {
			// 여백(공백) 찍기 ...
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			// 별 찍기... 
			for (int j = 0; j < star; j++) {
				if(j == 0 || j == star -1)
					System.out.print("*");
				else {
					if (j % 2 == 0) System.out.print("$");
					else System.out.print(" ");
				}
			}
			System.out.println(); // 줄바꿈... 
			// 값의 변화 
			// 피라미드인 경우... star += 2, space -= 1
			// 역피라미드인 경우 ... star -= 2, space += 1
			// 어떤 때까지 피라미드로? 아니면 역피라미드로 변환할 것인지... 
			if (i == dan/2) flag = false; 
			
			// star와 space 증감 변화... 
			if (flag) {
				space -= 1; star += 2;
			}else {
				space += 1; star -= 2;
			}
			
		}
		
		// 3. 객체 삭제(정리)
		scan.close();

	}

}
