package com.drucare.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeCourse {
	@Id
	private String id;
	private String programminglanguage;
	@ManyToOne
	private Employee Employee;
	
	public EmployeeCourse(String id, String programminglanguage,String EmployeeId) {
          super();
		this.id = id;
		this.programminglanguage = programminglanguage;
		this.Employee = new Employee(EmployeeId,"","");
	}
	public EmployeeCourse() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProgramminglanguage() {
		return programminglanguage;
	}

	public void setProgramminglanguage(String programminglanguage) {
		this.programminglanguage = programminglanguage;
	}

	public Employee getEmployee() {
		return Employee;
	}

	public void setEmployee(Employee employee) {
		Employee = employee;
	}
}
