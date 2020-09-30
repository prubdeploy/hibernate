package practice;

import OOPS1.Address;
import OOPS1.Employee;

public class AggregationDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println(Employee.ceo);
		
		Employee emp = new Employee();
		emp.setEmpiId(1);
		emp.setEmpNam("Prudhvi");
		emp.setSalary(1000000);
	//	Employee.ceo="Anand";
		Address  offAdd = new Address();
		offAdd.setAddressLine1("21 streeet");
		offAdd.setPosralCode("M2j0b6");
		offAdd.setCountry("CANADA");
		offAdd.setState("OTTAWA");
		
		
		
		emp.setOfficeAddress(offAdd);
		
		emp.setHomeAddress(getHomeAddress());
		
		
		System.out.println(emp.getEmpNam());
		System.out.println(emp.getHomeAddress().getAddressLine1());
		
	}

	
	private static  Address getHomeAddress() {
		Address  homeAddress = new Address();
		homeAddress.setAddressLine1("45 streeet");
		homeAddress.setPosralCode("dfdsfds");
		homeAddress.setCountry("CANADA");
		homeAddress.setState("OTTAWA");
		return homeAddress;
		
		
	}
}
