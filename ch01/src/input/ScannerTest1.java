package input;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력 처리 - scanner 클래스 사용
		// 문자열- nextLine()
		// 숫자 - nextInt()
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine();
		
		System.out.println("당신의 이름은" + name + " 이군요!");
		
		System.out.print("나이 입력 ");
		int age = scanner.nextInt();
		System.out.println("이름: "+ name + ", 나이:" + age);
		
		scanner.close();		 //닫기

		
				
				

	}

}
