package ch15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	// FIFO 형식의 자료구조 데이터.
	
	public static void main(String[] args) {
		// queue 객체 생성
		Queue<Integer> que = new LinkedList<>();  
		// LinkedList가 Queue구현 대표 클래스
		
		// 데이터의 추가 : offer() 이나 add()도 사용할 수 있음
		que.offer(100);
		que.offer(200);
		que.add(300);
		que.offer(400);
		
		System.out.println(que.toString());
		System.out.println(que.remove(200));  
		// remove()에 인자가 없는 경우, 맨 앞에 데이터를 제거
		// 인자값이 있는 경우에는 해당 인자를 삭제
		System.out.println(que);
		System.out.println();
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		 									 
		
		
		
		

	}

}
