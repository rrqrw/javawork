package inheritance.statment;

public class SaleStatement {

	public static void main(String[] args) {
		// Drink 클래스 사용
		Drink coffee = new Drink("커피" , 2500, 10);	
		Drink 녹차 = new Drink("녹차" , 3000 , 4);
		
		
		//Alcohol 클래스사용
		Alcohol 소주 = new Alcohol("소주" , 4000 , 3 ,15.1f);
		Alcohol 맥주  = new Alcohol("맥주" , 5000 , 5 ,5.5f);
		// 전표 출력 
		Drink.printTitle(); // 제목행
		coffee.printData();
		녹차.printData();
		System.out.println("==============================");
		//Alcohol 전표 출력
		Alcohol.printTitle();
		소주.printData();
		맥주.printData();
		// 총계 출력
		int sumVal = coffee.getTotalprice() + 녹차.getTotalprice()
			+ 소주.getTotalprice() + 맥주.getTotalprice();
		System.out.println("\n****** 합계 금액 " + sumVal + "원 ******");
	}
	
	
}
