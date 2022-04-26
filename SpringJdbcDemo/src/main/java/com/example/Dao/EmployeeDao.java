package com.example.Dao;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.Entity.InsertEmployeeRequest;

public interface EmployeeDao {
	
	
		public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest);
	

}
