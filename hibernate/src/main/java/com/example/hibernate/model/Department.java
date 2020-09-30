package com.example.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name="dept")
public class Department {
	@Id
	@Column(name="deptId")
	int deptID; 
	@Column(name="dname")
	String dName;
	@JsonBackReference
	@OneToMany(mappedBy="dept")
	Set<Employee> emps;
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}

}
