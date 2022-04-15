package com.example.Entity;

public class Employee {
	  private String id;
	private long firstNm;
	  private long lastNm;
	  private long middleNm;
	  private long mobileNo;
	  private long emailid;
	  private long address;
	  private long stateNm;
	  private long countryNm;
	  private long cityNm;
	  private long qualificationNm;
	  private long pincode;
	  public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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
	public void setLastNm(long lastNm) {
		this.lastNm = lastNm;
	}
	public String getMiddleNm() {
		return middleNm;
	}
	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStateNm() {
		return stateNm;
	}
	public void setStateNm(String stateNm) {
		this.stateNm = stateNm;
	}
	public String getCountryNm() {
		return countryNm;
	}
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}
	public String getCityNm() {
		return cityNm;
	}
	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}
	public String getQualificationNm() {
		return qualificationNm;
	}
	public void setQualificationNm(String qualificationNm) {
		this.qualificationNm = qualificationNm;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Employee(long firstNm, String lastNm, String middleNm, String mobileNo, String emailid, String address,
			String stateNm, String countryNm, String cityNm, String qualificationNm, String pincode) {
		super();
		this.firstNm = firstNm;
		this.lastNm = lastNm;
		this.middleNm = middleNm;
		this.mobileNo = mobileNo;
		this.emailid = emailid;
		this.address = address;
		this.stateNm = stateNm;
		this.countryNm = countryNm;
		this.cityNm = cityNm;
		this.qualificationNm = qualificationNm;
		this.pincode = pincode;
	}
}

		