package com.example.Bean;

import java.util.List;

public class FetchEmployeeDetailsDto {
	
	private Integer empId;
	private String empNm;
	private String firstNm;
	private String middleNm;
	private String lastNm;
	private String emailId;
	private Integer mobileNo;
	private Integer empSalary;
	private String empAge;
	private String countryNm;
	private String stateNm;
	private String cityNm;
	private Integer pincode;
	private String address;
	private Long deptId;
	private List<EmployeeDeptBean> empDeptList;
	private List<EmployeeDesignationBean> empDesignationList;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
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
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAge() {
		return empAge;
	}
	public void setEmpAge(String empAge) {
		this.empAge = empAge;
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
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public List<EmployeeDeptBean> getEmpDeptList() {
		return empDeptList;
	}
	public void setEmpDeptList(List<EmployeeDeptBean> empDeptList) {
		this.empDeptList = empDeptList;
	}
	public List<EmployeeDesignationBean> getEmpDesignationList() {
		return empDesignationList;
	}
	public void setEmpDesignationList(List<EmployeeDesignationBean> empDesignationList) {
		this.empDesignationList = empDesignationList;
	}
	
	

}
