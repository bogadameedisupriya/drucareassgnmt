package com.drucare.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.Entity.Course;
import com.example.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;

	public  List<Course>  getAllCourses(String topicId){
		List<Course> courseList = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courseList::add);
		return courseList;

	}
	public  Course  getCourse(String id){
		return courseRepository.findById(id).get();
	}

	public  void  addCourse(Course course){
		courseRepository.save(course);
	}
	public  void  updateCourse(Course course){
		System.out.println("***********");
		courseRepository.save(course);

	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}


