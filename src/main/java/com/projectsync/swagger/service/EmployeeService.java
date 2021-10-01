package com.projectsync.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectsync.swagger.dao.EmployeeRepository;
import com.projectsync.swagger.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public String saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Saved employee with id: " + employee.getEmployeeId();
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public List<Employee> deleteEmployeeById(int employeeId) {
		employeeRepository.deleteById(employeeId);
		return employeeRepository.findAll();
	}
}
