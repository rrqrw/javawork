package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class BankArratList {
	// 통장 계좌를 저장할 자료 구조의 객체 생성
	 static List<Account > accountList = new ArrayList<>();
	 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
boolean sw = true;
		
		while(sw) {
			System.out.println("====================================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제| 6.계좌검색| 7.종료");
			System.out.println("=====================================================");
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
					removeAccount() ; //계좌삭제
			}else if (selectNo ==6 ) {
				selectAccount();
			}else if (selectNo ==7 ) {
				sw= false; // 종료
				
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");
			}
			
		}//while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}// main 끝
	
		private static void createAccount() {
			System.out.println("----------------------------------");
			System.out.println("계좌 생성");
			System.out.println("----------------------------------");
			
			while(true) {
				
				
			System.out.print("계좌 번호(형식- 숫자만:00-00-000) ");
			String ano = scanner.nextLine();
		//중복계좌가있는지 체킹
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			  boolean result = Pattern.matches(regExp,ano );
			
			if(result) {
				
			
			if(findAccount(ano)!= null) { // 중복 계좌가 있으면 
				System.out.println("중복계좌 입니다. 다시 입력해 주세요.");
			}else { // 중복계좌가 없으면 
				System.out.print("계좌 주: ");
			String owner = scanner.nextLine();
			
			System.out.print("초기 입금액: ");
			int balance = Integer.parseInt( scanner.nextLine());
			// 입력받은 내용을 매개변수로 계좌 생성함 
			Account newAccount = new Account(ano, owner, balance);
			accountList.add(newAccount); // 리스트에 저장 
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
				}
			}else {
				System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요.");
			}
				
			}// whlie 빠져나오기
			
		}//while 끝
			//createAccount 끝
		private static void getAccountList() {
			System.out.println("----------------------------------");
			System.out.println("계좌 목록");
			System.out.println("----------------------------------");
			
			// 계좌목록 조회
			for(int i=0; i<accountList.size(); i++) {
				Account account = accountList.get(i);
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner()+ "\t");
				System.out.println("잔고: " + account.getBalance());
			}
			
		}//getAccountList끝
		
		
		private static void  deposit() {
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
			
		private static void removeAccount() {
			System.out.println("----------------------------------");
			System.out.println("계좌 삭제");
			System.out.println("----------------------------------");
			
			
			while(true) {
				System.out.print("계좌 번호: ");
				
				String ano = scanner.nextLine();
				if(findAccount(ano) != null) {
					for(int i=0; i<accountList.size(); i++) {
						String dbAno = accountList.get(i).getAno();
						if(dbAno.equals(ano)) {
							accountList.remove(i);
							System.out.println("결과: 계좌가 삭제 되었습니다.");
						break;
						}
					}
					break;
				}else {
					System.out.println("계좌 번호 형식이 아닙니다. 다시입력해주세요 형식(00-00-000");
				}
					
			}
		
		}
		// 특정 계좌검색
		private static void  selectAccount() {
			System.out.println("----------------------------------");
			System.out.println("계좌 검색");
			System.out.println("----------------------------------");
			System.out.print("계좌 번호: ");

			while(true) {
				System.out.print("계좌 번호: ");
				
				String ano = scanner.nextLine();
				if(findAccount(ano) != null) {
					for(int i=0; i<accountList.size(); i++) {
						String dbAno = accountList.get(i).getAno();
						if(dbAno.equals(ano)) {
							Account account = accountList.get(i);
							System.out.println("결과: 계좌가 검색 되었습니다.");
							System.out.print("계좌번호: " + account.getAno() + "\t");
							System.out.print("계좌주: " + account.getOwner()+ "\t");
							System.out.println("잔고: " + account.getBalance());
							
						break;
						}
					}
					break;
				}else {
					System.out.println("없는 계좌입니다.");
				}
					
			}
			
			
		}
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountList.size(); i++) {
			//이미 등록된 계좌를 가져와서 외부에서 입력한 계좌와 일치하는지 비교함
			Account accounts = accountList.get(i);
			if(accounts != null) {
				String dbA = accounts.getAno();
				if(dbA.equals(ano)) {
					account= accounts;
					break;
				}
			}
				
				}
			
		
		
		return account;
	}
	
	
	}

	
	
	
