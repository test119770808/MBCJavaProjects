package quiz;

import java.util.PriorityQueue;

public class CollectionQuiz2 {

	public static void main(String[] args) {
		// 스코빌 지수
		int[] scoville = {1, 2, 3, 9, 10, 12 };
		System.out.println("스코빌지수가 주어진 값 이상으로 만들기 위한 섞는 최소 횟수 : "
				+solution(scoville, 1));

	}
	
	public static int solution(int[] scoville, int k) {
		int answer = 0;
		
		// 우선 순위 Queue : PriorityQueue 객체 생성
		PriorityQueue<Integer> que = new PriorityQueue<>();
		//que에 값 저장
		for (int i : scoville) {
			que.add(i);
		}
		System.out.println("섞기 전 음식 : "+que);
		while (true) {
			if(que.peek() >= k) return answer;
			answer ++;
			int result = que.poll() + (que.poll() * 2);
			que.add(result);
//			System.out.println(que);
			
			if(que.size() == 1) {  // que사이즈 1이면 음식을 섞을 수 없다... 
				return -1;      // 원하는 지수만큼 값을 만들 수 없음.
			}
		}
		
	}

}
