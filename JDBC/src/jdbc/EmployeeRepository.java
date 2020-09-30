package jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
	
	List<Employee> findAll() throws ClassNotFoundException, SQLException;
	Employee findById(int empid) throws SQLException, ClassNotFoundException;
	Employee findByEname(String empName) throws SQLException, ClassNotFoundException;
	boolean saveEmployee()throws SQLException, ClassNotFoundException;;
	boolean saveEmployee(Employee emp)throws SQLException, ClassNotFoundException;
	boolean updateEmployee(Employee emp) throws ClassNotFoundException, SQLException;
	boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException;
	List<Employee> findByDeptIDSal(int deptId, double sal) throws SQLException, ClassNotFoundException;
	

}
