package com.example.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Entity.InsertEmployeeRequest;
@Service
public interface EmployeeService {
	
	  public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest);
	  
	}

