package ch12;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	// 문자열을 특정 구분자로 구분하는 경우... 
	
	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");   // "&|," 의 의미? | 는 or의 의미로 & 또는 , 인 경우
		for(String token: arr) {
			System.out.println(token);
		}
		System.out.println();
		
		// StringTokenizer 사용 예
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");  // 구분자 생략시 공백이 구분자가 됨
		while(st.hasMoreTokens()) {  // hasMoreTokens() 는 구분값에 의한 내용이 있는지 확인... 반환값 True or False 
			String token = st.nextToken();  // StringTokenizer에 있는 값을 반환. 문자열 반환
			System.out.println(token);
		}
		

	}

}
