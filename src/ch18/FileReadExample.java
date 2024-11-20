package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadExample {

	public static void main(String[] args) {
		// Byte 입력 Stream 의 최상위 클래스는 InputStream
		// 작업은 File 작업이기 때문에 FileInputStream 클래스를 사용함. 
		// 입출력 스트림은 checked 예외이기 때문에 반드시 예외처리가 필요함. 
		try {
			// 1. 객체 생성(InputStream 객체 생성)
			InputStream is = new FileInputStream("D:/Temp/test.db");
			
			// 2. 데이터 처리(읽기 처리)
			// read() - 반환값으로 int(byte값 전달), 데이터가 없는 경우 -1반환.
//			while(true) {
//				int data = is.read();
//				if (data == -1) break;
//				System.out.print(data+" ");
//			}
			
			// 데이터를 읽어들일 공간을 할당하고 읽기
			// read(byte[]) - byte[]에 읽어들인 데이터를 저장하고, 그 크기를 반환
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);  // num은 읽어들인 데이터의 사이즈가 전달됨.
				if (num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i]+" ");
				}
				System.out.println();
				System.out.println(num);
			}
			
			// 3. close()
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		

	}

}
