package OOPS1.Inheritance;

public class SavingsAccount extends Account {
 int interestRate;

 public int getInterestRate() {
	return interestRate;
}

public void setInterestRate(int interestRate) {
	this.interestRate = interestRate;
}

public SavingsAccount(double value1, int interestRate) {
	super(value1);
	this.interestRate=interestRate;
 }
 
 public void addInterest(){
	 double balance=getBalance();
	 double interestAmount=balance*this.interestRate/100;
	 double newBalance=balance+interestAmount;
	 setBalance(newBalance);
	 
	 
 }
 
 public void print() {
		System.out.println("Account Name is:" + this.accountName);
		System.out.println("Account Id is:" + this.accountId);
		System.out.println("Current Balance is:" + this.balance);
		System.out.println("InterestRate  is:" + this.interestRate);
	}
 
}
