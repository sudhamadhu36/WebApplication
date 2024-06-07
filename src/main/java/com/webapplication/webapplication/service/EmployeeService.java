package com.webapplication.webapplication.service;

import java.util.List;

import com.webapplication.webapplication.model.Employee;



public interface EmployeeService {
	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(long id);
	public Employee updateEmployee(long id,Employee employee);
	void deleteEmployee(long id);
}
