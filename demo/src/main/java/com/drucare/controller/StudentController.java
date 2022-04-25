package com.drucare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student;
import com.drucare.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService StudentService;
	
	@RequestMapping("/Student")
	public List<Student> listOfData() {
		return StudentService.getAllStudent();
	}
	@RequestMapping("/Student/{id}")
	public Student getParticularStudent(@PathVariable String id ) {
	return StudentService.getStudent(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/Student")
	public void addStudent(@RequestBody Student Student) {
		StudentService.addStudent(Student);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/Student/{id}")
	public void updateStudent(@RequestBody Student Student, @PathVariable String id ) {
		StudentService.updateStudent(Student, id );
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/Student/{id}")
	public void deleteStudent( @PathVariable String id ) {
		StudentService.deleteStudent( id );
	}	
}
