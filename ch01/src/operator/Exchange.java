package operator;

public class Exchange {

	public static void main(String[] args) {
		// 변수의 값 교환
		int x = 0;
		int y = 1;
		int temp; // 임시 변수선언
		
		//출력
		System.out.println("****** 교환전 ******");
		System.out.println("x=" + x +",y=" + y);
		//System.out.println(y);
		
		//교환 처리(연산)
		temp = x;    // temp = 0
		x = y ;      //x = 1
		y = temp;    //y = 0
		
		System.out.println(); //한줄 공백
		
		
		
		//출력
		System.out.println("****** 교환후 ******");
	    System.out.println("x=" + x +",y=" + y);
		

	}

}
