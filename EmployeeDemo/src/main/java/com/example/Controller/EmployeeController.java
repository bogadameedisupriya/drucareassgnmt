package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bean.Employee;
import com.example.Bean.FetchEmployeeDetailsDto;
import com.example.Bean.FetchEmployeeRequest;
import com.example.Bean.InsertEmployeeRequest;
import com.example.Dao.EmployeeDao;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;
	
	  @PostMapping("/employee")
		public Boolean add(@RequestBody Employee employee){
			 return employeeDao.add(employee);	
}
//	  
//	  @GetMapping("/fetchEmployeeDetails")
//	  public FetchEmployeeDetailsDto fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeRequest fetchEmployeeRequest) {
//		  return employeeDao.fetchEmployeeNameByEmpIdUsingMap( fetchEmployeeRequest) ;
//	  
//	  }  
	  @GetMapping("/fetchAllEmployeesUsingList")
	  public	List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList( FetchEmployeeRequest fetchEmployeeRequest){
		  return employeeDao.fetchAllEmployeesUsingList( fetchEmployeeRequest) ;
	  }
		
	  @GetMapping("/fetchEmployeeNameByEmpId3")
	  public  List<FetchEmployeeDetailsDto> fetchEmployeeNameByEmpId3(FetchEmployeeRequest fetchEmployeeRequest){
		  return employeeDao.fetchEmployeeNameByEmpId3( fetchEmployeeRequest) ; 
	  }
	  @PostMapping("/insertEmployeeRequestList")
	  public  Boolean insertEmployeeRequestList(List<InsertEmployeeRequest> insertEmployeeRequestList){
	    return employeeDao.insertEmployeeRequestList( insertEmployeeRequestList) ;
	  }  
	 
	  @PostMapping("/insertEmployeeRequest")
	  public boolean insertEmployeedetails(InsertEmployeeRequest insertEmployeeRequest) {
		  return employeeDao.insertEmployeedetails( insertEmployeeRequest) ;
	  }  
	  
//	  @DeleteMapping("/ deleteemployee")
//	  public  Boolean deleteById(InsertEmployeeRequest deleteemployee) {
//		return employeeDao.deleteById(deleteemployee);		  
//	  }
	  
	  @PutMapping("/updateemployee")
	  public boolean updateEmployeedetails(InsertEmployeeRequest updateEmployeeRequest) {
		  return employeeDao.updateEmployeedetails(updateEmployeeRequest);		
	  }
//	  @GetMapping("/findAll")
//		public List<FetchEmployeeDetailsDto>  findAll(FetchEmployeeRequest fetchEmployeeRequest) {
//			 return employeeDao.findAll(fetchEmployeeRequest);	
//			
//		}  
//	  @GetMapping("/findAll")
//	  public List<FetchEmployeeDetailsDto> findAll(FetchEmployeeRequest fetchEmployeeRequest) {
//		  return employeeDao.findAll(fetchEmployeeRequest);	
//		  
//	  }
	  @GetMapping("/fetchDetails/{emp_id}")
	  public	InsertEmployeeRequest fetchById(Long emp_id) {
		  return employeeDao.fetchById(emp_id);	 
	  }
	  @PostMapping("/insertEmployeeRequestListUsingJdbcTemplate")
	  public Boolean insertEmployeeRequestListUsingJdbcTemplate( @RequestBody List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate){
		  return employeeDao.insertEmployeeRequestListUsingJdbcTemplate(insertEmployeeRequestListUsingJdbcTemplate);	 
	  }
	  
}

