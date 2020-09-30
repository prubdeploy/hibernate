package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import OOPS1.Employee;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		String sunday="SUNDAY";
		al.add(sunday);	
		al.add("MONDAY");
		al.add("TUESDAY");
		al.add("WEDNESDAY");
		al.add("THURSDAY");
		al.add("FRIDAY");
		al.add("FRIDAY");
		al.add(3,"PRUDHVI");
		
		for(String x : al)
			System.out.println(x);
//		
		List<Employee> empList= new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setEmpiId(001);
		emp.setEmpNam("PruDHVI");
		emp.setSalary(1000000);
		empList.add(emp);

		Employee emp2 = new Employee();
		emp2.setEmpiId(002);
		emp2.setEmpNam("PruDHVIDODEPED");
		emp2.setSalary(3333333);
		empList.add(emp2);
		
		
		for(Employee e : empList)
		{
			System.out.println("ID is "+ e.getEmpiId());
			System.out.println("Name is "+ e.getEmpNam());
			System.out.println("Salary is"+ e.getSalary());
		}
		
		
//		Iterator itr=al.iterator();
//		while(itr.hasNext())
//			 System.out.println(itr.next());
		//al.forEach(a-> System.out.println(a));
		
		List<String> newLIst=al.stream().filter(a->a.equals("FRIDAY")).collect(Collectors.toList());
		
		newLIst.forEach(a->System.out.println(a));
		
		
		
	

	}

}
