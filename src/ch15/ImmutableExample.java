package ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {

	public static void main(String[] args) {
		
		// List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A","B","C");
//		immutableList1.add("D");  // java.lang.UnsupportedOperationException
//		immutableList1.remove("C");
//		immutableList1.set(2, "D");
		
		// Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableSet1.add("D");
		
		// Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A", 
				2, "B", 
				3, "C"
		);
//		immutableMap1.put(4, "D");
		
		// copyOf() 메서드
		// List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("D");
		list.add("E");
		list.add("F");
		List<String> immutableList2 = List.copyOf(list);  // 불변..
		List<String> test = new ArrayList<String>(immutableList2);  // 불변값 인자로..
		test.add("A");
		System.out.println(test);
//		immutableList2.add("A");
		
		// Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		
		// Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		System.out.println(immutableMap2);

		// 배열로부터 List 불변 컬렉션 생성
		String[] arr = {"A","B","C"};
		List<String> immutableList3 = Arrays.asList(arr);  // 불변 List 컬렉션 생성. 
//		immutableList3.add("D");
		System.out.println(immutableList3);

	}

}
