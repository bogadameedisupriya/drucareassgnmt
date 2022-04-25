package com.drucare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.Entity.Employee;
import com.drucare.Entity.EmployeeCourse;
import com.drucare.Service.EmployeeCourseService;

@RestController
public class EmployeeCourseController {
	@Autowired
	EmployeeCourseService EmployeeCourseService;

	@RequestMapping("/Employee/{id}/EmployeeCourse")
	public List<EmployeeCourse> getAllTheCourses(@PathVariable String id) {
		return EmployeeCourseService.getAllEmployeeCourse(id);
	}
	@RequestMapping("/Employee/{id}/EmployeeCourse/{EmployeeCourseId}")
	public EmployeeCourse getCourse(@PathVariable String EmployeeCourseId) {
		return EmployeeCourseService.getEmployeeCourse(EmployeeCourseId);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/Employee/{EmployeeId}/EmployeeCourse")
	public void addCourse(@RequestBody EmployeeCourse EmployeeCourse, @PathVariable String  EmployeeId) { 
		EmployeeCourse.setEmployee(new Employee(EmployeeId,"",""));
		EmployeeCourseService.addEmployeeCourse(EmployeeCourse); 
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/Employee/{EmployeeId}/EmployeeCourse/{EmployeeCourseId}")
	public void updateCourse(@RequestBody EmployeeCourse EmployeeCourse,@PathVariable String EmployeeId, @PathVariable String EmployeeCourseId) {
		EmployeeCourse.setEmployee(new Employee(EmployeeId,"",""));
		EmployeeCourseService.updateEmployeeCourse(EmployeeCourse);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/Employee/{EmployeeId}/EmployeeCourse/{EmployeeCourseId}")
	public void deleteEmployeeCourse(@PathVariable String EmployeeCourseId) {
		EmployeeCourseService.deleteEmployeeCourse(EmployeeCourseId);
	}
}