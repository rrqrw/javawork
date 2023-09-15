package polymorphism.animals;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	
	/*public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}*/
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	
	/*public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}*/
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다..");
	
}
}
public class AnimalTest {
	// moveAnimal() 정의
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		
		// AnimalTest 객체 생성
		AnimalTest aTest = new AnimalTest();
		
		// Animal 타입으로 객체 생성
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		
		
		// moveAnimal() 호출
		aTest.moveAnimal(human);
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(tiger);
		
		

	}

}
