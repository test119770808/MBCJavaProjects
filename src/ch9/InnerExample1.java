package ch9;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 자바의 GUI
//  프로그램 인터페이스 그래픽화하여 작동시키는 것을 말함. 
//  - AWT (만들기는 쉽고 무거움)
//  - Swing (만들기는 어렵고 가벼움)
// Frame 또는 JFrame 클래스를 사용하여 GUI 작업을 진행. 
// 프레임 창을 구현하면 그 이후에 각종 이벤트 처리 및 버튼, 패널, 입력창, 메뉴바, 속성 같은 요소들을 각 클래스를
// 이용하 구현.
// A라는 Frame 클래스 각종 구성요소 클래스들을 전부 호출. 구성요소인 클래스들은 각 프레임 창별로 달라지게 된다.
// 이럴 때 개별 클래스화 하게 되면 여러가지 측면에서 낭비 발생하게 됨. 

public class InnerExample1 {
	
	// 필드
	private Frame f; // java.awt.Frame
	
	// 생성자
	public InnerExample1() {
		f = new Frame("Inner 예제"); // 창이름
	}
	
	// 메서드
	public void launchFrame() {
		// frame 창에 대한 속성 지정... 
//		f.addWindowListener(new MyWindowAdapter());
		// 익명 사용... 
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);  // 시스템 종료
			}
			
		});
		f.setSize(300, 200);  // 단위 픽셀
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		InnerExample1 ie = new InnerExample1();
		ie.launchFrame();

	}
	// 인스턴스 멤버 클래스
	private class MyWindowAdapter extends WindowAdapter {

		// 창에 X 버튼 클릭시
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);  // 시스템 종료
		}
		
	}
	

}
