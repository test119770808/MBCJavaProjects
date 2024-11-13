package ch15;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class MapExample2 {

	/*
	 * 	Hashtable
	 *   동기화된 메서드로 구성되어 있어 멀티스레드가 동시에 접근 불가
	 *   따라서 멀티스레드 환경에서 안전학게 객체를 추가, 삭제할 수 있음. 
	 *  
	 *  Properties
	 *   Hashtable의 자식 클래스로, 키와 값을 String 타입으로 제한한 컬렉션
	 *   (Map<String, String> 이런 형태)
	 *   주로 확장자가 .properties인 프로퍼티 파일을 읽을 때 사용
	 *   
	 */
	
	public static void main(String[] args) {
		// Hashtable 객체 생성
		Map<String, Integer> map = new Hashtable<>();
		
		for (int i = 0 ; i < 10 ; i++) {
			map.put(String.valueOf(i), i);
		}
		
		System.out.println(map);
		System.out.println("총 엔트리 갯수 : " +map.size());
		
		// Properties 컬렉션 사용. 
		Properties properties = new Properties();
		
		// MapExample2와 동일한 ClassPath에 있는 database.properties 파일 로드
		try {
			properties.load(MapExample2.class.getResourceAsStream("database.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		// 값 출력
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		System.out.println("admin : "+admin);
		
		

	}

}
