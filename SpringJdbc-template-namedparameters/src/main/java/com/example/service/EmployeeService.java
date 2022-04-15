package com.example.service;

import org.springframework.stereotype.Service;

import com.example.project.Employee;
@Service
public interface EmployeeService {

	public Boolean add(Employee insertemployee);

	public Boolean updateEmployeeData(Employee updateemployee);

	public Boolean deleteEmployeeData(Employee deleteemployee);
	
	
}
