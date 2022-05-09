package com.example.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Bean.Employee;
import com.example.Bean.Movie;
@Repository
public class MovieServiceDaoImpl  implements MovieServiceDao{
//	
//	@Autowired
//	  private NamedParameterJdbcTemplate namedParameterJdbcTemplate; 

	@Override
	public Movie getMovieInfo(String movieId) {
		
			return new Movie(movieId, "movie name is spiderman");
	
	}
	 
//@Override
//public boolean insertEmployeedetails(Employee insertEmployeeRequest) {
//
//String queryToInsertEmployeeDetails="Insert into employee(id,firstNm,middleNm,lastNm,mobileno,emailid,address,statenm,countrynm,pincode,citynm,qualificationnm) values (:id,:firstNm,:middleNm,lastNm,:mobileNo,:emailId,:address,:stateNm,:countryNm,:pincode,:cityNm,:qualificationNm)";
//
//
//Map<String,Object> parameters=new HashMap<>();
//parameters.put("id",insertEmployeeRequest.getId());
//parameters.put("firstNm",insertEmployeeRequest.getFirstNm());
//parameters.put("middleNm",insertEmployeeRequest.getMiddleNm());
//parameters.put("lastNm",insertEmployeeRequest.getLastNm());
//parameters.put("mobileNo",insertEmployeeRequest.getMobileNo());
//parameters.put("emailid",insertEmployeeRequest.getEmailid());
//parameters.put("address",insertEmployeeRequest.getAddress());
//parameters.put("stateNm",insertEmployeeRequest.getStateNm());
//parameters.put("cityNm",insertEmployeeRequest.getCityNm());	 
//parameters.put("countryNm",insertEmployeeRequest.getCountryNm());
//parameters.put("qualificationNm",insertEmployeeRequest.getQualificationNm());
//parameters.put("pincode",insertEmployeeRequest.getPincode());
//
//boolean result=false;
//try{
//result= namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails ,parameters)>0;  
//}catch(Exception e) {
//e.printStackTrace();
//}
//return result ;		  
//}
 

}
