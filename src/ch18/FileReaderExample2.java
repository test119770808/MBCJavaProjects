package ch18;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample2 {

	public static void main(String[] args) {
		try {
			// 1. 객체 생성(Reader)
			Reader reader = null;
			
			// 2. 데이터 처리
			// 1문자씩 읽기
			reader = new FileReader("D:/Temp/test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
			
			// 3. close()
			reader.close();
			System.out.println();
			
			// 문자 배열로 읽기
			reader = new FileReader("D:/Temp/test.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data); // num은 글자수를 반환
				if(num == -1) break;
				for (int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
