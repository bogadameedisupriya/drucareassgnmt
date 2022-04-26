package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Dao.EmployeeDao;
import com.example.Entity.InsertEmployeeRequest;
import com.example.Service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao service;
	
	@Override
	public Boolean insertEmployeeDetails(InsertEmployeeRequest insertEmployeeRequest) {
		return service.insertEmployeeDetails(insertEmployeeRequest);
		
	}
}