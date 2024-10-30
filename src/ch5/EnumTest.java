package ch5;

import java.util.Calendar;

public class EnumTest {

	public static void main(String[] args) {
		// 열거형 테스트.... Week 열거형을 통해서 특성을 봅시다... 
		Week day;
		day = Week.FRIDAY;   // 열거형 상수... 
		System.out.println(day);
		day = Week.WEDNESDAY;
//		day = Test;          // 목록 이외 값 X
		
		System.out.println(day);
		
		// 정의한 열거형 불러오기
		Week today = null;
		
		// Calendar 객체 얻기... 
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기... 
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY; break;
			case 4: today = Week.WEDNESDAY; break;
			case 5: today = Week.THURSDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY; break;
		}
		
		// 열거 타입 변수를 사용... 
		if (today == Week.SUNDAY) {
			System.out.println("일요일에 축구를 합니다.");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("자바를 죽도록 열심히 공부합니다.");
		}else {
			System.out.println("죽을 만큼 공부합니다.");
		}
		

	}

}
