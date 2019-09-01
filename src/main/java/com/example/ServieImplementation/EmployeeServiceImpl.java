package com.example.ServieImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.EmployeeRepository;
import com.example.Services.EmployeeServices;
import com.example.bean.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public Employee getSingleEmployee(long employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee> employee = employeeRepo.findById(employeeId);

		return employee.get();
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
