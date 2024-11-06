package ch8;

public class SealedInterfaceEx {

	public static void main(String[] args) {
		ImplClass impl = new ImplClass();
		
		interfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		interfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println();
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}

// interfaceA
sealed interface interfaceA permits interfaceB {
	void methodA();
}

non-sealed interface interfaceB extends interfaceA {  // interfaceA 를 상속
	void methodB();
}

interface interfaceC extends interfaceB {
	void methodC();
}

// 구현체
class ImplClass implements interfaceC {

	@Override
	public void methodB() {
		System.out.println("methodB() 실행");
	}

	@Override
	public void methodA() {
		System.out.println("methodA() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
	
}

