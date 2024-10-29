package quiz;

import java.util.Scanner;

public class Coffeeprize {

	public static void main(String[] args) {
		// 10잔 이하는 2000원
		// 10잔 초과시 10잔 이후 초과분은 1500원으로... 
		
		// 1. 커피 잔 갯수 입력 
		Scanner scan = new Scanner(System.in);
		
		// 커피 갯수 입력 
		System.out.print("커피 구매 잔 수 입력 : ");
		int qty = scan.nextInt();
		// 금액 변수
		int price = 0;
		
		// 기본 커피 금액 : 2000
		int normal_price = 2000;
		// 할인된 커피 금액 : 1500
		int discount_price = 1500;
		
		// 10 이하 , 10초과시... 
		if (qty > 10) {  // 11 이상.... 
			price += (10 * normal_price) + (qty - 10) * discount_price;
			// price = (10 * normal_price) + (qty - 10) * discount_price;
		}else {
			price += (normal_price * qty);
		}

		// 금액 출력
		System.out.println("커피 가격은 " + price + "원 입니다.");
	}

}
