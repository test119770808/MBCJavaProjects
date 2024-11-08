package ch9;


// 중첩 인터페이스
//  해당 클래스와 긴밀한 관계를 맺는 구현 객체를 만들기 위해서 클래스의 맴버로 선언된 인터페이스..
public class InterfaceEx1 {

	public static void main(String[] args) {
		// 버튼 객체 생성
		Button btnOk = new Button();
		
		// Ok버튼 클릭 이벤트를 처리할 ClickListener  구현 클래스 (로컬 클래스)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		// Ok버튼 객체에  ClickListener 구현 객체 주입... 
		btnOk.setClickListener(new OkListener());
		
		// Ok 버튼 클릭하기
		btnOk.click();
		//-------------------------------------------------------------
		// Cancel 버튼 객체 생성ㅌㅊ
		Button btnCancel = new Button();
		
		// Cancel 버튼 클릭시 이벤트 처리를 위한 ClickListener 구현 클래스(로컬 클래스)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		// Cancel 버튼 객체를 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		// Cancel 버튼 클릭
		btnCancel.click();
		
		// 익명사용 
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼에 대한 익명 객체 처리... ");
			}
		});
		btnCancel.click();
		

	}

}

// Button 클래스 
class Button {
	// 정적 멤버 인터페이스 
	public static interface ClickListener {
		// 추상 메서드
		void onClick();
	}
	
	// 필드 
	private ClickListener clickListener;
	
	// 메서드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
	
}





