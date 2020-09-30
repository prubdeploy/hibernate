package OOPS1.Inheritance;

public class ChequingAccount extends Account {
	

	int dailyLimit;
	 int transactionCount;
	 
	 
	 
	public int getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(int dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	public ChequingAccount(double balance, int dailylimit){
		super(balance);
		 this.dailyLimit=dailylimit;
	 }
	 
	 public void deduct() {
		if(transactionCount>5) {
			double  newBal=getBalance()-5;
			
			setBalance(newBal);
		}
	 }
	 

	 public void print() {
			System.out.println("Account Name is:" + this.accountName);
			System.out.println("Account Id is:" + this.accountId);
			System.out.println("Current Balance is:" + this.balance);
			System.out.println("transaction limit  is:" + this.transactionCount);
			System.out.println("dailiy  limit  is:" + this.dailyLimit);
		}
	 

}
