package ifexample;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 줄 (행) 수계산
		// 변수 - customer(고객) , column(열 수) ,  row(줄 수)
		Scanner sc =new Scanner(System.in); // 입력 객체 sc 생성
		
		System.out.print(" 입장객 수 입력: ");
		int customer = sc.nextInt();
		
		System.out.print(" 좌석 열 수 입력: ");
		int column = sc.nextInt();
		
		int row = 0; //w줄수 
		// 연산 처리 (if ~ else 문)
		row = customer / column; 
		if(customer % column == 0 ) { // 나누어 떨어지면 
		System.out.println(row + "줄이 필요합니다");
			
			
		}else {//나머지가 잇으면 +1 
			row = customer / column + 1;
			System.out.println(row + "줄이 필요합니다.");
		}
		sc.close();
		
		

	}

}
