package quiz.obj;

public class Quiz102 {

	public static void main(String[] args) {
		// 10-2

		Warrior w1 = new Warrior("강한친구");
		Wizard w2 = new Wizard("구르미");
		Warrior me = new Warrior("나의 캐릭터");
		
		Player[] target = new Player[2];
		target[0] = w1;
		target[1] = me;
				
		// w2의 블라자드를 5번 실행시키시오.
		for(int i = 0; i < 5; i++) {
//			w2.blizzard(target);
			w2.blizzard(new Player[] {w1,me});
		}
	}

}
