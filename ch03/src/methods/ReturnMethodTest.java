package methods;

public class ReturnMethodTest {
	
	//return이 있는 함수 (변환 자료형) - int, String
	// 호출한 곳으로 반환값을 보냄
	

	public static void main(String[] args) {
		int n1 = 10 , n2 =20; // 지역 변수 - local 변수 
		// 더하기 함수 호출
		int resuit1 = add(n1 , n2);
		System.out.println("결과값1: " + resuit1);
		
		//제곱수 호출 
		square(n1);
		int resuit2 = square(n1);
		System.out.println("결과값2: " + resuit2);
		
		//메세지 호출
		String msg =message();
		System.out.println(msg);

	}
	// return 이 있고 , 매개변수 2개인 함수이름 - add()
    public static int add(int a, int b) {
    	return a +b;
    	
    }
    // 매개 변수 1개인 함수 
    public static int square(int x) {
    	return x * x;
    }
    
    //return이 있고 , 매개변수 없는 함수
    public static String message() {
    	String msg ="행운을 빌어요!";
    	return  msg;
    }
}