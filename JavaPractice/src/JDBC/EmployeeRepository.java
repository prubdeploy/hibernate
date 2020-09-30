package JDBC;

import java.util.List;

public interface EmployeeRepository {
	
	List<Employee> findAll();
	Employee findById(int empid);
	boolean saveEmployee(Employee emp);
	boolean updateEmployee(Employee emp);
	boolean deleteEmployee(int empId);
	
	

}
