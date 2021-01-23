package com.example.Test.Services;

import java.util.List;

import com.example.Test.bean.Employee;

public interface EmployeeServices {
	
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(long employeeId);
	
	public Employee getSingleEmployee(long employeeId);
	
	public List<Employee> getAllEmployee(Employee employee);
	

}
