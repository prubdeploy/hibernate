package practice;

import OOPS1.Account;

public class AccountObjectsExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Account acc1 =new Account();
		acc1.setAccountId(41790);
		acc1.setAccountName("Checkings");
		acc1.setBalance(43786);
	
		acc1.display();
		acc1.Withdrawl(200);
		acc1.display();
		

		Account acc2 =new Account();
		acc2.setAccountId(51771);
		acc2.setAccountName("Savings");
		acc2.setBalance(230000);
	
		acc2.display();
		acc2.Withdrawl(200);
		acc2.display();
		
		acc2.setBalance(10000);
		acc2.display();
		acc2.Withdrawl(200);
		acc2.display();
		acc2.Credit(500);
		acc2.display();
		acc2.Withdrawl(300);
		acc2.display();
		acc2.setBalance(8000);
		acc2.display();


	}

}