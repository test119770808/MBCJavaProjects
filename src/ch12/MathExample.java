package ch12;

/*
 *   Math 클래스
 *    수학 계산에 사용할 수 있는 정적 메서드를 제공하는 클래스.
 *     - abs() : 절대값 구하는 메서드
 *     - ceil() : 올림 값 처리. 소수점 이하의 값이 있으면 값을 올림.
 *     - floor() : 내림 값 처리. 소수점 이하의 값을 내림.
 *     - max() : 최대값. 매개 변수들의 값을 비교하여 큰 값을 반환
 *     - min() : 최소값. 매개 변수들의 값을 비교하여 작은 값을 반환
 *     - random() : 0.0 ~ 1.0미만의 임의의 실수값을 반환
 *     - round() : 반올림 처리. 반을 넘기면 올리고, 반 미만 내림 처리...  
 * 
 */

public class MathExample {

	public static void main(String[] args) {
		// 절대값
		int v1 = Math.abs(-5);
		System.out.println(v1);
		
		// 올림값 (ceil)
		System.out.println(Math.ceil(5.3)); 	// 6
		System.out.println(Math.ceil(-5.3));	// -5
		
		// 내림(floor)
		System.out.println(Math.floor(5.3)); 	// 5
		System.out.println(Math.floor(-5.3));	// -6
		
		// 반올림
		System.out.println(Math.round(5.3)); 	// 5
		System.out.println(Math.round(5.5));	// 6
		System.out.println(Math.round(-5.3)); 	// -5
		System.out.println(Math.round(-5.6));	// -6   ex) -5.5는 -5
		
		//최댁밧 최소값
		System.out.println(Math.max(100, 200)); // 200
		System.out.println(Math.min(100, 200)); // 100
		
		

	}

}
