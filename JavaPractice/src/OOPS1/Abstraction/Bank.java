package OOPS1.Abstraction;

public abstract  class Bank {
	
	String AccountName;
	int AccountId;
	
	
	
	public String getAccountName() {
		return AccountName;
	}



	public void setAccountName(String accountName) {
		AccountName = accountName;
	}



	public int getAccountId() {
		return AccountId;
	}



	public void setAccountId(int accountId) {
		AccountId = accountId;
	}


     public void print() {
    	 System.out.println(this.AccountName);
    	 System.out.println(this.AccountId);
     }
	public abstract double getRateOfInterest();
		

}
