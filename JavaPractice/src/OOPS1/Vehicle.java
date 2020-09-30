package OOPS1;

public class Vehicle {
	
	/*public Employee(){
		
		this.ceo="Prudhvi";
	}
	public Employee(String deptName){

		this.ceo="Prudhvi";
		
		this.deptName=deptName;
	}
	*/
	
	private String vName;
	private String vModelType;
	private int vYear;
	private String vColor;

	


	public String getvName() {
		return vName;
	}



	public void setvName(String vName) {
		this.vName = vName;
	}



	public String getvModelType() {
		return vModelType;
	}



	public void setvModelType(String vModelType) {
		this.vModelType = vModelType;
	}



	public int getvYear() {
		return vYear;
	}



	public void setvYear(int vYear) {
		this.vYear = vYear;
	}



	public String getvColor() {
		return vColor;
	}



	public void setvColor(String vColor) {
		this.vColor = vColor;
	}



	public void display() {
		this.print();
	
	}
	
	
	
	private void print()
	{
		System.out.println("Vehicle Brand is "+ this.vName);
		System.out.println("Vehicle Model Type is "+ this.vModelType);
		System.out.println("Vehicle Made in "+ this.vYear);
		System.out.println("Vehicle Color is "+ this.vColor);
	}
	
}
