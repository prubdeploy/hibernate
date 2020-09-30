package com.example.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table (name="employee")
public class Employee {
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Id
	@Column(name="empId")
	int empID; 
	@Column(name="ename")
	String empName;
	@Column(name="sal")
	Double sal;
	
	public boolean getSalGreaterThanHundered() {
		return this.getSal()>1000;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	//@ManyToOne
	@OneToOne
	@JoinColumn (name="deptId")
	Department dept;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	

}
