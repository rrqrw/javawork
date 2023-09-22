package exeptions;

public class ExcptionHandling2 {
	
	public static void printLength(String data) {
		// 예외 처리 (실행 예외 - 런타임 오류 )
		try {
			// 에러가 발생할 수있는 영역
		int count =data.length();
		System.out.println("문자 수:" + count);
	}catch(NullPointerException e) {
		// 예외 처리 구문 
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		printLength("지하철");
		printLength(null);
		
		System.out.println("[프로그램 종료]");
		
		

		
	}

}
