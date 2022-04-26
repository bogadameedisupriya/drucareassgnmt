package com.example.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.Entity.EmployeeDepartmentBean;
import com.example.Entity.EmployeeDesignationBean;
import com.example.Entity.InsertEmployeeRequest;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Boolean insertEmployeeDetails(InsertEmployeeRequest insertEmployeeRequest) {
		String queryToInsertEmployeeDetails = "insert  into employee_info_ref(id,firstNm,lastNm,emailid,mobile_no,country_nm,state_nm,city_nm,pincode,address)"
				+ "values(:id,:firstNm,:lastNm,:emailid,:mobileNo,:countryNm,:stateNm,:cityNm,:pincode,:address)";

		KeyHolder holder = new GeneratedKeyHolder();

		int count = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "id" });

		long empId = holder.getKey().longValue();
        Boolean result;
		if (count > 0) {
			String queryForInsertEmployeeDepartments = "insert into employee_department_ref (dept_id,emp_id,isactive) values(:deptId,:empId,true)";
			if (insertEmployeeRequest.getDepartmentList() != null
					&& insertEmployeeRequest.getDepartmentList().size() > 0) {
				for (EmployeeDepartmentBean employeeDeptBean : insertEmployeeRequest.getDepartmentList()) {

//					namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments,
//							new BeanPropertySqlParameterSource(employeeDeptBean));
					MapSqlParameterSource deptParameters = new MapSqlParameterSource().addValue("empId", empId).addValue("deptId", employeeDeptBean.getDeptId());
					result=	namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments, deptParameters)>0;
				}
			}
			String queryForInsertEmployeeDesignations = "insert into employee_designation_ref (designation_id,emp_id,isactive) values(:designationId,:empId,true)";
			if (insertEmployeeRequest.getDesignationList() != null
					&& insertEmployeeRequest.getDesignationList().size() > 0) {
				for (EmployeeDesignationBean employeeDesignationBean : insertEmployeeRequest.getDesignationList()) {

//					namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignations,
//							new BeanPropertySqlParameterSource(employeeDesignationBean));
				MapSqlParameterSource designationParameters = new MapSqlParameterSource().addValue("empId", empId).addValue("designationId", employeeDesignationBean.getDesignationId());
				result =namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignations,designationParameters)>0;

				}

			}
		}
		return null;
	}

}
   