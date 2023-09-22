package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {
		
		MyFunction1 functinon;
		
		//람다식 표현으로 추상 메서드를 실체로 구현 
		//매개 변수가 없음 
		//코드가 1줄인 경우 {} 생략가능
		/*functinon  = () -> {
			System.out.println("안녕");*/
			
		functinon  = () -> 	System.out.println("안녕");
			
		
		// 실행함수 호출 
		functinon.method();

	}

}
