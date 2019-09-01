package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
