package ch4;

import java.util.Scanner;

public class WhileExample1 {

	public static void main(String[] args) {
		// while문
		// for문 보다 더 자유도가 높은 반복문
		//  for문은 초기화값, 조건, 증가값 기술하는 형식으로 문법이 구성되어 있음.
		// 하지만, while은 문법상 조건만 본다... 
		/*
		 *   while(condition) {
		 *   	조건이 참일 때 실행할 코드
		 *   }
		 */
		int i = 0;  // for문의 초기값
		
		while (i < 10) {  // 조건식
			i++;    // 증감값
			System.out.println(i);
		}
		
		// for (int i = 0; i < 10; i++) System.out.println(i);

		// 무한 반복
		while (true) {
			System.out.println(i += 10000);
			if(i % 20000 == 0) {
				continue;   // 반복문에서 continue를 만나면 조건식으로 이동... 
			}
			if (i < 0) 
				break;		// 반복문에서 반복을 종료하고자 할 때 사용하는 키워드... 
		}
		
		// do - while 
		// while 반복을 하는데 먼저 한번 실행하고 조건을 보는 반복문... 
		// 잘 사용하지 않아요... 
		i = 0;
		Scanner scan = new Scanner(System.in);
		
//		while ((i = scan.nextInt())!= 0) {
//			System.out.println("i가 0이 아닙니다....");
//		}
		
		// do while
		do {
			System.out.print("> ");
			i = scan.nextInt();
			System.out.println("i가 0이어도 일단 한번은 실행합니다.");
		}while( i != 0);
		
	}

}
