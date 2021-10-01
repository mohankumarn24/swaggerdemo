package com.projectsync.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsync.swagger.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
