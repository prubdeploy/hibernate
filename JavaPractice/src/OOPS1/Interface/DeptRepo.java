package OOPS1.Interface;

public class DeptRepo implements IEmployee {

	@Override
	public String printEmployeeName() {
	return "PrudhviKumar";
	}

	@Override
	public double getEmployeeSalary() {
		return 9000.00;
	}

}
