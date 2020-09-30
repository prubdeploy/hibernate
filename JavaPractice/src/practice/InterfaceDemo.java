package practice;

import java.sql.SQLException;

import OOPS1.Interface.DeptRepo;
import OOPS1.Interface.EmployeeRepo;
import OOPS1.Interface.IEmployee;
import OOPS1.Interface.Interface1;
import OOPS1.Interface.Interface2;
import OOPS1.Interface.MultiInterface;

public class InterfaceDemo {
	
	public static void main(String[] args) throws SQLException {
		IEmployee emp=new EmployeeRepo();
		
		System.out.println(emp.getEmployeeSalary());
		System.out.println(emp.printEmployeeName());
		
		
		IEmployee dept= new DeptRepo();
		System.out.println(dept.getEmployeeSalary());
		System.out.println(dept.printEmployeeName());
		
		
		Interface1 int1=new MultiInterface();
		
		int1.method1();
		int1.method2();
		
		Interface2 int2=new MultiInterface();
		int2.method3();
		int2.method4();
		
		
		
		
		
	}

}
