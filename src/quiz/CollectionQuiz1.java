package quiz;

import java.util.Arrays;
import java.util.HashMap;

public class CollectionQuiz1 {

	public static void main(String[] args) {
		// 마라톤 완주하지 못한 사람 반환하는 메서드
		/*
		 * 	participant					completion				return
		 * 	[leo,kiki,eden]				[eden, kiki]			leo
		 * 	[marina,josipa,nikola		[marina,josipa,nikola	vinko
		 *   ,vinko,filipa]				 , filipa]
		 *  [mislav,stanko,mislav,ana]  [stanko,mislav,ana]		mislav	
		 */
		
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		String[] participant2 = {"marina","josipa","nikola","vinko","filipa"};
		String[] completion2 = {"marina","josipa","nikola","filipa"};
		System.out.println("완주하지 못한 사람 : "+ solution(participant, completion));
		System.out.println("완주하지 못한 사람 : "+ solution(participant2, completion2));
		

	}
	
	public static String solution(String[] participant, String[] completion) {
//		System.out.println(Arrays.toString(participant));
//		System.out.println(Arrays.toString(completion));
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant) {  // 참여자 체크
			// getOrDefault(key, 기본값) : key가 존재하면 그 값을 출력. 없으면 기본값 설정
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {   // 완주자 체크 	
			hm.put(player, hm.get(player) - 1);
		}
		
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}
//		System.out.println(hm);
		return answer;
	}

}







