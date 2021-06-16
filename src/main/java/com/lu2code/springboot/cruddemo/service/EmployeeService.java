package com.lu2code.springboot.cruddemo.service;

import java.util.List;

import com.lu2code.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}
