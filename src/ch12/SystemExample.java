package ch12;

import java.util.Properties;
import java.util.Set;

/*
 *  System 클래스
 *   시스템(컴퓨터)에 대한 작업을 할 수 있게 하는 클래스. 필드와 메서드를 통해서 프로그램의 종료, 키보드 입력
 *   콘솔(모니터)출력, 현재 시간 읽기, 시스템 정보 읽기 등이 가능함. 
 *   
 *   - 정적 필드(static)
 *   out  : 콘솔에 문자를 출력
 *   err  : 콘솔에 에러 내용을 출력
 *   in   : 키보드 입력
 *   - 메서드
 *   exit() : 프로세스 종료
 *   currentTimeMillis() : 현재시간을 밀리초 단위로 long 값으로 리턴
 *   nanoTime() : 현재시간을 나노초 단위로 long 값으로 리턴
 *   getProperty() : 운영체제와 사용자 정보를 제공
 *   getenv() : 운영체제와 환경 변수 정보 제공
 *   
 *   
 */
public class SystemExample {

	public static void main(String[] args) {
		// 운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		// 시간... nanoTime(), currentTimeMillis()
		long start = System.currentTimeMillis();
		
		// 전체 키와 값을 출력
		System.out.println("-------------------------------");
		System.out.println("key : value");
		System.out.println("-------------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();   // Set 타입은 중복을 허용 X
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행시 동작시간 : " + (end - start) + "ms");
	}

}
