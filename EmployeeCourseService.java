package com.drucare.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.Entity.EmployeeCourse;
import com.example.repository.EmployeeCourseRepository;

@Service
public class EmployeeCourseService {	
@Autowired	
private EmployeeCourseRepository EmployeeCourseRepository;

 public  List<EmployeeCourse>  getAllEmployeeCourse(String EmployeeId){
	List<EmployeeCourse> EmployeeCourseList = new ArrayList<>();
	EmployeeCourseRepository.findByEmployeeId(EmployeeId).forEach(EmployeeCourseList::add);
	return EmployeeCourseList;
	
 }

public EmployeeCourse getEmployeeCourse(String employeeCourseId) {
	// TODO Auto-generated method stub
	return EmployeeCourseRepository.findById(employeeCourseId).get();

}

public void addEmployeeCourse(EmployeeCourse EmployeeCourse) {
	// TODO Auto-generated method stub
	EmployeeCourseRepository.save(EmployeeCourse);

	
}

public void updateEmployeeCourse(EmployeeCourse EmployeeCourse) {
	// TODO Auto-generated method stub
	EmployeeCourseRepository.save(EmployeeCourse);

	
}

public void deleteEmployeeCourse(String EmployeeCourseId) {
	// TODO Auto-generated method stub
	EmployeeCourseRepository.deleteById(EmployeeCourseId);

	
}




}
