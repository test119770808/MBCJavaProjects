package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		// 문자 변환 스트림
		write("문자 변환 스크림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		//1. 객체생성
		// 기본 입출력 객체 (OutputStream)
		OutputStream os = new FileOutputStream("D:/Temp/test.txt");
		// 보조 스트림 객체 생성(생성시 기본 스트림을 생성자에 전달)
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//2. 데이터 처리
		writer.write(str);
		writer.flush();
		//3. close()
		writer.close();
	}
	
	public static String read() throws Exception {
		// 1.객체 생성
		InputStream is = new FileInputStream("D:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8"); // 보조 스트림
		// 2.데이터 처리
		char[] data = new char[100];
		int num = reader.read(data);
		// 3.close()
		reader.close();
		String str = new String(data, 0, num);
		return str;
	}

}
