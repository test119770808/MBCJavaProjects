package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriterExample1 {

	public static void main(String[] args) {
		// FileOutputStream - Byte스트림 중에 File과 관련 하위 출력 스트림
		// OutputStream -> Byte출력 최상위 클래스
		try {
			// 1. 출력 객체 생성
			OutputStream os = new FileOutputStream("D:/Temp/test.db"); // 매개변수로 경로 값을 지정
			
			// 2. 출력 내용을 생성
			// - 데이터를 처리할 공간을 생성하여 데이터를 만들어 냄
			byte[] array = {10, 20, 30, 40};
			// - 메서드를 통해서 실제로 데이터를 처리
			// byte 단위 데이터 처리
			os.write(66);
			os.write(65);
			
			// 메모리 공간 생성해서 처리... 
			os.write(array);
			
			// 일부 공간을 처리하는 방법
			os.write(array, 1, 2);  // write(byte배열, 시작위치, 길이)
			
			os.flush();  // 메모리 정리
			// 3. close 처리 (이 작업이 일어나야 실제로 내용이 담긴 파일이 생성됨)
			os.close();
			
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했어요.");
			e.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
		

	}

}
