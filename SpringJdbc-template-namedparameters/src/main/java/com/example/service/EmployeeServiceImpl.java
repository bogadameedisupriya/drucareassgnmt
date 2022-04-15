package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Dao.EmployeeDAO;
import com.example.project.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO service;
	
public Boolean add( @RequestBody Employee insertemployee) {
	// TODO Auto-generated method stub
	return service.insertEmployeedetails(insertemployee);
}

public Boolean updateEmployeeData(@RequestBody Employee updateemployee) {
	// TODO Auto-generated method stub
	return  service.updateEmployeedetails(updateemployee);
}

public Boolean deleteEmployeeData(Employee deleteemployee) {
	// TODO Auto-generated method stub
	return service.deleteById(deleteemployee);
}



}
