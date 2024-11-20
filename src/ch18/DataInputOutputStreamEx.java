package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		// DataInputStream, DataOutputStream
		// 보조스트림을 연결하면 기본타입(boolean, char, short, int, long, float, double)
		// 값을 입출력으로 사용이 가능함. 
		
		// 1. 객체 생성
		// 기본
		FileOutputStream fos = new FileOutputStream("D:/Temp/primitive.db");
		// 보조
		DataOutputStream dos = new DataOutputStream(fos); 
		
		// 기본 타입 출력 - 주의 데이터의 순서를 주의하세요. 
		dos.writeUTF("홍길동");
		dos.writeDouble(95.6);
		dos.writeInt(1);
		
		dos.writeUTF("김갑순");
		dos.writeDouble(90.2);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		fos.close();
		
		// DataInputStream 생성
		FileInputStream fis = new FileInputStream("D:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		// 기본 타입 입력
		for(int i=0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
		fis.close();
		
		

	}

}
