package ch18;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		// PrintStream, PrintWriter 는 print, println, printf와 같은 기능으로 출력
		// 1. 객체 생성
		FileOutputStream fos = new FileOutputStream("D:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 java의 System.out.print를 사용하는 것처럼 ");
		ps.println("내용이 출력됩니다.");
		ps.println("데이터 출력합니다.");
		ps.printf("| %6d | %-10s | %10s | \n", 1, "홍길동","의적");
		ps.printf("| %6d | %-10s | %10s | \n", 2, "이순신","장군");
		
		ps.flush();
		// 입출력 객체에서 메모리 버퍼를 flush하는 경우 3가지
		// 1. 버퍼 공간이 다 찼을 때
		// 2. flush()를 실행했을 때
		// 3. close()를 실행했을 때
		ps.close();
		
	}

}
