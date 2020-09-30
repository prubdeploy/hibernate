package practice;

import OOPS1.Inheritance.Account;
import OOPS1.Inheritance.ChequingAccount;
import OOPS1.Inheritance.SavingsAccount;

public class AccountInheritanceExe {
	
	public static void main(String[] args) {
		SavingsAccount sAccount=new SavingsAccount(5000,2);
		
		sAccount.addInterest();
		sAccount.print();
		double balnace = sAccount.getBalance();
		
		
	
		ChequingAccount cAccount=new ChequingAccount(4000, 300);
		cAccount.setTransactionCount(6);
		cAccount.deduct();
		cAccount.print();
		
		
		Account account=new SavingsAccount(5000,2);
		
		account.print();
		double balnace1=account.getBalance();
		System.out.println("Balance  is "+ balnace1);
		
		
		
	}

}
