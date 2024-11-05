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
	
	// blizzard(Player[] players)
	public void blizzard(Player[] players) {
		System.out.println("----------------------------");
		System.out.println(this.name + "님의 눈보라 시전!");
		
		//1. for문사용(강화된 for문)
		for(Player play:players) {
			// 2. 난수 생성
			int demage = (int)(Math.random() * 6) + 10;  // 10 ~ 15
			// 3. hp 감소
			play.hp -= demage;
			// 4. 감소 내용 출력
			System.out.println(play.name + "님이 " + demage + "피해를 입었습니다." );
		}
		
	}
	
	
	
	
	@Override
	void action() {
		System.out.println("마법사는 귀여운 동작을 합니다.");
	}
}
