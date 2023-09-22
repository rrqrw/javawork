package exeptions;

public class ExcptionHandling1 {
	
	public static void printLength(String data) {
		int count =data.length();
		System.out.println("문자 수:" + count);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		printLength("지하철");
		printLength(null);
		
		System.out.println("[프로그램 종료]");
		
		

	}

}
