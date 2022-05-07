package com.example.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.Bean.Employee;
import com.example.Bean.EmployeeDeptBean;
import com.example.Bean.EmployeeDesignationBean;
import com.example.Bean.FetchEmployeeDetailsDto;
import com.example.Bean.FetchEmployeeRequest;
import com.example.Bean.InsertEmployeeRequest;
//import com.example.Dao.EmployeeDaoImpl.InsertEmployeeRequestMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Boolean add(Employee employee) {
		String queryToInsertemployeeDetails =
				"INSERT INTO employee_info_ref(emp_id,first_nm,last_nm,middle_nm,email_id,mobile_no,emp_salary,emp_age,country_nm,state_nm,city_nm,pincode,address) VALUES(:empId,:firstNm,:lastNm,:middleNm,:emailId,:mobileNo,:empSalary,:empAge,:countryNm,:stateNm,:cityNm,:pincode,:address)";
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("empId",employee.getEmpId());
	//	parameters.put("emp_nm", employee.getEmpNm());
		parameters.put("firstNm",employee.getFirstNm());
		parameters.put("lastNm",employee.getLastNm());
		parameters.put("middleNm",employee.getMiddleNm());
		parameters.put("emailId",employee.getEmailId());
		parameters.put("mobileNo",employee.getMobileNo());
		parameters.put("empSalary",employee.getEmpSalary());
		parameters.put("empAge",employee.getEmpAge());
		parameters.put("countryNm",employee.getCountryNm());
		parameters.put("stateNm",employee.getStateNm());
		parameters.put("cityNm",employee.getCityNm());
		parameters.put("pincode",employee.getPincode());
		parameters.put("address",employee.getAddress());
		
		 namedParameterJdbcTemplate.update(queryToInsertemployeeDetails, parameters);
		 //new BeanPropertySqlParameterSource(student);
		 return true;
}
	
	@Override
	public List<FetchEmployeeDetailsDto> fetchAllEmployeesUsingList(FetchEmployeeRequest fetchEmployeeRequest) {

		List<FetchEmployeeDetailsDto> fetchEmployeeList = new ArrayList<>();

		String queryForFetchEmployeeNmByEmpIdUsingList = " SELECT concat(first_nm,' ',middle_nm,' ',last_nm) as"
				+ " emp_nm,dsr.designation_id,emp_id,first_nm,middle_nm,last_nm,mobile_no,email_id,emp_salary,emp_age,"
				+ "country_nm,state_nm,city_nm,pincode,address from employeedb.employee_info_ref eir INNER JOIN"
				+ " employeedb.designation_ref  dsr ON  eir.emp_id = dsr.designation_id"  ;  
		  
//
//		StringBuilder query = new StringBuilder(queryForFetchEmployeeNmByEmpIdUsingList);
//		if (fetchEmployeeRequest.getEmpNm() != null) {
//			query.append(" AND concat(first_nm,' ',middle_nm,' ',last_nm) ilike '%' ||:empNm||'%' ");
//		}
//		if (fetchEmployeeRequest.getMobileNo() != null) {
//			query.append(" AND mobile_no=:mobileNo ");
//		}
//		query.append(" order by mobile_no desc ");

		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(queryForFetchEmployeeNmByEmpIdUsingList,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));
		FetchEmployeeDetailsDto fetchEmployeeDeatilsDto = null;
		for (Map<String, Object> row : rows) {
			fetchEmployeeDeatilsDto = new FetchEmployeeDetailsDto();
			fetchEmployeeDeatilsDto.setEmpId((Integer) row.get("emp_id"));
			fetchEmployeeDeatilsDto.setEmpNm((String) row.get("emp_nm"));
			fetchEmployeeDeatilsDto.setFirstNm((String) row.get("first_nm"));
			fetchEmployeeDeatilsDto.setMiddleNm((String) row.get("middle_nm"));
			fetchEmployeeDeatilsDto.setLastNm((String) row.get("last_nm"));
			fetchEmployeeDeatilsDto.setEmailId((String) row.get("email_id"));
			fetchEmployeeDeatilsDto.setMobileNo((Integer) row.get("mobile_no"));
			fetchEmployeeDeatilsDto.setEmpSalary((Integer) row.get("emp_salary"));
			fetchEmployeeDeatilsDto.setEmpAge((String) row.get("emp_age"));
			fetchEmployeeDeatilsDto.setCountryNm((String) row.get("country_nm"));
			fetchEmployeeDeatilsDto.setStateNm((String) row.get("state_nm"));
			fetchEmployeeDeatilsDto.setCityNm((String) row.get("city_nm"));
			fetchEmployeeDeatilsDto.setPincode((Integer) row.get("pincode"));
			fetchEmployeeDeatilsDto.setAddress((String) row.get("address"));

			fetchEmployeeList.add(fetchEmployeeDeatilsDto);

		}
		return fetchEmployeeList;
	}
	@Override
	public List<FetchEmployeeDetailsDto> fetchEmployeeNameByEmpId3(FetchEmployeeRequest fetchEmployeeRequest) {

		String queryForFetchEmployeeNmByEmpId = " SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.email_id,eir.emp_salary,eir.emp_age,eir.mobile_no,eir.country_nm,eir.state_nm,eir.city_nm,eir.pincode,eir.address,edp.emp_dept_id,edp.emp_id,edp.dept_id,edp.isactive,eds.emp_designation_id,eds.emp_id,eds.designation_id,eds.isactive,dr.dept_id,dr.dept_nm,dsr.designation_id,dsr.designation_nm FROM  employeedb.employee_info_ref  eir \r\n"
				+ " INNER JOIN  employeedb.employee_department_ref  edp ON  eir.emp_id = edp.emp_id \r\n"
				+ " INNER JOIN employeedb.employee_designation_ref  eds ON eir.emp_id = eds.emp_id\r\n"
				+ " INNER JOIN   employeedb.department_ref dr ON edp.dept_id =dr.dept_id \r\n"
				+ " INNER JOIN employeedb.designation_ref dsr ON  eds.designation_id =dsr.designation_id  \r\n";
				

		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(queryForFetchEmployeeNmByEmpId,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));
		List<FetchEmployeeDetailsDto> empDetailsList = null;
		List<EmployeeDeptBean> empDeptList = null;
		List<EmployeeDesignationBean> empDesignationList = null;

		if (CollectionUtils.isNotEmpty(rows)) {
			empDetailsList = new ArrayList<>();
			Set<Integer> set = new HashSet<>();
			int count = 0;
			FetchEmployeeDetailsDto fetchEmployeeDeatilsDto = null;
			for (Map<String, Object> row : rows) {

				count++;

				if (set.add((Integer) row.get("emp_id"))) {

					if (fetchEmployeeDeatilsDto != null) {
						if (CollectionUtils.isNotEmpty(empDesignationList)) {
							fetchEmployeeDeatilsDto.setEmpDesignationList(empDesignationList);
						}

						if (CollectionUtils.isNotEmpty(empDeptList)) {
							fetchEmployeeDeatilsDto.setEmpDeptList(empDeptList);
						}

						empDetailsList.add(fetchEmployeeDeatilsDto);

					}
					empDeptList = new ArrayList<>();
					empDesignationList = new ArrayList<>();
					fetchEmployeeDeatilsDto = new FetchEmployeeDetailsDto();

					fetchEmployeeDeatilsDto.setEmpNm((String) row.get("emp_nm"));
					fetchEmployeeDeatilsDto.setEmpId((Integer) row.get("emp_id"));
					fetchEmployeeDeatilsDto.setFirstNm((String) row.get("first_nm"));
					fetchEmployeeDeatilsDto.setLastNm((String) row.get("last_nm"));
					fetchEmployeeDeatilsDto.setMiddleNm((String) row.get("middle_nm"));
					fetchEmployeeDeatilsDto.setEmpSalary((Integer) row.get("emp_salary"));
					fetchEmployeeDeatilsDto.setEmpAge((String) row.get("emp_age"));
					fetchEmployeeDeatilsDto.setCountryNm((String) row.get("country_nm"));
					fetchEmployeeDeatilsDto.setCityNm((String) row.get("city_nm"));
					fetchEmployeeDeatilsDto.setPincode((Integer) row.get("pincode"));
				}			
				if (row.get("dept_nm") != null) {
					EmployeeDeptBean employeeDeptBean = new EmployeeDeptBean();
					employeeDeptBean.setDeptNm((String) row.get("dept_nm"));
					employeeDeptBean.setDeptId((Integer) row.get("dept_id"));

					empDeptList.add(employeeDeptBean);
				}		
				if (row.get("desgination_nm") != null) {
					EmployeeDesignationBean employeeDesignationBean = new EmployeeDesignationBean();
					employeeDesignationBean.setDesignationNm((String) row.get("desgination_nm"));
					employeeDesignationBean.setDesignationId((Long) row.get("desgination_id"));

					empDesignationList.add(employeeDesignationBean);
				}
			}
			if (count == rows.size() && fetchEmployeeDeatilsDto != null) {
				if (CollectionUtils.isNotEmpty(empDeptList)) {
					fetchEmployeeDeatilsDto.setEmpDeptList(empDeptList);
				}
				if (CollectionUtils.isNotEmpty(empDesignationList)) {
					fetchEmployeeDeatilsDto.setEmpDesignationList(empDesignationList);
				}
				empDetailsList.add(fetchEmployeeDeatilsDto);
			}
		}

		return empDetailsList;
	}
