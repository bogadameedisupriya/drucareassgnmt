package com.example.Bean;

public class EmployeeDeptBean {
	
	private Integer deptId;
	private String deptNm;
	private Long empId;
	private Long empDeptId;;
	private Boolean isactive;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Long getEmpDeptId() {
		return empDeptId;
	}

	public void setEmpDeptId(Long empDeptId) {
		this.empDeptId = empDeptId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer integer) {
		this.deptId = integer;
	}

	public String getDeptNm() {
		return deptNm;
	}

	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}


}
