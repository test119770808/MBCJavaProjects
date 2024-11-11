package ch12;

import java.nio.charset.Charset;
import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) throws Exception {
		// 데이터를 문자열로 변환... 
		String data = "자바";   // char(2byte) => short(2byte)과 같은 크기
		
		// 인코딩 : 특정 형식으로 값을 처리하는 것을 의미함. 
		// 디코딩 : 원래의 형식으로 값을 되돌리는 것을 의미함. 
		// String -> byte배열(기본 : UTF-8 인코딩)
		byte[] arr1 = data.getBytes();
//		byte[] arr1 = data.getBytes("UTF-8");  // 인코딩 값을 주면 해당 인코딩으로 값을 받아 처리
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		// byte 배열 -> String(기본 : UTF-8 디코딩)
		String str1 = new String(arr1);
//		String str1 = new String(arr1, "UTF-8");
		System.out.println("str1 : " + str1);
		
		// String -> byte 배열 (EUC-KR 인코딩)  // 최신 MS949
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		// byte 배열 -> String(기본은 : UTF-8 디코딩)
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str2 : " + str2);
		
	}

}
