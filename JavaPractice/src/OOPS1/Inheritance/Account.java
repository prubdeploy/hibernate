package OOPS1.Inheritance;

public class Account {
	
	String accountName;
	int accountId;
	double balance;
	
	public  Account(double value1) {
		this.balance=value1;
	}
	
	
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void print() {
		System.out.println("Account Name is:" + this.accountName);
		System.out.println("Account Id is:" + this.accountId);
		System.out.println("Current Balance is:" + this.balance);
	}
}
