package ch2;

public class PrintingMethod {

	public static void main(String[] args) {
		// 표준 출력... System.out 
		// 출력은 화면, 데이터 전송 ... 
		// print(), pringln(), printf() .... 
		// 1. println (System.out.println(내용))
		//  괄호 안에 내용을 출력하고, 줄바꿈하세요...
		System.out.println("나는");
		System.out.println("오늘 아침을");
		System.out.println("먹었다.");
		// 2. print (System.out.print(내용))
		//  괄호 안에 내용을 출력하세요. 줄바꿈X
		System.out.print("나는\n오늘 아침을\n먹었다\n");
		// 3. printf (System.out.printf(내용, 값1, 값2, ...))
		//  형식 문자열에서 %와 conversation(변환문자)를 필수로 작성하고, 나머지 생략가능...
		//   %[argument_index$][flags][width][.precision]conversation
		//  conversation의 종류... 
		//  %d : 10진수 정수
		//  %o : 8진수 정수
		//  %x : 16진수 정수
		//  %s : 문자열
		//  %f : 실수
		//  %c : 문자
		
		// 정수 출력 
		int a = 5, b = 7;     // int a = 5; int b = 7;
		System.out.printf("%d + %d = %d\n", b, a, (a + b));
		
		System.out.printf("%10d\n", a);      // 10칸 확보 후 출력
		System.out.printf("%20d\n", a);      // 20칸 확보 후 출력
		System.out.printf("%020d\n", a);     // 20칸 확보 후 출력, 빈 곳을 0으로 채움
		System.out.printf("%-10d\n", a);     // 10칸 확보 후 출력, 왼쪽 정렬
		System.out.printf("%+10d\n", -a);     // 10칸 확보 후 출력, 부호 출력
		
		// 실수 출력
		double c = 1234.56789;
		System.out.printf("%f\n", c);        // 소수값 출력
		System.out.printf("%.3f\n", c);      // 소수점 3자리까지 출력
		System.out.printf("%20.3f\n", c);	 // 20칸 확보 후 소수점 3자리까지 출력
		System.out.printf("%020.3f\n", c);   // 20칸 확보 후 소수점 3자리까지 출력, 빈 곳을 0으로
		System.out.printf("%-20.3f\n", c);   // 20칸 확보 후 소수점 3자리까지 출력, 왼쪽 정렬
		
		// 문자열 출력
		String str = "hello, world!!!";
		System.out.printf("%s\n", str);      // 문자열 출력
		System.out.printf("%30s\n", str);    // 30칸 확보 후 출력
		System.out.printf("%-30s\n", str);   // 30칸 확보 후 출력. 왼쪽 정렬
		
		// 8진수 
		//  진수란? 진수 범위의 숫자 체계. 0 ~ 7(8개의 숫자)
		int d = 15;
		System.out.printf("%10d\n",d);   // 자연수-10진수
		System.out.printf("%10o\n",d);
		// 16진수란 숫자의 갯수 16개인 경우. 0 ~ 9, a ~ f(16개 숫자)
		System.out.printf("%10x\n",d);
		System.out.printf("%10X\n",d);
	}

}
