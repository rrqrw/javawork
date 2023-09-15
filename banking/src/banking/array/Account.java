package banking.array;

public class Account {
	// 필드
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano,String owner,int balance) {
		this.ano =ano;
		this.owner = owner;
		this.balance = balance;
		
		
	}
	
	public void setAno(String ano) {
		this.ano= ano;
		
	}
	public String getAno() {
		return ano;
	}
	public void setOwner(String owner) {
		this.owner= owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		
	}
	public int getBalance() {
		return balance;
	}
	
	public boolean withdraw(int amount) {
	    if (balance >= amount) {
	        balance -= amount;
	        return true;
	    } else {
	        return false;
	    }
	}

	
	
	
	
	
	
	
	
}