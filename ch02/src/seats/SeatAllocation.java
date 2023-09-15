package seats;

import java.util.Scanner;

public class SeatAllocation {

	public static void main(String[] args) {
		// 자리 배치도 
		// 변수 - customer(입장객 수), column(열), row (줄)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입장객수 : ");
		int customer = scan.nextInt();
		
		System.out.print("좌석 열 수 : ");
		int column = scan.nextInt();
		
		int row; 
		if(customer % column ==0) {
			row= customer / column; 
			
			}else {
				row= customer / column +1 ;
			}
		// 충접 for 
		for(int i=0; i<row; i++) {
			for (int j= 1; j<= column; j++) {
				int seatNum =column * i + j;
				if(customer<seatNum ) 
					break;
				System.out.print("좌석" +seatNum+ " ");
				
			}
			System.out.println();
		}
		scan.close();

	}

}