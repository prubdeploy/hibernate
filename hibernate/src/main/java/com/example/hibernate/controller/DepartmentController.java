package com.example.hibernate.controller;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.model.Department;
import com.example.hibernate.repository.DepartmentRepository;
import com.example.hibernate.service.DepartmentService;

@RestController
@RequestMapping(value="dept")
public class DepartmentController {
	@Autowired
	DepartmentRepository deptRepo;
	
	@Autowired
	DepartmentService deptService;
	
	@GetMapping(value="/")
	public List<Department> findAll()
	{
		return deptRepo.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Department findBYID(@PathVariable int  id) throws ClassNotFoundException, SQLException{
		return deptRepo.findById(id).get();
	}
	@PostMapping(value="/")
	public Department saveDepartment(@RequestBody Department dept) throws ClassNotFoundException, SQLException {
		return deptRepo.save(dept);
	}
	@PutMapping(value="/")
	public Department  updateDepartment(@RequestBody Department dept) throws ClassNotFoundException, SQLException {
		return deptRepo.save(dept);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> Delete(@PathVariable int  id)   {
		try {
			deptService.delete(id);
			}
		catch(Exception ex ) {
			
	  throw new DepartmentForeignKeyException();
		}
		return ResponseEntity.ok(true);
	}


}