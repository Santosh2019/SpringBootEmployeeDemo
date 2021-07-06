package com.example.test.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private String employeeName;
	@Id
	private long employeeSalary;
	private String employeeDesignation;
	
	
	
	

}
