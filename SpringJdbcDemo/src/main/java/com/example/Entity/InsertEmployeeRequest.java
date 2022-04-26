package com.example.Entity;

import java.util.List;

public class InsertEmployeeRequest {

	private Long Id;
	private String firstNm;
	private String lastNm;
	private String emailid;
	private Long mobileNo;
	private String countryNm;
	private String stateNm;
	private String cityNm;
	private Integer pincode;
	private String address;
	
	private List<EmployeeDepartmentBean> departmentList ;
	private List<EmployeeDesignationBean> designationList;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	public List<EmployeeDepartmentBean> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<EmployeeDepartmentBean> departmentList) {
		this.departmentList = departmentList;
	}
	public List<EmployeeDesignationBean> getDesignationList() {
		return designationList;
	}
	public void setDesignationList(List<EmployeeDesignationBean> designationList) {
		this.designationList = designationList;
	}
	
	
	
}