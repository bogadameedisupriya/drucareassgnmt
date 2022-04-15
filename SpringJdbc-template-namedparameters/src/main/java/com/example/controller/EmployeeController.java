package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
		    @Autowired
		    EmployeeService employeeService;
			
			@PostMapping("/insertemployee")
			public Boolean add(@RequestBody  Employee  insertemployee){
				 return employeeService.add(insertemployee);	
			}
			@PutMapping("/updateemployee")
			public Boolean updateEmployeeData(@RequestBody  Employee  updateemployee){
				return employeeService.updateEmployeeData(updateemployee);
		}

			
			@DeleteMapping("/ deleteemployee")
			public Boolean deleteEmployeeData(@RequestBody  Employee  deleteemployee) {
				return employeeService.deleteEmployeeData(deleteemployee);
			}
		}