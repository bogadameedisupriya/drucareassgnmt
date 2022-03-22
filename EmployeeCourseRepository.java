package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drucare.Entity.EmployeeCourse;


public interface EmployeeCourseRepository extends CrudRepository<EmployeeCourse, String>{
	  public List<EmployeeCourse>  findByEmployeeId(String EmployeeId);


}
