package ch12;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	// 숫자를 형식화된 문자열로 변환
	
	public static void main(String[] args) {

		double num = 1234567.89;
		
		DecimalFormat df;
		
		// 정수자리까지 출력
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		// 무조건 소수 첫째자리까지 출력
		df = new DecimalFormat("#,###.00");
		System.out.println(df.format(num));

	}

}
