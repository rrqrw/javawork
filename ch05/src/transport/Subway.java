package transport;

public class Subway {
	//필드
	String lineNumber;   //지하철 호선
	int passenger;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int fee) { //요금을 받음
		this.money += fee;   //요금을 더해서 수입이 늘어남
		passenger++;         //승객수 1명 증가, passenger=passenger+1
	}
	
	//지하철의 정보
	public void showSubwayInfo() {
		System.out.printf("지하철 %s의 수입은 %,d원이고, 승객수는 %d명 입니다.\n", 
				lineNumber, money, passenger);
	}
}
