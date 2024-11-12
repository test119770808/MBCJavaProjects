package ch12;

import java.util.Calendar;
import java.util.TimeZone;

public class DateExample2 {

	// Calendar 클래스
	// 날짜 및 시간을 쉽게 다룰 수 있는 클래스
	
	public static void main(String[] args) {
		// Calendar 객체 생성 - 추상 클래스로 getInstance()를 이용해서 생성
		//  생성된 인스턴스는 생성한 시점의 시간 정보를 가지고 있음. 
		Calendar cal = Calendar.getInstance();
		
		// TimeZone을 이용한 방법
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar cal2 = Calendar.getInstance(timeZone);
		// cal2는 특정 시간대의 시간 정보로 생성된 Calendar 객체가 됨.
		
		System.out.println(cal);
		
		// Calendar의 get() 메서드, set() 메서드
		// get()는 Calendar 상수를 이용하여 원하는 날짜 정보를 얻어 올 수 있음.
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;  // 시작 월의 값이 0부터... 
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int hod = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int millisec = cal.get(Calendar.MILLISECOND);
//		System.out.println(hour);
//		System.out.println(hod);
		System.out.printf("%d년 %d월 %d일 - %02d:%02d:%02d.%02d\n", 
				year, month, date, hour, min, sec, millisec);
		System.out.printf("%d년 %d월 %d일 - %d:%d:%d.%d\n", 
				year, month, date, hod, min, sec, millisec);
		
		printDayOfSeries(cal);
		
		// set(원하는필드, 변경값)을 이용한 정보 수정.
		cal.set(Calendar.DATE, 14);  // 12 -> 14
		printDayOfSeries(cal);
		
		cal.set(Calendar.DATE, 1);  // 12 -> 14
		printDayOfSeries(cal);
		
		cal.set(Calendar.DAY_OF_WEEK, 5);
		printDayOfSeries(cal);
		
		// 원하는 필드 더하기 .add(필드, 더할값)
		cal.add(Calendar.DATE, 20);
		printDayOfSeries(cal);
		
		cal.add(Calendar.DATE, -8);
		printDayOfSeries(cal);


	}
	
	// 날짜 정보 출력 메서드...
	static void printDayOfSeries(Calendar cal) {
		// dayOfYear : 해당 년도의 몇번째
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		// dayOfMonth : 달의 날짜
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		
		// dayOfWeek : 요일 (1:일요일 ~ 7:토요일, 상수값이 존재함)
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.SUNDAY);    // 1
		System.out.println(Calendar.SATURDAY);	// 7
		
		// dayOfWeekInMonth : 해당 요일이 그달의 몇번째 요일인지 체크 
		int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println("----------------------------------------");
		System.out.printf("dayOfyear : %d\n"
						 + "dayOfMonth : %d\n"
						 + "dayOfWeek : %d\n"
						 + "dayOfWeekInMonth : %d\n",
						 dayOfYear, dayOfMonth, dayOfWeek, dayOfWeekInMonth);
	}

}
