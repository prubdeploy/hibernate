package jdbc;

import java.sql.SQLException;
import java.util.List;

public class JdbcApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		EmployeeRepository empRepo = new EmployeeRepositoryImpl();
		List<Employee> empList = empRepo.findAll();
		for (Employee emp : empList) {
			System.out.println("Employee id is " + emp.getEmpId());
			System.out.println("Employee Name is " + emp.getEmpName());
			System.out.println("Employee Sal is " + emp.getSal());
		}
		int id = 1;

		Employee emp = empRepo.findById(id);
		System.out.println("Employee id is " + emp.getEmpId());
		System.out.println("Employee Name is " + emp.getEmpName());
		System.out.println("Employee Sal is " + emp.getSal());
		
		String ename="prudhvi";
		Employee empp = empRepo.findByEname(ename);
		System.out.println("Employee id is " + empp.getEmpId());
		System.out.println("Employee Name is " + empp.getEmpName());
		System.out.println("Employee Sal is " + empp.getSal());
		//boolean n=empRepo.saveEmployee();
		//if(n) {
			//System.out.println("Insert command successful");
		//}else {
			//System.out.println("Insert command failed");
		//}
		
//		
//		Employee emp1 = new Employee();
//		emp1.setEmpId(32);
//		emp1.setEmpName("Reid");
//		emp1.setSal(134927.00);
//		//empRepo.saveEmployee(emp1);
//
//		boolean g=empRepo.saveEmployee(emp1);
//		if(g) {
//			System.out.println("Insert command successful");
//		}else {
//			System.out.println("Insert command failed");
//		}
//		
		Employee emp1 = new Employee();
		emp1.setEmpId(32);
		emp1.setEmpName("ReidTEST");
		emp1.setSal(150007.00);
		
		boolean b  = empRepo.updateEmployee(emp1);
		if(b) {
		System.out.println("Insert command successful");
	}else {
		System.out.println("Insert command failed");
	}
//		Employee emp11 = new Employee();
//		emp11.setEmpId(32);
		int i=32;
		boolean c = empRepo.deleteEmployee(i);
		if(c) {
			System.out.println("Delete command successful");
		}else {
			System.out.println("delete command failed");
		}
	}
	
	
	
	

	
	
}