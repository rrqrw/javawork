package abstracts.player;

public class Beginner extends PlayerLevel{
//초보자
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 할 줄 모름");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 모름");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*******초보자 레벨입니다******");
		
	}

}
