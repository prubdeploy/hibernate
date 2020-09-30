package OOPS1;

public class Animal {
	
	
	private String aType;
	private String aGender;
	private String aSpecies;
	
	
	public String getaType() {
		return aType;
	}



	public void setaType(String aType) {
		this.aType = aType;
	}



	public String getaGender() {
		return aGender;
	}



	public void setaGender(String aGender) {
		this.aGender = aGender;
	}



	public String getaSpecies() {
		return aSpecies;
	}



	public void setaSpecies(String aSpecies) {
		this.aSpecies = aSpecies;
	}



	public void display() {
		this.print();
	
	}
	
	public Animal(String value1) {
	this.aType = value1;
	}
	
	
	private void print()
	{
		System.out.println("Animal is "+ this.aType);
		System.out.println("Animal Gender is "+ this.aGender);
		System.out.println("Animal Species is"+ this.aSpecies);
	}
	
}
