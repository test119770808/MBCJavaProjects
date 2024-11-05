package quiz.obj;

public class Quiz8 {

	public static void main(String[] args) {
		
		System.out.println("----마법사----");
		Wizard play1 = new Wizard("구르미그린달빛");
		play1.info();
		
		System.out.println("-----전사----");
		Warrior play2 = new Warrior("강한친구대한전사");
		play2.info();

	}

}
