package com.exmple.bean;

import java.util.List;

public class InsertEmployeeRequest {
	
	
	private Long empId;
	private String firstNm;
	private String middleNm;
	private String lastNm;
	private String emailId;
	private Double empSalary;
	private Integer empAge;
	private Long mobileNo;
	private String countryNm;
	private String stateNm;
	private String cityNm;
	private Integer pincode;
	private String address;

	private List<EmployeeDeptBean> departmentList;

	private List<EmployeeDesignationBean> designationList;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getMiddleNm() {
		return middleNm;
	}

	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCountryNm() {
		return countryNm;
	}

	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}

	public String getStateNm() {
		return stateNm;
	}

	public void setStateNm(String stateNm) {
		this.stateNm = stateNm;
	}

	public String getCityNm() {
		return cityNm;
	}

	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<EmployeeDeptBean> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(List<EmployeeDeptBean> departmentList) {
		this.departmentList = departmentList;
	}

	public List<EmployeeDesignationBean> getDesignationList() {
		return designationList;
	}

	public void setDesignationList(List<EmployeeDesignationBean> designationList) {
		this.designationList = designationList;
	}
	

}
