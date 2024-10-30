package quiz;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		// 다음 numArr의 값들의 총합과 평균을 구해서 출력해보세요.. 
		
		int[][] numArr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20},
				{30, 30, 30}
		};
		
		int sum = 0; 	// 총합
		int items = 0;  // 갯수... 
		
		for (int i = 0; i < numArr.length; i++) {  // 일차원 배열 갯수만큼 반복
			items += numArr[i].length;
			for (int j = 0; j < numArr[i].length; j++) {  // 2차원 배열 안에 있는 1차원 배열의 갯수
				sum += numArr[i][j];
			}
		}
		
		System.out.println("총 합 : " + sum);
		System.out.println("평 균 : " + sum/(double)items);
		
	}

}
