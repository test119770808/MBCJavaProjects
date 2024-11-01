package ch6.obj;

public class Calculator {
	
	// 필드 (멤버 변수)
	int firstNumber;
	int secondNumber;
	
	// 생성자 (객체 생성시 멤버 변수의 초기화)
	public Calculator() {}  //기본 생성자... 
	
	// 멤버 초기화 생성자... 
	public Calculator(int firstNumber, int num2) {
		// this 는 해당 클래스(객체) 그 자체를 의미함.
		this.firstNumber = firstNumber;
		secondNumber = num2;
	}
	
	// Overload : 매개변수의 값을 가지고 메서드를 구분(타입, 갯수, 순서)
	public Calculator(int[] nums) {
		this.firstNumber = nums[0];
		this.secondNumber = nums[1];
	}
	
	// 메서드 : 클래스에서 기능, 동작과 관련된 기능을 의미하는 함수... 
	//    대부분 동사적 의미를 가지고 있습니다.
	
	// 계산기에서는 더하기, 빼기, 곱하기, 나누기를 통한 연산 작업을 구현.
	// 더하기
	public int plus() {
		return firstNumber + secondNumber;
	}
	
	public int plus(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int plus(int[] nums) {
		return nums[0] + nums[1];
	}
	
	// 빼기
	public int minus() {
		return firstNumber - secondNumber;
	}
	
	public int minus(int num1, int num2) {
		return (num1 - num2);
	}
	
	public int minus(int[] nums) {
		return nums[0] - nums[1];
	}
	
	// 곱하기 
	public int multiple() {
		return firstNumber * secondNumber;
	}
	
	public int multiple(int num1, int num2) {
		return (num1 * num2);
	}
	
	public int mutiple(int[] nums) {
		return nums[0] * nums[1];
	}
	
	// 나누기
	public double division() {
		if (secondNumber == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0.0;
		}
		return (int)((firstNumber / (double)secondNumber) * 100) / (double)100;
	}
	
	public double division(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0.0;   
		}
		return (int)((num1 / (double)num2) * 100)/(double)100;
	}
	
	public double division(int[] nums) {
		if (nums[1] == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0.0;   // 원래는 예외처리해야 하지만... 
		}
		return (int)((nums[0] / (double)nums[1]) * 100)/(double)100;
	}
	
	// 필드값을 출력하는 메서드
	public void numsInfo() { // console화면에 필드값 출력... 
		System.out.println("firstNumber의 값 : " + firstNumber);
		System.out.println("secondNumber의 값 : "+ secondNumber);
	}
	
	
	
	
	
	
	

}
