package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *   날짜와 시간관련 클래스
 *    -Date 클래스 : 날짜를 표현하는 클래스로 객체간의 날짜 정보를 주고받는 경우 사용
 *      객체 생성 ->  Date now = new Date();  // 현재시간을 객체로 생성
 *    -Calendar 클래스 : 달력을 표현하는 추상 클래스
 *      객체 생성 ->  Calendar now = Calendar.getInstance();
 */

public class DateExample1 {

	public static void main(String[] args) {
		// Date 클래스
		// Date 객체 생성
		Date now = new Date();    
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		// SimpleDateFormat : 시간을 원하는 형태로 출력.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}






