package ch4;

public class SwitchExample2 {

	public static void main(String[] args) {
		// case가 여러개인 경우... 처리... 
		char grade = 'b';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("A등급 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("B등급 회원입니다.");
			break;
		default:
			System.out.println("일반 회원입니다.");
			break;
		}
		System.out.println("========SwitchExpression=============");
		switch (grade) {
		case 'A','a' -> {
			System.out.println("A등급 회원입니다.");
		}
		case 'B','b' -> {
			System.out.println("B등급 회원입니다.");
		}
		default -> 
			System.out.println("일반 회원입니다.");
		}
		

	}

}
