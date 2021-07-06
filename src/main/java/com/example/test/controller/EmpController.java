package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.bean.Employee;
import com.example.test.serivceImpl.EmployeeServiceImpl;

@RestController
public class EmpController {

	@Autowired
	EmployeeServiceImpl serviceImpl;

	@GetMapping("/singleEmployee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable("employeeId") long employeeId) {
		return serviceImpl.getSingleEmployee(employeeId);
	}

	@GetMapping("/employeeList")
	public List<Employee> getEmployee(Employee employee) {

		return serviceImpl.getAllEmployee(employee);
	}

	@PostMapping("/create")
	public void createEmployee(@RequestBody Employee employee) {

		serviceImpl.addEmployee(employee);

	}

	/* Update Employee data */
	@PutMapping("/update/{employeeId}")
	public void updateEmployee(@PathVariable("employeeId") long employeeId, @RequestBody Employee employee) {

		serviceImpl.updateEmployee(employee);
	}

	@DeleteMapping("/remove/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId") long employeeId) {
		serviceImpl.deleteEmployee(employeeId);
	}

}
