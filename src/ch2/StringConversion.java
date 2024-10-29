package ch2;

public class StringConversion {

	public static void main(String[] args) {
		// String -> 정수 숫자로 변환
		String str = "10";					// 문자열
		byte value = Byte.parseByte(str);   // Byte.parseByte(문자열-숫자형) -> byte 타입으로
		System.out.println(value);          // 데이터 타입은 byte로...
		System.out.println(value+100);      // value(byte-정수) + 100
		System.out.println(str + 100);      // str(문자열) + 100 -> 문자열 더하기는 문자로 덧붙이기
    
		// 숫자 문자열은 short로 변환  - short값의 크기를 벗어나면 안됨.
		short valueShort = Short.parseShort(str);
//		short valueShort2 = Short.parseShort("60000"); // NumberFormatException: Value out of range. Value:"60000" Radix:10
		// 숫자 문자열을 int로 변환
		int valueInteger = Integer.parseInt(str);
		long valueLong = Long.parseLong(str);
		
		// 문자열을 실수형으로 변환
		String pistr = "3.141";
		// String -> float
		float valueFloat = Float.parseFloat(pistr);
		System.out.println(valueFloat);
		// String -> Double
		Double valueDouble = Double.parseDouble(pistr);
		System.out.println(valueDouble);
		
		// String -> boolean
		String strBoolean = "true";
		boolean valueBoolean = Boolean.parseBoolean(strBoolean);
		System.out.println(valueBoolean);
		
		// 기본 자료형을 문자열로 변환?
		// String.valueOf() 메서드 사용... 
		String valueConversion = String.valueOf(valueFloat);
		System.out.println(valueConversion);
		
	}

}
