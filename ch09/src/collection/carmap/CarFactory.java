package collection.carmap;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
	// 자동차를 생성할때  HashMap에 저장
	private static CarFactory instance;
	private Map<String, Car> carMap = new HashMap<>();
	
	
	
	public static CarFactory getInstace() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
		
	}
	
	// 자동차 생성 메서드 
	
	public Car createCar(String name) { // 차이름 (key)
		if(carMap.containsKey(name)) { // carMap에 이름(key)이 있으면 
			return carMap.get(name); // 이름을 가져와서 반환 
		}
		//Car 객체 생성 
		Car car = new Car();
		//carMap에 name , car 저장
		
		carMap.put(name, car);
		return car;
		
	}

}
