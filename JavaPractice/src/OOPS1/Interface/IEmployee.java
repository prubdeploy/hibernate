package OOPS1.Interface;

import java.sql.SQLException;

public interface IEmployee {
	
	String printEmployeeName()throws SQLException;
	double getEmployeeSalary();


}
