package com.example.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}