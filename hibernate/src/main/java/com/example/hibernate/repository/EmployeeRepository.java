package com.example.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
