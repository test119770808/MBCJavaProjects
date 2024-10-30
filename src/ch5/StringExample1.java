package ch5;

import java.util.Arrays;

public class StringExample1 {

	public static void main(String[] args) {
		// String : 문자열은 String 객체로 생성할 수 있어요.... 
		String name;   	// String 타입의 변수 name을 선언.
		name = "홍길동";	// name 변수에 문자열을 대입
		
		String hobby = "여행";	// String 타입 변수 hobby에 선언 후 문자열 대입...
		String hobby2 = "여행";  
		// 문자열 리터럴이 동일할 경우에는 String객체를 공유하게 된다... 
		// test = hobby; 대입 후에 test == hobby2와 비교했을 동등 비교가 가능합니다.
		String hobby3 = new String("여행");
		String test = hobby;
		
		System.out.println(test == hobby);
		System.out.println(test == hobby2);
		System.out.println(test == hobby3);
		// 문자열에서 equals()는 문자열 그 자체를 비교하기 때문에 동등비교가 가능함.
		System.out.println(test.equals(hobby3));  // 문자열을 비교할 때는 equals()를 사용하세요.
		
		// 1. 문자열 추출 => charAt(index값)
		String str = "자바는 즐거워!";
		//            0 123 45 67
		System.out.println("2번 인덱스 값을 추출 : " + str.charAt(2));  //'는'
		
		// 2. 문자열 길이 
		//  문자열에서 문자의 갯수를 알고 싶은 경우 사용 : length()
		System.out.println("문자열의 길이 : " + str.length());
		
		// 3. indexOf : 원하는 문자의 인덱스 값을 반환.
		String str2 = "Hello, world! 123456789";
		int world_index = str2.indexOf("world");
		System.out.println("world는 str2의 몇번 째 인덱스 위치인가? " + world_index);
		
		// 4. substring() : 문자열을 원하는 만큼 자른다. (인덱스 값을 기준)
		// substring(시작index값) => 해당 인덱스 이후 값을 짤라준다. 
		// substring(시작인덱스, 끝인덱스) => 해당 인덱스 범위에 있는 글자를 잘라 준다.
		System.out.println(str2.substring(7));
		System.out.println(str2.substring(8));
		System.out.println(str2.substring(9));
		System.out.println(str2.substring(10));
		
		System.out.println(str2.substring(7, 12));  // 끝인덱스 번호 전까지... 
		
		// 5. split() : 문자열을 원하는 기준(문자 또는 문자열)으로 자른다.  
		str = "apple/banna/kiwi/lemon/orange";
		String[] fruit = str.split("/");
		System.out.println(Arrays.toString(fruit));
		// ()에는 반드시 기준 문자 혹은 문자열 코드가 있어야 함. 
		
		// 6. contains() : 해당 문자가 문자열에 포함되어 있는지 여부를 체크
		//   포함되면 true, 그렇지 않으면 false를 반환.
		if(str.contains("apple")) {
			System.out.println("과일에 사과가 있습니다.");
		}else {
			System.out.println("과일에 사과가 없습니다.");
		}
		
		// 7. equals()는 문자열이 같은지 여부 확인
		
		// 8. replace() : 원하는 문자를 치환(바꾼다)
		//  replace(oldStr, newStr)
		//   - oldStr : 바꾸기 위해서 찾는 문자열
		//   - newStr : 변경할 문자열
		str = "abcde@naver.com";
		// naver -> microsoft 변경... 
		str = str.replace("naver", "microsoft");
		System.out.println(str);
		
		// 9. lastIndexOf() : 해당 문자를 뒤에서부터 찾아서 위치를 반환... 
		str = "abcd dcba";
		//     012345678    index 값
		System.out.println("indexOf(\"d\") : " + str.indexOf('d'));
		System.out.println("lastIndexOf(\"d\") : " + str.lastIndexOf('d'));
		
		// 두번째 "d"를 indexOf를 통해서 확인하는 방법.... 
		System.out.println("indexOf(\"d\")의 두번째 위치 : " + str.indexOf('d', 4));
		System.out.println("indexOf(\"d\")의 세번째 위치 : " + str.indexOf('d', 6));
		// 인덱스 값이 -1 인 경우에는 검색한 내용이 없는 경우... 

		// indexOf()를 사용하여 모든 내용을 검색하는 방법
		str = "apple/kiwi/apple/orange/lemon";
		int idx = 0;
		idx = str.indexOf("apple");
		System.out.println("첫번째 apple의 인덱스 값 : "+idx);
		idx = str.indexOf("apple", idx + 1);
		System.out.println("두번째 apple의 인덱스 값 : "+idx);
		idx = str.indexOf("apple", idx + 1);
		System.out.println("세번째 apple의 인덱스 값 : "+idx);
		
		// 10. toUpperCase, toLowerCase : 영문자를 대문자 혹은 소문자로 변환
		//  toUpperCase : 소문자를 대문자로... 
		//  toLowerCase : 대문자를 소문자로...
		String email = "abcd1234@NaVeR.CoM";
		str = "naver.com";
		
		email = email.toLowerCase();
		System.out.println(email);
		System.out.println(email.contains(str));
		
		// 11. trim : 문자열 바깥 쪽 공백 제거
		String id_1 = "    abc   123 ";
		String id_2 = " abc   123    ";
		
		System.out.println("before1 : " + id_1);
		System.out.println("before2 : " + id_2);
		
		System.out.println("equals : " + id_1.equals(id_2));
		
		id_1 = id_1.trim();
		id_2 = id_2.trim();
		
		System.out.println("after1 : " + id_1);
		System.out.println("after2 : " + id_2);
		
		System.out.println("eqauals : " + id_1.equals(id_2));
			
		// 12. format : 서식문자열을 이용하여 문자열을 만들어 반환
		str = String.format("%d:%d:%d", 17,17,30);
		System.out.println(str);
		
		
		// 13. endsWith : 지정한 문자로 끝나는지 검사
		str = "오늘할일.html";
		
		if (str.endsWith(".txt")) {
			System.out.println("확장자가 올바른 텍스트 파일입니다.");
		}else if (str.endsWith(".html") || str.endsWith(".htm")) {
			System.out.println("확장자가 웹 페이지 파일입니다.");
		}else {
			System.out.println("텍스트 또는 웹 페이지 파일이 아닙니다.");
		}
		
		
	}

}
