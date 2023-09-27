package collection.carmap;

public class CarTest {

	public static void main(String[] args) {
		// 싱글톤이므로  factory의 주소는 동일하다
		CarFactory factory = CarFactory.getInstace();
		
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2);
		
		Car bmw1  = factory.createCar("전기차");
		Car bmw2  = factory.createCar("전기차");
		System.out.println(bmw1 == bmw2);
		
		
		System.out.println(sonata1 == bmw1);

	}

}
