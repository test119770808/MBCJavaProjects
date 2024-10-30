package ch5;

import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {
		// 자바에서는 프로그램을 실행하기 위해서 main() 메서드를 작성하여 동작합니다. 
		// 이 main()에는 전달 받은 값으로 String[] args를 사용하고 있습니다. 
		System.out.println(args);
		System.out.println(Arrays.toString(args));
		
		if (args[0].equals("-d")) {
			System.out.println("옵션 d에 대한 작업을 진행합니다.....");
			System.out.println("옵션 d의 내용은 \""+ args[1]+"\"에 대한 내용입니다.");
		}

	}

}
