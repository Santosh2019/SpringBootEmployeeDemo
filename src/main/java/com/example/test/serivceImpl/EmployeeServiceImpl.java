package com.example.test.serivceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.test.bean.Employee;
import com.example.test.dao.EmployeeRepository;
import com.example.test.services.EmployeeServices;


@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public Optional<Employee> getSingleEmployee(@PathVariable("employeeId")long employeeId) {
		// TODO Auto-generated method stub
	//	Optional<Employee> employee = employeeRepo.findById(employeeId);

		return employeeRepo.findById(employeeId);
	}
	

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);

	}

	@Override
	public void deleteEmployee(long employeeId) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployee(Employee employee) {

		return employeeRepo.findAll();
	}

}
