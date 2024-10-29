package ch4;

public class SwitchExample {

	public static void main(String[] args) {
		// switch - case 문... 
		// switch의 ()에 연산 결과에 따른 값의 분기
		/*
		 *  switch (var) {
		 *  case 1:
		 *  	변수 var의 값이 정수 1인 경우 실행할 내용
		 *  	break;
		 *  case '1':
		 *  	변수 var의 값이 문자 1인 경우 실행할 내용
		 *  	break;
		 *  default :
		 *  	위의 case에 해당하지 않는 경우 실행할 내용
		 *  	break; 
		 *  }
		 */
		// Math.random() : 0.0 ~ 1.0 미만의 실수인 난수 생성...
		// (Math.random() * 6) : 0.0 ~ 6.0 미만의 실수를 생성... 
		// (int)(Math.random() * 6) : 0 ~ 5 인 정수 출력
		int num = (int)(Math.random() * 6) + 1;  // 1 ~ 6까지 임의 정수가 출력
//		System.out.println(num);
		
		switch (num) {
		case 1:  // num이 1일때,
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:  // num이 2일때,
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:  // num이 3일때,
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:  // num이 4일때,
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:  // num이 5일때,
			System.out.println("5번이 나왔습니다.");
			break;
		default: // 위에 있는 case에 속하지 않는 경우... 
			System.out.println("6번이 나왔습니다.");
		}
	}

}
