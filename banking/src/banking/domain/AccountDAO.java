package banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//Account를 생성,조회, 수정, 삭제하는 클래스
//DAO -Data Access Object

public class AccountDAO {
	
  Scanner scanner = new Scanner(System.in);
	public  void createAccount() {
		System.out.println("----------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------");
		
		while(true) {
			
			
		System.out.print("계좌 번호(형식- 숫자만:00-00-000) ");
		String ano = scanner.nextLine();
	
		String regExp = "\\d{2}-\\d{2}-\\d{3}";
		  boolean result = Pattern.matches(regExp,ano );
		
		if(result) {
			
			//중복계좌가있는지 체킹
		if(findAccount(ano)!= null) { // 중복 계좌가 있으면 
			System.out.println("중복계좌 입니다. 다시 입력해 주세요.");
		}else { // 중복계좌가 없으면 
			while(true) {
				System.out.print("계좌 주: ");
				String owner = scanner.nextLine();
				regExp="[a-zA-z가-힣]+"; //영어 ,한글만
				result = Pattern.matches(regExp, owner);
				if(result) {
					
					System.out.print("초기 입금액: ");
					int balance = Integer.parseInt( scanner.nextLine());
					//db작업
					
					
					break;
				}else {
					System.out.println("계좌주 이름은 한글과 영문만 가능합니다. 다시 입력해 주세요.");
				}
			}//안쪽 while끝
			break;
			}
		}else {
			System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요.");
		}
			
		}// whlie 빠져나오기
		
	}//바while 끝
	public void getAccountList() {
		System.out.println("----------------------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------------------");
		
		List<Account> accountList = new ArrayList<>();
		// 계좌목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner()+ "\t");
			System.out.println("잔고: " + account.getBalance());
		}
		
	}//getAccountList끝
	
	
	public  void  deposit() {
		System.out.println("----------------------------------");
		System.out.println("입금");
		System.out.println("----------------------------------");
		
		System.out.print("계좌 번호: ");
		
		String ano = scanner.nextLine();
		System.out.print("입금액: ");
		
		
		int money = Integer.parseInt( scanner.nextLine());
			if(findAccount(ano) != null) { // 찾는계좌가 있으면 
				Account account = findAccount(ano);
				account.setBalance(account.getBalance()+money);
				System.out.println("결과: 정상 처리되었습니다.");
				
			}else {
				System.out.println("결과: 계좌가 없습니다.");
		}
		
		}//deposit()끝
	
	public void withdraw() {
		System.out.println("----------------------------------");
		System.out.println("출금");
		System.out.println("----------------------------------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
	    if (account == null) {
	        System.out.println("계좌를 찾을 수 없습니다.");
	        return;
	    }

	    while (true) { 
	        System.out.print("출금액: ");
	        int amount = Integer.parseInt(scanner.nextLine());

	        if (amount <= 0) {
	            System.out.println("출금액은 양수만 입력하세요.");
	        } else if (account.getBalance() < amount) {
	            System.out.println("잔액이 부족합니다. 현재 잔액: " + account.getBalance());
	        } else {
	            boolean result = account.withdraw(amount);
	            if (result) {
	                System.out.println("결과: 출금이 성공적으로 완료되었습니다.");
	            } else {
	                System.out.println("출금에 실패했습니다. 다시 시도해 주세요.");
	            }
	            break;
	        }
	    }
		
	}
		
	public  void removeAccount() {
		System.out.println("----------------------------------");
		System.out.println("계좌 삭제");
		System.out.println("----------------------------------");
		
		
		while(true) {
			System.out.print("계좌 번호: ");
			
			String ano = scanner.nextLine();
			if(findAccount(ano) != null) {
				//dn
					break;
					
			}else {
				System.out.println("계좌 번호 형식이 아닙니다. 다시입력해주세요 형식(00-00-000");
			}
				
		}
	
	}
	// 특정 계좌검색
	public  void  selectAccount() {
		System.out.println("----------------------------------");
		System.out.println("계좌 검색");
		System.out.println("----------------------------------");
		System.out.print("계좌 번호: ");

		while(true) {
			System.out.print("계좌 번호: ");
			
			String ano = scanner.nextLine();
			if(findAccount(ano) != null) {
				
				break;
			}else {
				System.out.println("없는 계좌입니다.");
			}
				
		}
		
		
	}
	public  Account findAccount(String ano) {
	Account account = null;
	
				
			
		
			
			
	
	
	
	return account;
}
}
