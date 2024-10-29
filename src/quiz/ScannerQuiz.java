package quiz;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.print("전화번호 : ");
		String tel = scan.nextLine();
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.print("몸무게 : ");
		double weight = scan.nextDouble();
		System.out.print("혈액형 : ");
		String bloodType = scan.nextLine();
		
		// 변수 사용해서 출력
		String banner = "========= 출력 결과 ========";
				
		System.out.println(banner);
		System.out.println("이름\t:" + name);
		System.out.println("나이\t:" + age);
		System.out.println("Tel\t:" + tel);
		System.out.printf("키\t: %f cm\n",height);
		System.out.printf("몸무게\t: %f kg\n",weight);
		System.out.println("혈액형\t:" + bloodType);

	}

}
