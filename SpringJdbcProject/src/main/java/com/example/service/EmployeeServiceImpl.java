package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Dao.EmployeeDao;
import com.exmple.bean.FectchEmployeeDetailsDto;
import com.exmple.bean.FetchEmployeeRequest;
import com.exmple.bean.InsertEmployeeRequest;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
	@Autowired
	EmployeeDao service ;
	
	@Override
	public Boolean insertEmployeeDetails(InsertEmployeeRequest insertEmployeeRequest) {
		return service.insertEmployeeDetails(insertEmployeeRequest);
		
	}
	@Override
	 public Boolean insertEmployeeRequestList( List<InsertEmployeeRequest> insertEmployeeRequestList) {
		 return service.insertEmployeeRequestList(insertEmployeeRequestList);
	 }
	@Override
	 public Boolean insertEmployeeRequestListUsingJdbcTemplate( List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate) {
		 return service.insertEmployeeRequestListUsingJdbcTemplate(insertEmployeeRequestListUsingJdbcTemplate);
	 }
	@Override
	public List<InsertEmployeeRequest> fetchAllDeatils() {
		return service.fetchAllDeatils();
	}
	@Override
	 public InsertEmployeeRequest fetchById(Long emp_id) {
	 return service.fetchById(emp_id);
	 }
	@Override
	 public List<InsertEmployeeRequest> fetchOneColomn() {
		 return service.fetchOneColomn();
	 }
	@Override
	 public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	 }
	@Override
	 public FectchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	 }
	@Override
	 public List<FectchEmployeeDetailsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	 }
	@Override
	 public List<FectchEmployeeDetailsDto> fetchEmployeeNameByEmpIdUsingQuery(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		 return service.fetchEmployeeNameByEmpIdUsingQuery(fetchEmployeeRequest);
	 }
	@Override
	public List<FectchEmployeeDetailsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		return service.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}
	@Override
	public List<FectchEmployeeDetailsDto> fetchEmployeeNameByEmpId3(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		return service.fetchEmployeeNameByEmpId3(fetchEmployeeRequest);
	}
	
} 


