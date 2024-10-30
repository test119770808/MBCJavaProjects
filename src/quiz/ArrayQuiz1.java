package quiz;

import java.util.Arrays;

public class ArrayQuiz1 {

	public static void main(String[] args) {
		// 1. 1000개 짜리 int형 배열을 생성한 후에 배열 요소에 모든 값을 1 - 100사이의 랜덤 숫자로 채워서
		// 해당 내용을 출력해 보세요.... 
		
		// 배열 생성 - int형 배열로 1000개의 공간
		int[] numbers = new int[1000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		
		// 줄바꿈 출력을 위해서... 
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
			if (i % 10 == 0) { 
				System.out.println();
			}
		}
		System.out.println();
		// 2. 1000개의 랜덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요
		
		// 1 - 100 사이 숫자의 갯수를 저장할 공간을 선언
		int[] cnt = new int[100];    // 100개의 저장 공간... 
		
		// 1000개의 랜덤 값에서 1-100 숫자에 대한 갯수 계산... 
		for (int j = 1; j <= 100; j++) {   // j는 1 - 100 까지 숫자를 비교 계산하기 위한 값
			for (int i = 0; i < numbers.length; i++) {   // 1000개의 저장 공간에서 검색... 
				if (j == numbers[i]) {
					cnt[j-1]++;      // 개수 세기... 
				}
			}
		}
		
		// 확인... 
		int check = 0;   // 검증... 개수... 
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(i+1 + "이 나온 횟수 : " + cnt[i]);
			check += cnt[i];
		}
		System.out.println(check);  // 1000
		
		
		
		
		
		
		
		
		
		

	}

}
