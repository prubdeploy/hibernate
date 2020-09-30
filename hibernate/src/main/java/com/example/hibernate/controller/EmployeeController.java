package com.example.hibernate.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.Resources.EmpResource;
import com.example.hibernate.mappers.EmpMapper;
import com.example.hibernate.model.Employee;
import com.example.hibernate.repository.EmployeeRepository;

@RestController
@RequestMapping(value="emp")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo;
	
	
	
	@GetMapping(value="/")
	public List<Employee> findAll()
	{
		List<Employee> emplist= empRepo.findAll();
		List<Employee> filteredList= emplist.stream().filter(Employee :: getSalGreaterThanHundered).collect(Collectors.toList());
				return filteredList;
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> findBYID(@PathVariable int  id) throws ClassNotFoundException, SQLException{
		Optional<Employee> emp =empRepo.findById(id);
		
		if(emp.isPresent()) {
			return ResponseEntity.ok( EmpMapper.toEmpResource(emp.get()));
					
		}
		
		else
			return ResponseEntity.notFound().build();
	}
	@PostMapping(value="/")
	public Employee saveEmployee(@RequestBody Employee emp) throws ClassNotFoundException, SQLException {
		System.out.println(emp);
		return empRepo.save(emp);
	}
	@PutMapping(value="/")
	public Employee  updateEmployee(@RequestBody Employee emp) throws ClassNotFoundException, SQLException {
		return empRepo.save(emp);
		
	}
	
//	@GetMapping(value="/ename")
//	public Employee findBYID( String  name) throws ClassNotFoundException, SQLException{
//		return empRepo.find(name);
//	}
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public boolean Delete(@PathVariable int  id) throws ClassNotFoundException, SQLException{
		empRepo.deleteById(id);
		return true;
	}


}


