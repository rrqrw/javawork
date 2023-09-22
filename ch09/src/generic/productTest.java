package generic;

public class productTest {

	public static void main(String[] args) {
		// product 객체 생성<클래스, 문자열>
		Product<TV,String> prod1 = new Product<>();
		Product<Car,String> prod2 = new Product<>();
		
		
		//TV인스턴스 생성
		TV tv =new TV();
		Car car =new Car();
		
	prod1.setKind(tv);
	prod1.setModel("스마트TV");
	prod2.setKind(car);
	prod2.setModel("전기차");
	tv.making();
	car.making();
	System.out.println("모델명: " +prod1.getModel());
	System.out.println("모델명: " +prod2.getModel());

	}

}
