package com.project.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{
	
	
	
}
