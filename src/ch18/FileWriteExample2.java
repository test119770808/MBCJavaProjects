package ch18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteExample2 {

	public static void main(String[] args) {
		// 문자 기반 출력 스트림 ( Reader, Writer 가 최상위 클래스)
		try {
			// 1. 문자 기반 스트림 객체 생성
			Writer writer = new FileWriter("D:/Temp/test.txt");
			
			// 2. 데이터 처리 : write()
			// write(int c) -> 한글자 데이터 쓰기
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			// write(char[] c) : char 배열에 있는 데이터를 쓰기
			char[] arr = {'C','D','E'};
			writer.write(arr);
			
			// write(String s) : 문자열을 읽어 데이터 쓰기
			writer.write("FGH 문자열");
			
			// 버퍼에 잔류하고 있는 문자들을 출력하여 비움
			writer.flush();			
			
			// 3. close()
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
