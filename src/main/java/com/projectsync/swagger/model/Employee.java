package com.projectsync.swagger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue
	@ApiModelProperty(value = "This is auto generated employee id")
	private int employeeId;
	
	@ApiModelProperty(value = "This is employee name")
	private String employeeName;
	
	@ApiModelProperty(value = "This is employee department")
	private String employeeDept;

	public Employee(int employeeId, String employeeName, String employeeDept) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
	}

	public Employee() {
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
