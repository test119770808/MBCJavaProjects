package ch11;

import java.io.IOException;

// 일반 예외 (checkedException) - 컴파일러가 코드 처리 여부를 검사하는 예외
//   일반 예외가 발생하는 경우에는 반드시 예외처리를 진행해야 함.... 
//   IOException, FileNotFoundException, SQLException, ClassNotFoundException.... 
public class ExceptionExample2 {

	public static void main(String[] args) {
		System.out.println("값을 입력받는 프로그램입니다.");
		
		byte[] data = new byte[100];   // 100byte길이의 저장공간
		
		try {
			System.in.read(data);   /// 일반 예외 
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력 받은 문자열은 ");
		System.out.println(new String(data).trim());

	}

}
