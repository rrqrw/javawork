package abstracts.player;

public class AdvancedLevel extends PlayerLevel{
//중급자
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높히 jump 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 모름");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*******중급자 레벨입니다******");
		
	}

}
