package inheritance.transport;
// 사람 클래스 (자료형 )
public class Person {
	// 필드 
	String name;// 이름 
	int money; // 가진돈 
	
	public Person(String name, int money) {
		this.name = name;
		this.money= money;
		
	}
	//교통수단 이용 메서드 
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
		
	}
	
	
	
	// 사람의 정보 
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.\n",name,money);
	}

}
