package com.example.hibernate.service;

import java.sql.SQLIntegrityConstraintViolationException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository deptRepo;
	
    public boolean delete(int deptId) throws SQLIntegrityConstraintViolationException,ConstraintViolationException {
    		deptRepo.deleteById(deptId);
    	return true;
    }

}
