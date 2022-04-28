package com.example.Dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.exmple.bean.FectchEmployeeDetailsDto;
import com.exmple.bean.FetchEmployeeRequest;
import com.exmple.bean.InsertEmployeeRequest;

public interface EmployeeDao {
	
  public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest);
	
	public Boolean insertEmployeeRequestList(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestList);
	public Boolean insertEmployeeRequestListUsingJdbcTemplate(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate);
	 public List<InsertEmployeeRequest> fetchAllDeatils();
	 
	 public InsertEmployeeRequest fetchById( Long emp_id);
	 public List<InsertEmployeeRequest> fetchOneColomn();
	 public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest);
	 public FectchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap( FetchEmployeeRequest fetchEmployeeRequest);
	 public List<FectchEmployeeDetailsDto> fetchAllEmployeesUsingList( FetchEmployeeRequest fetchEmployeeRequest);
	 public List<FectchEmployeeDetailsDto> fetchEmployeeNameByEmpIdUsingQuery( FetchEmployeeRequest fetchEmployeeRequest);

	public List<FectchEmployeeDetailsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);

	public List<FectchEmployeeDetailsDto> fetchEmployeeNameByEmpId3(FetchEmployeeRequest fetchEmployeeRequest);
}


