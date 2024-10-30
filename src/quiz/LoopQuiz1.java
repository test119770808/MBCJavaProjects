package quiz;

import java.util.Arrays;

public class LoopQuiz1 {

	public static void main(String[] args) {
		// Lotto 번호를 출력하는 프로그램 작성
		/*
		 * 	1. 1부터 45사이의 랜덤 숫자를 생성하기
		 * 	2. 변수 6개 선언해서 해당 변수에 값을 대입 => lotto1 - lotto6 
		 * 	3. 번호를 출력하기 
		 */

		/* 배열을 사용한 코드....  */
		// 배열의 선언... 
		int[] lotto = new int[6];   // 정수 타입 배열로 길이 6인.... 
		//int lotto2[] = new int[6];
		
		// 검증 - 중복없는 로또 번호 6개 뽑기...
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1; // 1 ~ 45
			
			for (int j = 0; j < i ; j++) {   // 검색 알고리즘... 
				if (lotto[j] == lotto[i]) {  
					i++;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		
		//=======================================================
		int[] lotto2 = new int[6];
		
		int count = 0;
		boolean testCheck = true;
		while (count < 6) {
			int lottoNum = (int)(Math.random() * 45) + 1;  	// 생성
			for (int i = 0; i < count; i ++) {             	// 검증
				if (lotto2[i] == lottoNum) {
					testCheck = false;
					break;
				}
			}
			if (testCheck) {								// 대입
				lotto2[count] = lottoNum;
				count++;
			}
			testCheck = true;								// 검증 초기화
		}
		
		System.out.println("while을 사용한 경우 : "+Arrays.toString(lotto2));
		
		
		/*
		int lotto1=0, lotto2=0, lotto3=0, lotto4=0, lotto5=0, lotto6=0; 
		int count = 0; // 출력 번호 갯수
		
		while (true) {
			// 로또 번호 생성... 
			int num = (int)(Math.random() * 45) + 1;  // 1 ~ 45
			
			// 검증...
			if(num != lotto1 && num != lotto2 && num != lotto3 
					 && num != lotto4 && num != lotto5 && num != lotto6) {
				System.out.print(num+" ");
				count ++;
				
				// 생성된 값을 대입... 
				if (lotto1 == 0) {
					lotto1 = num;
				}else if(lotto2 == 0) {
					lotto2 = num;
				}else if(lotto3 == 0) {
					lotto3 = num;
				}else if(lotto4 == 0) {
					lotto4 = num;
				}else if(lotto5 == 0) {
					lotto5 = num;
				}else if(lotto6 == 0) {
					lotto6 = num;
				}
			}
			
			// 6자리 숫자가 출력된 경우 탈출	
			if (count == 6) break;
			
		}
		*/	
		
	}

}
