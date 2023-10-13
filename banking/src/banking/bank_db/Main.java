package banking.bank_db;

import java.util.Scanner;

import banking.domain.AccountDAO;

public class Main {

	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		boolean sw = true;
		Scanner scanner = new Scanner(System.in);
		
		while(sw) {
			System.out.println("====================================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제| 6.계좌검색| 7.종료");
			System.out.println("=====================================================");
			System.out.print("선택>");
			
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo==1) {
				 dao.createAccount(); // 계좌생성
			}else if (selectNo ==2 ) {
				dao.getAccountList();// 계좌 목록 
			}else if (selectNo ==3 ) {
				dao.deposit(); //입금
			}else if (selectNo ==4 ) {
				dao.withdraw(); ; //출금
			}else if (selectNo ==5 ) {
				dao.removeAccount();	  //계좌삭제
			}else if (selectNo ==6 ) {
				dao.selectAccount();
			}else if (selectNo ==7 ) {
				sw= false; // 종료
				
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");
			}
			
		}//while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}

}