//-------------
	public Boolean insertEmployeeRequestList(List<InsertEmployeeRequest> insertEmployeeRequestList) {

		for (InsertEmployeeRequest insertEmployeeRequest : insertEmployeeRequestList) {
			int count = 0;
			KeyHolder holder = new GeneratedKeyHolder();
			String queryForInsertEmployeeData = "insert  into employee_info_ref(first_nm,middle_nm,last_nm,email_id,emp_salary,emp_age,mobile_no,country_nm,state_nm,city_nm,pincode,address)"
					+ "values(:firstNm,:middleNm,:lastNm,:emailId,:empSalary,:empAge,:mobileNo,:countryNm,:stateNm,:cityNm,:pincode,:address)";

			if (insertEmployeeRequest.getEmpId() == null) {
				count = namedParameterJdbcTemplate.update(queryForInsertEmployeeData,
						new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "emp_id" });
				insertEmployeeRequest.setEmpId(holder.getKey().longValue());
			} else {

				String queryForUpdateEmployeeData = "Update employee_info_ref set first_nm=:firstNm,email_id=:emailId,mobile_no=:mobileNo where emp_id=:empId";
				count = namedParameterJdbcTemplate.update(queryForUpdateEmployeeData,
						new BeanPropertySqlParameterSource(insertEmployeeRequest));
			}
			if (count > 0) {

				String queryToInsertEmpDeprtments = "insert into employee_department_ref (dept_id,emp_id,isactive) values (:deptId,:empId,true)";
				List<EmployeeDeptBean> empDeptRefSave = new ArrayList<>();
				if (insertEmployeeRequest.getDepartmentList() != null
						&& insertEmployeeRequest.getDepartmentList().size() > 0)
					for (EmployeeDeptBean employeeDeptBean : insertEmployeeRequest.getDepartmentList()) {
						employeeDeptBean.setEmpId(holder.getKey().longValue());
						empDeptRefSave.add(employeeDeptBean);
					}

				SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(empDeptRefSave.toArray());
				namedParameterJdbcTemplate.batchUpdate(queryToInsertEmpDeprtments, parameters);

				String queryToInsertEmpDesignations = "insert into employee_designation_ref (designation_id,emp_id,isactive) values (:designationId,:empId,true)";
				List<EmployeeDesignationBean> empDesignationRefSave = new ArrayList<>();
				if (insertEmployeeRequest.getDesignationList() != null
						&& insertEmployeeRequest.getDesignationList().size() > 0) {
					for (EmployeeDesignationBean employeeDesignationBean : insertEmployeeRequest.getDesignationList()) {
						employeeDesignationBean.setEmpId(holder.getKey().longValue());
						empDesignationRefSave.add(employeeDesignationBean);
						SqlParameterSource[] values = SqlParameterSourceUtils
								.createBatch(empDesignationRefSave.toArray());
						namedParameterJdbcTemplate.batchUpdate(queryToInsertEmpDesignations, values);

					}
				}
			}
		}
		return true;
	
}
//---------
	
	@Override
	public boolean insertEmployeedetails(InsertEmployeeRequest insertEmployeeRequest) {

	 String queryToInsertEmployeeDetails="Insert into employee_info_ref (emp_id,first_nm,middle_nm,last_nm,mobile_no,email_id,address,state_nm,county_nm,pincode,city_nm,emp_salary,emp_age) values (:empId,:firstNm,:middleNm,:lastNm,:emailId,:address,:pincode,:emp_salary,:mobile_no,:emp_age,:country_nm,:state_nm,:city_nm)";


	 Map<String,Object> parameters=new HashMap<>();
	 parameters.put("empId",insertEmployeeRequest.getEmpId());
	 parameters.put("firstNm",insertEmployeeRequest.getFirstNm());
	 parameters.put("middleNm",insertEmployeeRequest.getMiddleNm());
	 parameters.put("lastNm",insertEmployeeRequest.getLastNm());
	 parameters.put("mobileNo",insertEmployeeRequest.getMobileNo());
	 parameters.put("emailId",insertEmployeeRequest.getEmailId());
	 parameters.put("address",insertEmployeeRequest.getAddress());
	 parameters.put("stateNm",insertEmployeeRequest.getStateNm());
	 parameters.put("cityNm",insertEmployeeRequest.getCityNm());	 
	 parameters.put("countryNm",insertEmployeeRequest.getCountryNm());
	 parameters.put("empAge",insertEmployeeRequest.getCountryNm());
	 parameters.put("empSalary",insertEmployeeRequest.getEmpSalary());
	 parameters.put("pincode",insertEmployeeRequest.getPincode());
	 
	 boolean result=true;
	 try{
	 result= namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails ,parameters)>0;  
	 }catch(Exception e) {
	 e.printStackTrace();
	 }
	return result ;		  
}
	
	@Override
	public boolean updateEmployeedetails(InsertEmployeeRequest updateEmployeeRequest) {

	    		 String queryToUpdateEmployeeDetails="update into employee_info_ref (emp_id,first_nm,middle_nm,last_nm,mobile_no,email_id,address,state_nm,country_nm,pincode,city_nm,emp_salary,emp_age) values (:empId,:firstNm,:middleNm,:lastNm,:emailId,:address,:pincode,:empSalary,:mobileNo,:empAge,:countryNm,:stateNm,:cityNm)";


	    		 Map<String,Object> parameters=new HashMap<>();
	    		 parameters.put("empId",updateEmployeeRequest.getEmpId());
	    		 parameters.put("firstNm",updateEmployeeRequest.getFirstNm());
	    		 parameters.put("middleNm",updateEmployeeRequest.getMiddleNm());
	    		 parameters.put("lastNm",updateEmployeeRequest.getLastNm());
	    		 parameters.put("mobileNo",updateEmployeeRequest.getMobileNo());
	    		 parameters.put("emailId",updateEmployeeRequest.getEmailId());
	    		 parameters.put("address",updateEmployeeRequest.getAddress());
	    		 parameters.put("stateNm",updateEmployeeRequest.getStateNm());
	    		 parameters.put("cityNm",updateEmployeeRequest.getCityNm());	 
	    		 parameters.put("countryNm",updateEmployeeRequest.getCountryNm());
	    		 parameters.put("empAge",updateEmployeeRequest.getCountryNm());
	    		 parameters.put("empSalary",updateEmployeeRequest.getEmpSalary());
	    		 parameters.put("pincode",updateEmployeeRequest.getPincode());
	    		 
	    		 
	    		 boolean result=true;
	    		 try{
	    		 result= namedParameterJdbcTemplate.update(queryToUpdateEmployeeDetails ,parameters)>0;  
	    		 }catch(Exception e) {
	    		 e.printStackTrace();
	    		 }
	    		return result;	    			  
	    	}
