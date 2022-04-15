package com.example.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.example.project.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
		@Autowired
			  private NamedParameterJdbcTemplate namedParameterJdbcTemplate; 
		@Override
		public boolean insertEmployeedetails(Employee insertEmployeeRequest) {

		 String queryToInsertEmployeeDetails="Insert into employee(first_nm,middle_nm,last_nm,mobile_no,emil_id,address,state_nm,county_nm,pincode,city_nm,designation_nm,qualification_nm) values (:firstNm,:middleNm)";


		 Map<String,Object> parameters=new HashMap<>();
		 parameters.put("id",insertEmployeeRequest.getId());
		 parameters.put("firstNm",insertEmployeeRequest.getFirstNm());
		 parameters.put("middleNm",insertEmployeeRequest.getMiddleNm());
		 parameters.put("lastNm",insertEmployeeRequest.getLastNm());
		 parameters.put("mobileNo",insertEmployeeRequest.getMobileNo());
		 parameters.put("emailid",insertEmployeeRequest.getEmailid());
		 parameters.put("address",insertEmployeeRequest.getAddress());
		 parameters.put("stateNm",insertEmployeeRequest.getStateNm());
		 parameters.put("cityNm",insertEmployeeRequest.getCityNm());	 
		 parameters.put("countryNm",insertEmployeeRequest.getCountryNm());
		 parameters.put("qualificationNm",insertEmployeeRequest.getQualificationNm());
		 parameters.put("pincode",insertEmployeeRequest.getPincode());
		 
		 boolean result=false;
		 try{
		 result= namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails ,parameters)>0;  
		 }catch(Exception e) {
		 e.printStackTrace();
		 }
		return result ;		  
	}
		@Override
		public boolean updateEmployeedetails(Employee updateEmployeeRequest) {

		    		 String queryToUpdateEmployeeDetails="update into employee(first_nm,middle_nm,last_nm,mobile_no,emil_id,address,state_nm,county_nm,pincode,city_nm,designation_nm,qualification_nm) values (:firstNm,:middleNm)";


		    		 Map<String,Object> parameters=new HashMap<>();
		    		 parameters.put("id",updateEmployeeRequest.getId());
		    		 parameters.put("firstNm",updateEmployeeRequest.getFirstNm());
		    		 parameters.put("middleNm",updateEmployeeRequest.getMiddleNm());
		    		 parameters.put("lastNm",updateEmployeeRequest.getLastNm());
		    		 parameters.put("mobileNo",updateEmployeeRequest.getMobileNo());
		    		 parameters.put("emailid",updateEmployeeRequest.getEmailid());
		    		 parameters.put("address",updateEmployeeRequest.getAddress());
		    		 parameters.put("stateNm",updateEmployeeRequest.getStateNm());
		    		 parameters.put("cityNm",updateEmployeeRequest.getCityNm());	 
		    		 parameters.put("countryNm",updateEmployeeRequest.getCountryNm());
		    		 parameters.put("qualificationNm",updateEmployeeRequest.getQualificationNm());
		    		 parameters.put("pincode",updateEmployeeRequest.getPincode());
		    		 
		    		 boolean result=false;
		    		 try{
		    		 result= namedParameterJdbcTemplate.update(queryToUpdateEmployeeDetails ,parameters)>0;  
		    		 }catch(Exception e) {
		    		 e.printStackTrace();
		    		 }
		    		return result;
		    			  
		    	}
		@Override
		       public  Boolean deleteById(Employee deleteemployee) {
		    	   String queryTodeleteEmployeeDetails = "delete employee details where id=:id";
		    	   Map<String,Object> Parameters = new HashMap<> ();    
		    	   Parameters.put("id", deleteemployee.getId());  

		    	   boolean result=false;
		    		 try{
		    		 result= namedParameterJdbcTemplate.update(queryTodeleteEmployeeDetails ,Parameters)>0;  
		    		 }catch(Exception e) {
		    		 e.printStackTrace();
		    		 }
		    		return result;
		    	  
		    	 }
}
	



