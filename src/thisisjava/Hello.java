package thisisjava;

/**
 *  도큐먼트 주석
 *  Javadoc 명령어로 API도큐먼트 생성하는 목적으로 사용
 */

public class Hello {

	/*
	 * 범위 주석(여러줄 주석)
	 * main() 메서드는 실행을 위해서 반드시 필요함.
	 */
	
	public static void main(String[] args) {
		// 한줄 주석... Hello, Java2를 Console에 출력
		System.out.println("Hello, Java2!");
		
		// 실행문 끝에는 반드시 ;를 붙여서 끝을 표시
		int x;      // 변수 x 선언
		x = 1;      // 변수 x에 1값을 저장
		int y = 2;  // 변수 y 선언하고, 2값을 저장
		int result = x + y;  // result는 x변수와 y변수의 값을 더해요
		// console에 result결과를 출력....
		System.out.println(result);
	}

}
