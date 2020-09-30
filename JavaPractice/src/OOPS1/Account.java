package OOPS1;

public class Account {
	
	private int accountId;
	private String accountName;
	private float balance;

	

	public int getAccountId() {
		return accountId;
	}



	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public float getBalance() {
		return balance;
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}



	public void display() {
		this.print();
	
	}
	
	public void Withdrawl(int amount){
		this.balance=this.balance-amount;
	}
	
	public void Credit(int cash){
		this.balance=this.balance + cash;
	}
	
	private void print()
	{
		System.out.println("Account Id is "+ this.accountId);
		System.out.println("Account Name is "+ this.accountName);
		System.out.println("Current Balance is "+ this.balance);
		System.out.println("Current Credit is "+ this.balance);
	}
	
}