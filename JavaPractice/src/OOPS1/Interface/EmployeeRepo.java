package OOPS1.Interface;

import java.sql.SQLException;

public class EmployeeRepo implements IEmployee {

	@Override
	public String printEmployeeName() throws SQLException  {
	  return "Prudhvi";
	}

	@Override
	public double getEmployeeSalary() {
	return 100000.00;
	}

}
