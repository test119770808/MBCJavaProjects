package program;

import java.util.Scanner;

public class CustomerManager {
	
	// 멤버 변수 선언(필드)
	
	// 데이터를 저장할 배열의 최대 크기를 정하기 : 100
	static final int MAX = 100;
	
	// 고객 정보를 저장할 변수를 배열로 선언(이름, 성별, 이메일, 탄생년도)
	static String[] nameList = new String[MAX];  	// 이름
	static String[] genderList = new String[MAX];	// 성별
	static String[] emailList = new String[MAX];	// 이메일	
	static int[] birthYearList = new int[MAX];		// 출생년도
	
	// 배열에서는 참조를 인덱스를 필요로 함
	static int index = -1;		// 배열은 0부터 시작하기 때문에 최소 인덱스는 -1로 설정

	// 배열은 처음 선언한 크기보다 같거나 적은 개수의 자료를 저장함.
	// 때문에 현제 데이터가 몇 개 저장되어 있는지 알 수 있어야 합니다.
	static int count = 0;
	
	// 기본 입력 장치로부터 데이터를 입력 받기 위해서 Scanner 객체를 생성
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 메뉴 작성... 
		while (true) {
			System.out.printf("\n[Info] 고객 수 : %d, 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 선택해 주세요 : ");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, "
					+ "(U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			
			switch(menu.charAt(0)) {
				case 'i':
					System.out.println("고객 정보 입력을 시작합니다.");
					if(count >= MAX) {   
						System.out.println("더 이상 저장할 수 없어요.");
					}else {
						// 고객 정보를 저장하는 기능.... insertCustomerData() 메서드를 구현... 
						insertCustomerData();
						System.out.println("고객 정보를 저장했습니다.");
					}					
					break;
				case 'p':
					System.out.println("이전 데이터를 출력합니다.");
					if(index <= 0) {
						System.out.println("이전 데이터가 존재하지 않습니다.");
					}else {
						// index를 이용하여 데이터를 출력... 
						index--;   // index = index - 1; or index -= 1;
						printCustomerData(index);  // 인덱스를 사용하여 데이터를 출력하는 메서드
					}
					break;
				case 'n':
					System.out.println("다음 데이터를 출력합니다.");
					if (index >= count -1) {
						System.out.println("다음 데이터가 존재하지 않습니다.");
					}else {
						index++;
						printCustomerData(index);
					}
					break;
				case 'c':
					System.out.println("현재 데이터를 출력합니다.");
					if((index >= 0) && (index < count)) {
						printCustomerData(index);
					}else {
						System.out.println("출력할 데이터가 선택되지 않았습니다.");
					}
					break;
				case 'u':
					System.out.println("데이터를 수정합니다.");
					// update를 선택하면 현재 인덱스의 자료를 수정하는 메서드를 구현
					// updateCustomerData(int index)
					if((index >= 0) && (index < count)) {
						updateCustomerData(index);
					}else {
						System.out.println("수정할 데이터가 선택되지 않았습니다.");
					}
					break;
				case 'd':
					System.out.println("데이터를 삭제합니다.");
					if((index >= 0) && (index < count)) {
						System.out.println(index + "번째 인텍스 데이터를 삭제합니다.");
						deleteCustomerData(index);
					}else {
						System.out.println("삭제할 데이터가 선택되지 않았습니다.");
					}
					break;
				case 'q':
					System.out.println("프로그램을 종료합니다.");
					scan.close();
					System.exit(0);   // 프로세스 종료... 
				default:
				System.out.println("메뉴를 잘 못 선택했습니다.");
			}	
		}	
		
	}  // main() end
	
	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		// 고객 정보를 배열에 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count ++; // count번째 배열에 값을 저장한 후 count값 증가 처리... 
	}
	
	public static void printCustomerData(int index) {
		System.out.println("====== Customer Info ======");
		System.out.println("이름 : " + nameList[index]);
		System.out.println("성별 : " + genderList[index]);
		System.out.println("이메일 : " + emailList[index]);
		System.out.println("출생년도 : " + birthYearList[index]);
		System.out.println("===========================");
	}
	
	public static void updateCustomerData(int index) {
		System.out.println("====== Update Customer Info ======");
		System.out.print("이름(" + nameList[index] + "): ");
		nameList[index] = scan.next();
		System.out.print("성별(" + genderList[index] + ") : ");
		genderList[index] = scan.next();
		System.out.print("이메일(" + emailList[index] +") : ");
		emailList[index] = scan.next();
		System.out.print("출생년도(" + birthYearList[index] + ") : ");
		birthYearList[index] = scan.nextInt();
		System.out.println("==================================");
			
	}
	
	public static void deleteCustomerData(int index) {
		for (int i = index; i < count -1; i++) {
			nameList[i] = nameList[i + 1];
			genderList[i] = genderList[i + 1];
			emailList[i] = emailList[i + 1];
			birthYearList[i] = birthYearList[i + 1];
		}
		count --; // count로 줄이면 마지막 위치값이 변경.... 
	}

	
	
	
	
	
}