//	@Override
//	       public  Boolean deleteById(InsertEmployeeRequest deleteemployee) {
//	    	   String queryTodeleteEmployeeDetails = "delete employee details where emp_id=:empId";
//	    	   Map<String,Object> Parameters = new HashMap<> ();    
//	    	   Parameters.put("empId", deleteemployee.getEmpId());  
//
//	    	   boolean result=false;
//	    		 try{
//	    		 result= namedParameterJdbcTemplate.update(queryTodeleteEmployeeDetails ,Parameters)>0;  
//	    		 }catch(Exception e) {
//	    		 e.printStackTrace();
//	    		 }
//	    		return result;
//	    	  
//	    	 }
//}

//	@Override
//	public List<FetchEmployeeDetailsDto>  findAll(FetchEmployeeRequest fetchEmployeeRequest) {
//		
//		String queryForFetchEmployeeDetails = " SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.email_id,eir.emp_salary,eir.emp_age,eir.mobile_no,eir.country_nm,eir.state_nm,eir.city_nm,eir.pincode,eir.address,edp.emp_dept_id,edp.emp_id,edp.dept_id,edp.isactive,eds.emp_designation_id,eds.emp_id,eds.designation_id,eds.isactive,dr.dept_id,dr.dept_nm,dsr.designation_id,dsr.designation_nm FROM  employeedb.employee_info_ref  eir \r\n"
//					+ " INNER JOIN  employeedb.employee_department_ref  edp ON  eir.emp_id = edp.emp_id \r\n"
//					+ " INNER JOIN employeedb.employee_designation_ref  eds ON eir.emp_id = eds.emp_id\r\n"
//					+ " INNER JOIN   employeedb.department_ref dr ON edp.dept_id =dr.dept_id \r\n"
//					+ " INNER JOIN employeedb.designation_ref dsr ON  eds.designation_id =dsr.designation_id  \r\n";
//		
//		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(queryForFetchEmployeeDetails,
//				new BeanPropertySqlParameterSource(fetchEmployeeRequest));
//	
//		List<FetchEmployeeDetailsDto> empDetailsList = null;
//		List<EmployeeDeptBean> empDeptList = null;
//		List<EmployeeDesignationBean> empDesignationList = null;
//		
//		if (CollectionUtils.isNotEmpty(rows)) {
//			empDetailsList = new ArrayList<>();
//			Set<Integer> set = new HashSet<>();
//			
//
//
//		}
//		return empDetailsList;	

