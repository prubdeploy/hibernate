package com.example.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}