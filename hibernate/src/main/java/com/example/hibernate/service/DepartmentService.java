package com.example.hibernate.service;

import java.sql.SQLIntegrityConstraintViolationException;

import org.hibernate.exception.ConstraintViolationException;

public interface DepartmentService {
	
	
    boolean delete(int deptId) throws SQLIntegrityConstraintViolationException, ConstraintViolationException;

}
