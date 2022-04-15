package com.example.Dao;

import com.example.project.Employee;

public interface EmployeeDAO {


	boolean insertEmployeedetails(Employee insertEmployeeRequest);
	
    boolean updateEmployeedetails(Employee updateEmployeeRequest) ;
	 
//	 boolean deleteById(int id);

	Boolean deleteById(Employee deleteemployee);

	
	
	}

