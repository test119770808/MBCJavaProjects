package ch6;

import ch6.obj.Super;

public class ModifierExample {
	
	/*
	 *  접근 제한자 
	 *   : 중요한 필드(멤버변수)나 메서드가 외부로 노출되지 않도록 해서 객체의 무결성을 유지하기 위해서
	 *   접근 제한을 둘 때 사용함. 
	 *   
	 *   무결성 : 변함이 없이 고유하다는 특징. 즉, 변경이나 위조가 없다는 뜻.
	 *   
	 *   접근 제한자 종류 : public, protected, (default), private
	 *   
	 *   public -> 제한 대상(사용가능한 것들) : 클래스, 필드, 생성자, 메서드
	 *             제한 범위 : 없음. 모두 접근 가능.
	 *   protected -> 제한 대상 : 필드, 생성자, 메서드
	 *             제한 범위 : 같은 패키지이거나, 자식 객체만 접근이 가능함. 
	 *   (default) -> 제한 대상 : 클래스, 필드, 생성자, 메서드
	 *             제한 범위 : 같은 패키지인 경우에만 접근이 가능함. 
	 *   private -> 제한 대상 : 필드, 생성자, 메서드
	 *             제한 범위 : 같은 클래스인 경우에만 접근이 가능함.(즉, 객체 내부에서만 접근 가능)
	 *   
	 */
	

	public static void main(String[] args) {
		// 접근 제한제 테스트 
		System.out.println(" ***** Super 참조 ***** ");
		// Super 객체 생성
		Super sup = new Super();
		System.out.println("num1 = " + sup.num1 +
//					"\tnum2 = " + sup.num2 			// protected이기 때문에 같은 패키지 또는 상속
//					"\tnum3 = " + sup.num3			// default이기 때문에 같은 패키지여야 접근 가능
					"\tnum4 = " + sup.getNum4()		// 패키지 내에 있는 public메서드를 사용해서 private에 접근
				);
		
		System.out.println("\n ***** Sub 참조 *****");
		Sub sub = new Sub();
		sub.print();

	}

}

// 자식 클래스
class Sub extends Super {  // extends를 사용하여 상속하는 부모를 지정!
	
	private int num5 = 50;
	
	// 생성자에 대한 접근 제한... 
	// public : 모든 패키지에서 생성자를 호출 할 수 있어요...
	// protected : 같은 패키지 혹은 부모 자식관계에서 생성자를 호출 할 수 있어요. 
	// default : 같은 패키지에서 생성자를 호출할 수 있어요. 
	// private : 같은 클래스에서 생성자를 호출할 수 있어요. 
	
	// 기본 생성자
	public Sub() {}      
		
	// 상속관계에서의 접근 제한자... 
	public void print() {
		System.out.println("Super num1 = " + num1); // num1 - public (제한 X)
		System.out.println("Super num2 = " + num2); // num2 - protected (같은 패키지, 상속)
		// num2는 같은 패키지인가요? 아니요. 상속 관계인가요? 예
		
		// System.out.println("Super num3 = " + num3); // num3 - (default) (같은 패키지)
		// System.out.println("Super num4 = " + num4); // num4 - private (클래스 내부)
  		System.out.println("Sub num5 = " + num5);
	}
}







