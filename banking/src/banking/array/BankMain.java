package banking.array;

import java.util.Scanner;

public class BankMain {
		//계좌를 저장할 배열의크기 100개로 설정
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	private static boolean isAccountExists(String ano) {
	    for (int i = 0; i < accounts.length; i++) {
	        if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	
	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			System.out.println("==========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("==========================================");
			System.out.print("선택>");
			
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo==1) {
				 createAccount(); // 계좌생성
			}else if (selectNo ==2 ) {
				getAccountList() ; // 계좌 목록 
			}else if (selectNo ==3 ) {
				deposit() ;  //입금
			}else if (selectNo ==4 ) {
				withdraw() ; //출금
			}else if (selectNo ==5 ) {
				sw= false; // 종료
				
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");
			}
			
		}//while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}
	
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("----------------------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------------------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine();
		if (isAccountExists(ano)) {
	        System.out.println("이미 존재하는 계좌 번호입니다. 다른 번호를 입력해 주세요.");
	        return;
	    }
		
		System.out.print("계좌 주: ");
		String ower = scanner.nextLine();
		
		System.out.print("초기 입금액: ");
		int balance = Integer.parseInt( scanner.nextLine());
		
		//accounts[0] = new Account(ano, ower, balance);// 연습데이터 1개 생성
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) { // 배열의 요소가 비어있을때 계좌를 저장함
				accounts[i] = new Account(ano, ower, balance); 
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			
			}
		}
		}
	
	
	// 계좌 목록
	
	private static void getAccountList() {
		System.out.println("----------------------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------------------");
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) { // 계좌가 있는 배열의 요소를 출력
		
		System.out.print("계좌번호: " + accounts[i].getAno() + "\t");
		System.out.print("계좌주: " + accounts[i].getOwner()+ "\t");
		System.out.println("잔고: " + accounts[i].getBalance());
	}
	}
	}
	
	// 입금
	private static void deposit() {
	System.out.println("----------------------------------");
	System.out.println("입금");
	System.out.println("----------------------------------");
	
	System.out.print("계좌 번호: ");
	
	String ano = scanner.nextLine();
	System.out.print("입금액: ");
	
	
	int money = Integer.parseInt( scanner.nextLine());
		if(findAccount(ano) != null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance()+money);
			System.out.println("결과: 정상 처리되었습니다.");
		}else {
			System.out.println("결과: 계좌가 없습니다.");
	}
	
	}
	
	
	// 출금
	private static void withdraw() {
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
	
	
	
	
	// 계좌검색
	private static Account findAccount(String ano) {
		Account account =null; // 찾을 계좌를 저장할 객체 변수 선언 
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno();// 이미 생성된 계좌 번호 가져옴 
				if(dbAno.equals(ano)) { // 외부에서 찾는 계좌와 일치하면 
					account = accounts[i]; // 일치하는 계좌를 저장함 
					break;
				}
			}
		}
	
		return account;
	}
}
