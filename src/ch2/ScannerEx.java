package ch2;

import java.util.Scanner;

public class ScannerEx {
	// 표준 입력을 통해서 입력 처리 예시... 
	
	public static void main(String[] args) {
		// 1. Scanner 클래스로 객체를 하나 생성. 변수에 저장
		// Scanner는 클래스 타입
		Scanner scan = new Scanner(System.in);
		
		// 2. 사용자 입력값을 기다림.
		System.out.print(">");
		String line = scan.nextLine();  // 문자열 한줄을 읽어들임
		System.out.println("사용자가 입력한 문자열 : "+line);
		
		// scan.next() : 단어를 입력. 띄어쓰기까지 입력
		System.out.print("next()> ");
		String word = scan.next();
		System.out.println("사용자가 입력한 단어 : "+ word);
		
		scan.nextLine();  // 버퍼에 저장된 값 처리... 
		//(next()를 사용시 일부 내용이 메모리에 있는 경우 제거를 위해서 사용함)
		
		// 참조타입 기능(함수-메서드)
		//scan.hasNextXXXX 해당 타입의 값을 포함하는지 여부를 나타냄
		System.out.print("has next boolean : ");
		boolean b = scan.hasNextBoolean();
		System.out.println("boolean 포함 여부 : " + b);
		
		scan.nextLine();  // 버퍼에 저장된 값 처리... 
		// scan.nextInt() => 정수를 입력받아서 반환... 
		System.out.print("nextInt> ");
		int i = scan.nextInt();
		System.out.println("사용자가 입력한 정수 더하기 100 : "+(i+100));
		
		// scan.nextFloat(), scan.nextDouble() 실수 값 입력
		System.out.print("nextDouble> ");
		double d = scan.nextDouble();
		System.out.println("사용자가 입력한 실수 : " + d);
		
		// 3. scan객체를 정리(메모리 정리)
		scan.close();
	}

}
