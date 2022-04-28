package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmployeeService;
import com.exmple.bean.FectchEmployeeDetailsDto;
import com.exmple.bean.FetchEmployeeRequest;
import com.exmple.bean.InsertEmployeeRequest;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/insertEmployeeRequest")
	public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest) {
		return employeeService.insertEmployeeDetails(insertEmployeeRequest);
	}
	
	@PostMapping("/insertEmployeeList")
	public Boolean insertEmployeeRequestList(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestList) {
		return employeeService.insertEmployeeRequestList(insertEmployeeRequestList);
	}
	@PostMapping("/insertEmployeeRequestListUsingJdbcTemplate")
	public Boolean insertEmployeeRequestListUsingJdbcTemplate(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate) {
		return employeeService.insertEmployeeRequestListUsingJdbcTemplate(insertEmployeeRequestListUsingJdbcTemplate);
	}
	
	@GetMapping("/fetchAllDeatils")
	public List<InsertEmployeeRequest> fetchAllDeatils() {
		return employeeService.fetchAllDeatils();
	}
	
	@GetMapping("/fetchById/{emp_id}")
	public InsertEmployeeRequest fetchById(@PathVariable("emp_id") Long emp_id) {
		return employeeService.fetchById(emp_id);
	}
	@GetMapping("/fetchOneColomn")
	public List<InsertEmployeeRequest> fetchOneColomn() {
		return employeeService.fetchOneColomn();
		
	}
	
	@GetMapping("/fetchEmployeeNameByEmpIdUsingObject")
	public String fetchEmployeeNameByEmpIdUsingObject(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	}
	@GetMapping("/fetchEmployeeNameByEmpIdUsingMap")
	public FectchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	}
	@GetMapping("/fetchAllEmployeesUsingList")
	 public List<FectchEmployeeDetailsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		 return employeeService.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	 }
	@GetMapping("/fetchEmployeeNameByEmpIdUsingQuery")		 
	public List<FectchEmployeeDetailsDto> fetchEmployeeNameByEmpIdUsingQuery(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		return employeeService.fetchEmployeeNameByEmpIdUsingQuery(fetchEmployeeRequest);
	}
	
	@GetMapping("fetchAllEmployeeDetails")
	public List<FectchEmployeeDetailsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		return employeeService.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}
	@GetMapping("/fetchEmployeeNameByEmpId3")
	public List<FectchEmployeeDetailsDto> fetchEmployeeNameByEmpId3(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		return employeeService.fetchEmployeeNameByEmpId3(fetchEmployeeRequest);
	}
			 			 
}

