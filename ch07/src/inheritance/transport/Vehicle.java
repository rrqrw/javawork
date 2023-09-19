package inheritance.transport;

public class Vehicle {
	String vehicleName;  // 차량이름
	int money;			// 수입
	int passengerCount; // 승객수

	//생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	//메서드 -태우다 
	public void carry(int fare) { //요금
		this.money += fare;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("%s의 수입은 %,d 원이고, 승객수는 %d명입니다.\n ",
				vehicleName, money , passengerCount);
	}
}
