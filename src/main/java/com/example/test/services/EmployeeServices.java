package com.example.test.services;

import java.util.List;
import java.util.Optional;

import com.example.test.bean.Employee;

public interface EmployeeServices {
	
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(long employeeId);
	
	public Optional<Employee> getSingleEmployee(long employeeId);
	
	public List<Employee> getAllEmployee(Employee employee);
	

}
