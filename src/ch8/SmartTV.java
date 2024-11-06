package ch8;

// 다중 인터페이스 
public class SmartTV implements RemoteControl, Searchable {  // 다중 구현체... 

	// Searchable 인터페이스의 추상 메서드
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	// RemoteControl 인터페이스의 추상 메서드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
