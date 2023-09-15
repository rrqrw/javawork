package arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// 변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K7";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("================");
		//배열- 순서가 있음 0번부터 시작
		// 직접 저장 - 중괄호{} 사용
		String[] cars = {"Sonata","Morning","K7","K7"};// 배열의 크기 선언
		//String[] cars = new String[]{"Sonata","Morning","K7","K7"}; 위에랑 같은거
		System.out.println(cars [0]);
		System.out.println(cars [1]);
		System.out.println(cars [2]);
		System.out.println(cars [3]);
		
		// 배열의 크기 (개수)- 배열이름.lenght
		System.out.println("배열의 크기:" + cars.length);
		
		System.out.println("================");
		//for문 - 전체 조회
		for(int i = 0; i < cars.length ; i++) { 
			
			System.out.println(cars[i]); // 0 , 1, 2, 3
		}
	}

}
