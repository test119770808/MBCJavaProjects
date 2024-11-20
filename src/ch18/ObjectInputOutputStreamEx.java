package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		// ObjectInputStream, ObjectOutputStream 
		// 1. 스트림 객체 생성후 보조 스트림 연결
		FileOutputStream fos = new FileOutputStream("D:/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 2. 데이터 작업(객체 생성)
		Member m1 = new Member("winter", "눈꽃송이");
		Product p1 = new Product("컴퓨터", 1000000);
		int[] arr1 = { 1, 2, 3, 4 };
		
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		// 3. 버퍼 정리 및 close
		oos.flush(); oos.close(); fos.close();
		
		// FileInputStream에 ObjectInputStream 보조로 연결
		FileInputStream fis = new FileInputStream("D:/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 파일을 읽고 역직렬화로 객체 복원
		Member m2 = (Member)ois.readObject();
		Product p2 = (Product)ois.readObject();
		int[] arr2 = (int[])ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));

	}

}

class Member implements Serializable { // Serializable은 직렬화 인터페이스

	private static final long serialVersionUID = -1931982038194863371L;  
	
	// 1. 필드
	private String id;
	private String name;
	
    // 2. 생성자
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// 3. 메서드
	@Override
	public String toString() {return id + ": " + name;}
}

class Product implements Serializable {

	private static final long serialVersionUID = -7041165767628801237L;
	
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {return name + ": " + price;}
	
}




