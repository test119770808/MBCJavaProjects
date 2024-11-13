package ch15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		// ArrayList 
		List<String> list1 = new ArrayList<>();
		
		// LinkedList 
		List<String> list2 = new LinkedList<>();

		long startTime;
		long endTime;
		// ArrayList컬렉션에 저장하는 시간 측정
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));   // 추가... 
		}
		endTime = System.currentTimeMillis();
		System.out.printf("%-17s %8d ms \n", "ArrayList 걸린 시간 : ", (endTime-startTime));
		
		// LinkedList 컬렉션에 저장하는 시간 측증
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));   // 추가... 
		}
		endTime = System.currentTimeMillis();
		System.out.printf("%-17s %8d ms \n", "LinkedList 걸린 시간 : ", (endTime-startTime));
		
	}

}
