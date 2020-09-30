package Generics;

public class GenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acct=new Account();
		
		acct.genericDisplay("Prudhvi");
		acct.genericDisplay(1000);
		acct.genericDisplay(100.34);
		
		
		acct.genericDisplay("Prudhvi", 100);
		acct.genericDisplay(100.56, "Java");



	}

}
