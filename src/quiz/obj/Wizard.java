package quiz.obj;

public class Wizard extends Player {
	
	public Wizard() {}
	
	public Wizard(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Wizard(String name) {
		this(name, 500, 1000);
	}
	
	void iceArrow() {
		System.out.println("얼음화살 사용");
	}
	
	@Override
	void action() {
		System.out.println("마법사는 귀여운 동작을 합니다.");
	}
}
