package com.projectsync.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projectsync.swagger.model.Employee;
import com.projectsync.swagger.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "getEmployees", method = RequestMethod.GET)
	@ApiOperation(value = "Get list of all Employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "addEmployee", method = RequestMethod.POST)
	@ApiOperation(value = "Add new Employee")
	public String addNewEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@RequestMapping(value = "deleteEmployee/{employeeId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete employee specified by id")
	public List<Employee> deleteEmployeeById(@PathVariable int employeeId) {
		return employeeService.deleteEmployeeById(employeeId);
	}

}
