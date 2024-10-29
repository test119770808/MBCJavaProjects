package ch4;

public class SwitchExample3 {

	public static void main(String[] args) {
		String grade = "B";
		// SwitchValueExample... 
		// Java 12 이전 문법
		int score1 = 0;  // 등급에 따른 점수 저장 변수
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1 : "+ score1);

		// Java 12 이후 문법
		int score2 = switch (grade) {
		case "A" ->  100; 
		case "B" -> {
			int result = 100 -20;
			// Java 13부터 가능
			yield result; //B일경우 넘겨주는 값 처리... 
		}	
		default -> 60;
		};
		System.out.println("score2 : "+ score2);
		
	}

}
