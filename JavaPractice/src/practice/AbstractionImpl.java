package practice;

import OOPS1.Abstraction.Abstract1;
import OOPS1.Abstraction.AbstractClass;
import OOPS1.Abstraction.RBCBank;
import OOPS1.Abstraction.TDBank;

public class AbstractionImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBCBank rbc = new RBCBank();
		double roi =rbc.getRateOfInterest();
		System.out.println("RBC's rate of interest "+ roi );
		
		TDBank td = new TDBank();
		double ri = td.getRateOfInterest();
		System.out.println("TD's Rate of Interest: "+ ri);
		
		
		AbstractClass abs= new AbstractClass();
				abs.method1();
				abs.method2();

		

	}

}
