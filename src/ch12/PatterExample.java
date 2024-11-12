package ch12;

import java.util.regex.Pattern;

//Regex 정규 표현식
/*
 *   글자 문자 패턴 : []
 *     ex) [abc]  -> 한글자가 a, b, c 중에 하나인 경우
 *         [^abc] -> 한글자가 a, b, c 중 하나가 아닌 경우(제외)
 *         [a-zA-Z] -> 영문 대문자 소문자를 가리킴
 *         [0-9]  -> 0 ~ 9 사이의 숫자
 *   한개의 숫자를 표시하는 이스케이프 문자 : \d  (=> [0-9] )
 *   공백 : \s
 *   한개의 문자 혹은 숫자 특수문자(_) : \w ( => [a-zA-Z_0-9] )
 *   "." : \.     why? 정규표현식 . 은 한글자를 의미함. 
 *   모든 문자 중 한 개의 문자 : .
 *   한개 또는 없음 : ?
 *   모두 또는 없음 : *
 *   하나 이상 있음 : +
 *   {n} : n 개 인 경우 (n은 숫자)
 *   {n,} : n 개 이상인 경우
 *   {n,m} : n 개 이상 m개 이하인 경우
 *    | : or의 의미  ex) a|b  -> a또는 b
 *   () : 그룹핑
 *  
 */


public class PatterExample {

	public static void main(String[] args) {
		
		// 정규 표현식 문자열 (전화번호 검증) 
//		String  regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String  regExp = "(02|010)-[0-9]{3,4}-[0-9]{4}";
		// \\d -> [0-9]
		String data = "010-123-4567";
		
		// matches()는 정규표현식과 데이터 사이 관계
		//  형태가 정규표현식과 같으면 true, 그렇지 않으면 false를 반환
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; 
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		 
		

	}

}
