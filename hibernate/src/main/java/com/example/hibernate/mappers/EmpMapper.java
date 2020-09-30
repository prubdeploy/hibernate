package com.example.hibernate.mappers;

import com.example.hibernate.Resources.EmpResource;
import com.example.hibernate.model.Employee;

public class EmpMapper {
	
	public static EmpResource toEmpResource(Employee emp)
	{
		EmpResource ere = new EmpResource();
		ere.setEmpName(emp.getEmpName());
		ere.setDeptName(emp.getDept().getdName());
		return ere;
	}

}
