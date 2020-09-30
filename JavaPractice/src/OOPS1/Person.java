package OOPS1;

public class Person {
	
	/*public Employee(){
		
		this.ceo="Prudhvi";
	}
	public Employee(String deptName){

		this.ceo="Prudhvi";
		
		this.deptName=deptName;
	}
	*/
	
	private String pName;
	private String pGender;
	private String pOccupation;
	private String pAddress;
	

	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public String getpGender() {
		return pGender;
	}



	public void setpGender(String pGender) {
		this.pGender = pGender;
	}



	public String getpOccupation() {
		return pOccupation;
	}



	public void setpOccupation(String pOccupation) {
		this.pOccupation = pOccupation;
	}



	public String getpAddress() {
		return pAddress;
	}



	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}



	public void display() {
		this.print();
	
	}
	
	
	
	private void print()
	{
		System.out.println("Person Name is "+ this.pName);
		System.out.println("Person Gender is "+ this.pGender);
		System.out.println("Person Occupation is "+ this.pOccupation);
		System.out.println("Person Address is "+ this.pAddress);
	}
	
}
