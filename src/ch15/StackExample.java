package ch15;

import java.util.Stack;

public class StackExample {

	// Stack은 Vector 클래스를 상속받기 때문에 List가 보유한 메서드도 사용이 가능함. 
	// 즉, List와 같은 구조로 LIFO형태를 구성하고 있다. 
	
	public static void main(String[] args) {
		// Stack 객체 생성
		Stack<Integer> stack = new Stack<>();
		
		// 데이터 추가 (push), Vecter가 리스트 구현체로 add() 사용 가능함.
		stack.push(10);
		stack.add(20);
		stack.push(30);
		stack.add(40);

		System.out.println(stack);
		System.out.println("List 형태의 접근 : "+stack.get(0)); // 0부터 저장순서로 인덱스 처리
		System.out.println("백터 형태의 저장 인덱스 : " +stack.search(10));	// search() - vector는 값을 통해서
		System.out.println("못찾는 경우 의 값 : "+ stack.search(50));   //   저장된 인덱스 값을 알아옴.
												// (-1인 경우 데이터가 없음
		
		while(!stack.isEmpty()) {   // 스택이 비어있지 않은 경우
			System.out.println(stack.pop());
			System.out.println("stack 10의 인덱스 : " + stack.search(10));
		}
		
	}

}




