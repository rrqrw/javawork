package hiding.accounts;

public class AccountsTest2 {

	public static void main(String[] args) {
		// 생성자를 통해서 계좌정보 입력
		Account account = new Account("11-222-3333","김대박",10000);
		
		//계좌번호 출력
		System.out.println("계좌 번호: " +account.getAno());
		System.out.println("계좌 주:" +account.getOwner());
		System.out.println("잔고:" +account.getBalance());
		
		
		

	}

}
