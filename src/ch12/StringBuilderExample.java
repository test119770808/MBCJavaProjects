package ch12;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder는 String 클래스의 단점을 보완하기 위해서 사용하는 클래스
		StringBuilder data = new StringBuilder();
		data.append("DEF"); // StringBuilder객체 값을 더하기...(맨 뒤에 추가)
		data.insert(0, "ABC");  // insert(index, 문자열) -> 인덱스 위치에 문자열을 추가...
		data.delete(3, 4);		// delete(start, end) -> start인덱스부터 end인덱스 전까지 삭제
		String dataStr = data.toString();
		
		System.out.println(data);
		System.out.println("String 객체 출력 : "+dataStr);
		
		// String과 StringBuilder의 차이... 
		long start, end;
		start = System.nanoTime();
		
		String str = "A";
		for (int i = 0; i < 300000; i++) {
			str = str + "A";
		}
		
		end = System.nanoTime();
		System.out.println("String : \t\t" + (end - start) + " 나노 초");
		
		// StringBuilder를 사용한 예
		start = System.nanoTime();
		
		StringBuilder sb = new StringBuilder("A");
		for (int i = 0; i < 300000; i++) {
			sb.append("A");
		}
		
		end = System.nanoTime();
		System.out.println("StringBuilder : \t" + (end - start) + " 나노 초");
		
		// deleteCharAt(index) : 특정 인덱스 값만 삭제(글자 하나 삭제)
		// replace(start, end, "문자열") 시작에서 끝이전까지 문자열 교체
		// reverse() 반전... 

	}

}
