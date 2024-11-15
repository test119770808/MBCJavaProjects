package quiz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CheckID {
	
	/*
	 *  사용자가 ID를 입력하면, 올바른 ID인지 체크하고, 올바른 ID라면 회원 배열에 추가하는
	 *  프로그램을 만들어 봅니다.
	 *  확인 내용 : 1)아이디 사이에 공백이 있는지, 2)중복된 아이디 인지 확인,
	 *        3) 영어, 숫자,_만 사용가능(다른 문자 사용 불가능), 
	 *        4) 글자수 제한 (20자) 
	 *        
	 *  [메뉴]
	 *   ============== 회원 등록 프로그램 ===================
	 *   1. 아이디 등록
	 *   입력 >> 1
	 *   id 입력 >> testuser
	 *   입력받은 아이디는 testuser 입니다.
	 *   
	 *   예외가 발생한 경우... 
	 *   공백이 존재합니다. 혹은 중복된 아이디 입니다. 혹은 유효하지 않는 문자가 있습니다.
	 *   글자수 제한은 20글자 입니다. ... 
	 */

	// List<Member> memList를 생성해서 작업을 진행합니다.
	static List<Member> memlist = new ArrayList<>();
	
	public static void main(String[] args) {
		// 메뉴 
		
		// 사용자 입력 : Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("============== 회원 등록 프로그램 =============");
			System.out.println("1. 아이디 등록");
			System.out.print("입력 >> ");
			int cmd = 0;
			try {   // 입력값으로 숫자가 아닌 문자열을 입력받을 경우에 예외 발생
				cmd = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수 이외 입력하지 마세요!!");
				scan.nextLine();    // 버퍼 정리
//				e.printStackTrace();
			}
			
			// switch - case 문을 사용하 기능
			switch (cmd) {
			case 1:     // 아이디 등록
				scan.nextLine();  // 버퍼 처리를 위해서 사용!
				System.out.print("id 입력 > ");
				String new_id = scan.nextLine();
				// 등록 작업을 진행... 
				// 검증을 필요로 함... 
				System.out.println("cmd : "+cmd);
				System.out.println("new_id : "+new_id);
				// 메서드 : addNewMember(new_id), 반환타입 boolean - true(성공), false(실패)
				if (addNewMember(new_id)) {
					System.out.println(memlist);  // 등록 정보 확인
				}
				break;

			default:
				break;
			}
		}
		

	}  // main end
	
	static boolean addNewMember(String id) {  // 아이디 등로 처리하는 메서드
		/*
		 * 	1)아이디 사이에 공백이 있는지, 2)중복된 아이디 인지 확인,
		 *  3) 영어, 숫자,_만 사용가능(다른 문자 사용 불가능), 
		 *  4) 글자수 제한 (20자) 
		 */
		System.out.printf("입력받은 아이디는 \"%s\"입니다.\n", id);
		
		id = id.trim().toLowerCase();  // 양끝 공백제거하고, 소문자로 변환
		
		// 1) 아이디 사이에 공백이 있는지 검증. 
		if(id.contains(" ")) {  // 입력한 값에 공백 여부 확인
			System.out.println("아이디 사이에 공백이 있습니다.");
			return false;
		}else if(chkIdDuple(id)) {  // 2) 중복된 아이디 체크
			System.out.println("ID 중복입니다.");
			return false;
		}else if(!chkValidChar(id)) {
			System.out.println("유효하지 않은 문자가 있습니다.");
			return false;
		}else if(id.length() > 20) {
			System.out.println("글자 수 제한은 20글자 입니다.");
			return false;
		}
		
		// id 추가 등록 작업
		Member member = new Member(id);
		return memlist.add(member);  // List.add() 반환 값은 true or false
	}
	
	// 2)중복된 아이디 인지 확인 chkIdDuple(id) 반환 타입 boolean-true(중복),false(중복X)
	static boolean chkIdDuple(String id) {
		// memList에 동일한 id가 있는 확인.... 
//		if (memlist.contains(id)) {
//			return true;
//		}
		for (int i = 0; i < memlist.size(); i++) {
			if(memlist.isEmpty()) {
				break;
			}else {
				if(id.equals(memlist.get(i).id)) {   // 중복확인
					return true;
				}
			}
		}
		return false;
	}
	
	// chkValidChar(id) 영어, 숫자, _만 가능. true(유효한문자용), false(유효한문자사용X)
	static boolean chkValidChar(String id) {
		
		String whiteList = "abcdefghijklmnopqrstuvwxyz_0123456789";
		
		for (int i = 0; i < id.length(); i++) {
			if(!whiteList.contains(""+id.charAt(i))) {
				System.out.println("invalid : "+id.charAt(i));
				return false;
			}
		}
		
		return true;
	}

}

class Member {
	
	String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id;
	}

}

