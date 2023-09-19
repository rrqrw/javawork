package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		// person 객체 생성 
		Person sohee = new Person("박소희",10000);
		Person daeho = new Person("이대호",20000);
		
		// Bus 객체 생성 
		Bus bus100 = new Bus("bus100");
		Taxi kakaoTaxi = new Taxi("kakaoTaxi");
		
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		sohee.take(kakaoTaxi, 4800);
		
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		bus100.showInfo();
		kakaoTaxi.showInfo();

	}

}
