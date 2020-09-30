package OOPS1.Abstraction;

public class RBCBank extends Bank {

	@Override
	public double getRateOfInterest() {
		return 4.8;
	}
	
	
	   public void print() {
		   System.out.println(this.getRateOfInterest());
	   }
	

}
