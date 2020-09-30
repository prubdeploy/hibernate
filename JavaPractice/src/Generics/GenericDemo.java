package Generics;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Box<Integer> box=new Box<Integer>();
		box.setX(10);
		
		System.out.println(box.getX());
		
		
		Box<String> boxString= new Box<String>();
		
		boxString.setX("Prudhvi");
		
		System.out.println(boxString.getX());
		
		
		Account acct =new Account();
		acct.setAcctID(0001);
		acct.setName("Pru");
		
		
		Box<Account> boxAccount= new Box<Account>();
		boxAccount.setX(acct);
		
		Account acct1=boxAccount.getX();
		
		System.out.println(acct1.getAcctID());
		System.out.println(acct.getName());
		


	}

}
