package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.InsertEmployeeRequest;
import com.example.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	 @Autowired
	    EmployeeService employeeService;
			
		@PostMapping("/insertEmployeeRequest")
		public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest) {
			return employeeService.insertEmployeeDetails(insertEmployeeRequest);
		}
	}
	
