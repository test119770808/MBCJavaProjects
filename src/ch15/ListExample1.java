package ch15;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample1 {

	// Java Collection : 자바가 기본적으로 제공하고 있는 자료구조들
	
	// List : 1)순서가 있고, 2)중복이 허용되는 배열과 같은 자료구조
	//       크기가 자동으로 조절되는 형태... 
	//    만약에 수정, 삭제, 변경 사항이 많이 일어나는 경우에 적합하지는 않음.
	// 변경 사항이 많이 일어나는 경우에는 Linked를 사용하면 좋아요. 
	
	public static void main(String[] args) {
		// ArrayList의 기본 사용법
		ArrayList list = new ArrayList();   // Object 타입으로 처리가 됨
		
		// add() : 리스트에 요소(element)를 추가
		list.add(30);
		list.add("홍길동");
		list.add("010-1234-5678");
		list.add("A");
		
//		System.out.println(list);
		
		// add(index, element) : 인덱스 위치에 요소 값을 추가...
		list.add(2, "abc1234@naver.com");  // 추가시 데이터가 뒤로 밀림.
		// 중복 저장 가능
		list.add("홍길동");
		list.add("홍길동");
		
		
		//  set : 원하는 위치에 요소를 추가(덮어쓰기)
		list.set(2, "defg5678@naver.com");
		System.out.println(list);

		// get : 원하는 인덱스의 데이터를 가져옴
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// size : 리스트의 길이 반환.
		System.out.println("ArrayList의 크기 : " + list.size());
		
		// indexOf : 데이터를 전달하면 해당 데이터의 인덱스를 반환. 못찾는 경우 (-1)
		System.out.println(list.indexOf("홍길동00"));
		
		// remove(index) :  index 위치의 데이터를 삭제하고, 그 값(삭제한 값)을 반환
		// remove(Object) : 해당 데이터를 삭제하고 결과를 반환(true or false)
		System.out.println(list.remove(list.indexOf("홍길동")));
		System.out.println(list.remove("홍길동"));
		System.out.println(list.remove("홍길동"));
		System.out.println(list);
		System.out.println(list.remove("홍길동"));
		
		// contains : 값을 포함하는지 여부 반환(true or false)
		list.add("홍길동");
		System.out.println(list.contains("홍길동"));
		
		// toString : 리스트를 문자열 형태로 변환... 
		System.out.println(list.toString());
		
		// toArray : 리스트를 배열로 변환
		Object[] arr = list.toArray();
		System.out.println("배열로 변환한 내용 : " +Arrays.toString(arr));
		
		// clear : 리스트를 초기화
		list.clear();
		System.out.println(list);
		
		// isEmpty() : 리스트가 비어있는지 확인
		System.out.println(list.isEmpty());  
		
	}

}





