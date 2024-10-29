package quiz;

public class ForQuiz2 {

	public static void main(String[] args) {
		// 이중 for문 혹은 반복문을 통해서 별찍기
		/*
		 * 	*
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 * 
		 */
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		/*
		 *  quiz... 다음과 같이 별찍기 하세요... 
		 * 
		 *  1) 	    *	2)	*****	3) 	*****
		 * 		   **		****		 ****
		 * 		  ***		***			  ***
		 * 		 ****		**			   **
		 * 		*****		*			    *
		 * 
		 *  4)	    *		5)	*********
		 *  	   ***			 *******
		 *  	  *****			  *****
		 *  	 *******		   ***
		 *  	*********		    *
		 * 
		 */
		
		// #1
		for (int i = 0; i < 5; i++) {
			// 공백 찍기
			for (int j = 0; j < 5 - i - 1; j++) {
				System.out.print(" ");
			}
			// 별 찍기
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// # 2
		System.out.println("===== 2 =====");
		for (int i = 0; i < 5; i++) {  // 0, 1, 2, 3, 4
			for (int j = 0; j < 5 - i; j++) {  // 회차 기대 값은 5, 4, 3, 2, 1
				System.out.print("*");
			}
			System.out.println();
		}
		// # 3 
		System.out.println("===== 3 =====");
		for (int i = 0; i < 5; i++) {  // 0, 1, 2, 3, 4
			// 공백 찍기
			// 반복 회차 : 0, 1, 2, 3, 4
			for (int j = 0; j < i; j++ ) {  // 반복회차 : 0, 1, 2, 3, 4 
				System.out.print(" ");
			}
			
			// 별 찍기
			for (int j = 0; j < 5 - i; j++) {  // 회차 기대 값은 5, 4, 3, 2, 1
				System.out.print("*");
			}
			System.out.println();
		}

		
		// # 4
		System.out.println("==== 4 ====");
		for (int i = 0; i < 5; i++) {
			// 공백 찍기
			for (int j = 0; j < 5 - i - 1; j++) {
				System.out.print(" ");
			}
			// 별 찍기
			for (int j = 0; j <= i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// # 5
		System.out.println("==== 5 ====");
		for (int i = 0; i < 5; i++) {
			// 공백 찍기
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			// 별 찍기
			for (int j = 0; j < 2*5- (i*2)- 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// while문으로 위에 코드를 변경해서 동일하게 동작하게 만들어 보세요!!!
		System.out.println("while문으로 변경한 코드 출력.... ");
		// #1
		int i = 0;
		while (i < 5) {
			
			int j = 0;
			// 공백 찍기
			while (j < 5 - i - 1) {
				System.out.print(" ");
				j++;
			}
			// 별 찍기
			j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
	}

	
}


