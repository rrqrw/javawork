package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 충접for문
		// 5행 5열에 '*' 출력
		for(int i=1; i<= 5; i++){
		for(int j=1; j<=5; j++) {
			System.out.print('*');
		
	}
		System.out.println();//한줄띄움
}      

		 /*i=1 j=1 *
		       j=2 **
		       j=3 ***
		       j=4 ****
		       j=5 *****
		  i=2  j=1 *
		       j=2 **
		       j=3 ***
		       j=4 ****
		       j=5 ***** 
		        */
		// 삼각형 모양1 - 행의 변화는 없고 열은 행이 증가때마다 1씩 증가
		for(int i=1; i<= 5; i++){
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			
		}
			System.out.println();//한줄띄움
	}      
		for(int i=1; i<= 5; i++){
			for(int j=i; j<=5; j++) {
				System.out.print('*');
			
		}
			System.out.println();//한줄띄움
		}
		System.out.println();//한줄띄움
		for(int i=1; i<= 5; i++){
			for(int j=5; j>=i; j--) {
				System.out.print('*');
			System.out.println("i=" + i  + "j="+ j  );
				
			}
			System.out.println();//한줄띄움
		}
	}
}

