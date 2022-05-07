package com.example.Dao;

import java.util.List;

import com.example.Bean.Employee;
import com.example.Bean.FetchEmployeeDetailsDto;
import com.example.Bean.FetchEmployeeRequest;
import com.example.Bean.InsertEmployeeRequest;

public interface EmployeeDao {

	Boolean add(Employee employee);

//	FetchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeRequest fetchEmployeeRequest);

	List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList(FetchEmployeeRequest fetchEmployeeRequest);

	List<FetchEmployeeDetailsDto> fetchEmployeeNameByEmpId3(FetchEmployeeRequest fetchEmployeeRequest);

	Boolean insertEmployeeRequestList(List<InsertEmployeeRequest> insertEmployeeRequestList) ;

	boolean insertEmployeedetails(InsertEmployeeRequest insertEmployeeRequest);

	boolean updateEmployeedetails(InsertEmployeeRequest updateEmployeeRequest);

//	Boolean deleteById(InsertEmployeeRequest deleteemployee);

//	public List<FetchEmployeeDetailsDto>  findAll(FetchEmployeeRequest fetchEmployeeRequest);

//	List<FetchEmployeeDetailsDto> findAll(FetchEmployeeRequest fetchEmployeeRequest);

	InsertEmployeeRequest fetchById(Long emp_id);
	
	   Boolean insertEmployeeRequestListUsingJdbcTemplate(List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate);
	
	}