//	}
//	@Override
//	public List<FetchEmployeeDetailsDto> findAll(FetchEmployeeRequest fetchEmployeeRequest) {
//
//		
//        String sql = " SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.email_id,eir.emp_salary,eir.emp_age,eir.mobile_no,eir.country_nm,eir.state_nm,eir.city_nm,eir.pincode,eir.address,edp.emp_dept_id,edp.emp_id,edp.dept_id,edp.isactive,eds.emp_designation_id,eds.emp_id,eds.designation_id,eds.isactive,dr.dept_id,dr.dept_nm,dsr.designation_id,dsr.designation_nm FROM  employeedb.employee_info_ref  eir \r\n"
//				+ " INNER JOIN  employeedb.employee_department_ref  edp ON  eir.emp_id = edp.emp_id \r\n"
//				+ " INNER JOIN employeedb.employee_designation_ref  eds ON eir.emp_id = eds.emp_id\r\n"
//				+ " INNER JOIN   employeedb.department_ref dr ON edp.dept_id =dr.dept_id \r\n"
//				+ " INNER JOIN employeedb.designation_ref dsr ON  eds.designation_id =dsr.designation_id  \r\n";
//
//        
//        
//        List<FetchEmployeeDetailsDto> FetchEmployeeDetailsDto = new ArrayList<>();
//        
//        
//
//        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
//
//        for (Map row : rows) {
//      //  	FetchEmployeeDetailsDto obj = new FetchEmployeeDetailsDto();
//
//
//			FetchEmployeeDetailsDto fetchEmployeeDetailsDto = new FetchEmployeeDetailsDto();
//			fetchEmployeeDetailsDto.setEmpNm((String) row.get("emp_nm"));
//			fetchEmployeeDetailsDto.setEmpId((Integer) row.get("emp_id"));
//			fetchEmployeeDetailsDto.setFirstNm((String) row.get("first_nm"));
//			fetchEmployeeDetailsDto.setLastNm((String) row.get("last_nm"));
//			fetchEmployeeDetailsDto.setMiddleNm((String) row.get("middle_nm"));
//			fetchEmployeeDetailsDto.setEmpSalary((String) row.get("emp_salary"));
//			fetchEmployeeDetailsDto.setEmpAge((String) row.get("emp_age"));
//			fetchEmployeeDetailsDto.setCountryNm((String) row.get("country_nm"));
//			fetchEmployeeDetailsDto.setCityNm((String) row.get("city_nm"));
//			fetchEmployeeDetailsDto.setPincode((Integer) row.get("pincode"));
//	
//        }
//
//        return FetchEmployeeDetailsDto;
//    }
	
	@Override
	public InsertEmployeeRequest fetchById(Long emp_id) {
		
		String queryForFetchById = "SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.email_id,eir.emp_salary,eir.emp_age,"
				+ "eir.mobile_no,eir.country_nm,eir.state_nm,eir.city_nm,eir.pincode,eir.address,edp.emp_dept_id,edp.emp_id,edp.dept_id,"
				+ "edp.isactive,eds.emp_designation_id,eds.emp_id,eds.designation_id,eds.isactive,dr.dept_id,dr.dept_nm,dsr.designation_id,"
				+ "dsr.designation_nm FROM  employeedb.employee_info_ref  eir INNER JOIN employeedb.employee_department_ref  edp ON "
				+ " eir.emp_id = edp.emp_id  INNER JOIN employeedb.employee_designation_ref  eds ON eir.emp_id = eds.emp_id INNER JOIN  "
				+ " employeedb.department_ref dr ON edp.dept_id =dr.dept_id INNER JOIN employeedb.designation_ref dsr ON  "
				+ "eds.designation_id=dsr.designation_id where eir.emp_id=:empId ";
		
//		return (InsertEmployeeRequest) namedParameterJdbcTemplate.query(queryForFetchById, new InsertEmployeeRequestMapperForEmployeeId());
//	}		
		
		Map<String, Long> parameters = new HashMap<String, Long>();
		parameters.put("empId", emp_id);
		return (InsertEmployeeRequest) namedParameterJdbcTemplate.queryForObject(queryForFetchById, parameters,
				new InsertEmployeeRequestMapperForEmployeeId());
	}
     class InsertEmployeeRequestMapperForEmployeeId implements RowMapper<InsertEmployeeRequest> {
		public InsertEmployeeRequest mapRow(ResultSet rs, int rowNum) throws SQLException {

			InsertEmployeeRequest insertEmployeeRequest = new InsertEmployeeRequest();

			EmployeeDeptBean employeeDeptBean = new EmployeeDeptBean();
			List<EmployeeDeptBean> employeeDepartemntList = new ArrayList<>();
			EmployeeDesignationBean employeeDesignationBean = new EmployeeDesignationBean();
			List<EmployeeDesignationBean> employeeDesignationList = new ArrayList<>();

			insertEmployeeRequest.setEmpId(rs.getLong("emp_id"));
			insertEmployeeRequest.setFirstNm(rs.getString("first_nm"));
			insertEmployeeRequest.setMiddleNm(rs.getString("middle_nm"));
			insertEmployeeRequest.setLastNm(rs.getString("last_nm"));
			insertEmployeeRequest.setEmailId(rs.getString("email_id"));
			insertEmployeeRequest.setEmpSalary(rs.getInt("emp_salary"));
			insertEmployeeRequest.setEmpAge(rs.getInt("emp_age"));
			insertEmployeeRequest.setMobileNo(rs.getLong("mobile_no"));
			insertEmployeeRequest.setCountryNm(rs.getString("country_nm"));
			insertEmployeeRequest.setStateNm(rs.getString("state_nm"));
			insertEmployeeRequest.setCityNm(rs.getString("city_nm"));
			insertEmployeeRequest.setPincode(rs.getInt("pincode"));
			insertEmployeeRequest.setAddress(rs.getString("address"));

			employeeDeptBean.setDeptId(rs.getInt("dept_id"));
			employeeDeptBean.setDeptNm(rs.getString("dept_nm"));
			employeeDeptBean.setEmpDeptId(rs.getLong("emp_dept_id"));
			employeeDeptBean.setEmpId(rs.getLong("emp_id"));
			employeeDeptBean.setIsactive(rs.getBoolean(1));
			employeeDepartemntList.add(employeeDeptBean);
			insertEmployeeRequest.setDepartmentList(employeeDepartemntList);

			employeeDesignationBean.setDesignationId(rs.getLong("designation_id"));
			employeeDesignationBean.setDesignationNm(rs.getString("designation_nm"));
			employeeDesignationBean.setEmpDesignationId(rs.getLong("emp_designation_id"));
			employeeDesignationBean.setEmpId(rs.getLong("emp_id"));
			employeeDesignationBean.setIsactive(rs.getBoolean(1));
			employeeDesignationList.add(employeeDesignationBean);
			insertEmployeeRequest.setDesignationList(employeeDesignationList);

			return insertEmployeeRequest;
		}	
}
//------------
     
     @Override
     public Boolean insertEmployeeRequestListUsingJdbcTemplate(
 			List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate) {

 		for (InsertEmployeeRequest insertEmployeeRequest : insertEmployeeRequestListUsingJdbcTemplate) {
 			int count = 0;
 			KeyHolder holder = new GeneratedKeyHolder();
 			String queryForInsertEmployeeData = "insert  into employee_info_ref(first_nm,middle_nm,last_nm,email_id,emp_salary,emp_age,mobile_no,country_nm,state_nm,city_nm,pincode,address)"
 					+ "values(:firstNm,:middleNm,:lastNm,:emailId,:empSalary,:empAge,:mobileNo,:countryNm,:stateNm,:cityNm,:pincode,:address)";

 			if (insertEmployeeRequest.getEmpId() == null) {
 				count = namedParameterJdbcTemplate.update(queryForInsertEmployeeData,
 						new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "emp_id" });
 				insertEmployeeRequest.setEmpId(holder.getKey().longValue());
 			} else {

 				String queryForUpdateEmployeeData = "Update employee.info_ref set first_nm=:firstNm,email_id=:emailId,mobile_no=:mobileNo where emp_id=:empId";
 				count = namedParameterJdbcTemplate.update(queryForUpdateEmployeeData,
 						new BeanPropertySqlParameterSource(insertEmployeeRequest));
 			}

 			if (count > 0) {
 				if (insertEmployeeRequest.getDepartmentList() != null
 						&& insertEmployeeRequest.getDepartmentList().size() > 0) {
 					String queryToInsertEmpDepartments = "insert into employee_department_ref (dept_id,emp_id,isactive) values (?,?,true)";
 					int[] result = jdbcTemplate.batchUpdate(queryToInsertEmpDepartments,
 							new BatchPreparedStatementSetter() {
 								@Override
 								public void setValues(PreparedStatement ps, int i) throws SQLException {
 									EmployeeDeptBean employeeDeptObj = insertEmployeeRequest.getDepartmentList().get(i);
 									if (employeeDeptObj.getDeptId() != null) {
 										ps.setLong(1, employeeDeptObj.getDeptId());
 									} else {
 										ps.setNull(1, java.sql.Types.BIGINT);
 									}
 									ps.setLong(2, insertEmployeeRequest.getEmpId());
 								}

 								@Override
 								public int getBatchSize() {
 									return insertEmployeeRequest.getDepartmentList().size();
 								}
 							});
 				}
 				if (insertEmployeeRequest.getDesignationList() != null
 						&& insertEmployeeRequest.getDesignationList().size() > 0) {
 					String queryToInsertEmpDesignations = "insert into employee_designation_ref (designation_id,emp_id,isactive) values (?,?,true)";
 					int[] result = jdbcTemplate.batchUpdate(queryToInsertEmpDesignations,
 							new BatchPreparedStatementSetter() {
 								@Override
 								public void setValues(PreparedStatement ps, int i) throws SQLException {
 									EmployeeDesignationBean employeeDesignationObj = insertEmployeeRequest
 											.getDesignationList().get(i);
 									if (employeeDesignationObj.getDesignationId() != null) {
 										ps.setLong(1, employeeDesignationObj.getDesignationId());
 									} else {
 										ps.setNull(1, java.sql.Types.BIGINT);
 									}
 									ps.setLong(2, insertEmployeeRequest.getEmpId());
 								}

 								@Override
 								public int getBatchSize() {
 									return insertEmployeeRequest.getDesignationList().size();
 								}
 							});
 				}
 			}
 		}
 		return true;
 	}
     
	
}



