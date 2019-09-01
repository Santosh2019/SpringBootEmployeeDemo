package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_tble")
public class Employee {

	@Id
	private long employeeId;

	private String employeeName;

	private String employeeLocation;

	private String employeeDesignation;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long employeeId, String employeeName, String employeeLocation, String employeeDesignation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
		this.employeeDesignation = employeeDesignation;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeLocation="
				+ employeeLocation + ", employeeDesignation=" + employeeDesignation + "]";
	}


	
	
}
