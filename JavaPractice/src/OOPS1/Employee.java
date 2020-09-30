package OOPS1;

public class Employee {
	
	String empNam; 
    int empiId; 
    int salary; 
    Address officeAddress; 
    Address homeAddress;
    public static String ceo;
    
    static {
    	ceo="Anand";
    }
	
	public String getEmpNam() {
		return empNam;
	}
	public void setEmpNam(String empNam) {
		this.empNam = empNam;
	}
	public int getEmpiId() {
		return empiId;
	}
	public void setEmpiId(int empiId) {
		this.empiId = empiId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

}
