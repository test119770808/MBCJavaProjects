package ch2;

public class VariableScope {
	// 변수의 범위는 해당 변수의 값이 영향을 주는 영역을 의미함. 
	
	public static void main(String[] args) {  // 메서드 영역
		int var1;
		var1 = 100;
		
		if(true) {				// 첫번째 if영역
			int var2;
			var2 = 200;
			System.out.println("첫번째 if영역");
			System.out.println("var1 출력 : "+var1);
			System.out.println("var2 출력 : "+var2);
			// var1, var2(첫번째 if에서 생성된 변수)를 사용 가능
		}
		// var2 변수는 사라짐... 
		
		if(true) {				// 두번째 if영역
			int var3;
			var3 = 300;
			System.out.println("두번째 if영역");
			System.out.println("var1 출력 : "+var1);
//			System.out.println("var2 출력 : "+var2);
			System.out.println("var3 출력 : "+var3);
			// var2는 사라져서 참조 못함. var1, var3 참조
		}
		// var3 변수 사라짐... 
		
		// var1만 참조 가능... var2,var3는 참조 못함.

	}

}
