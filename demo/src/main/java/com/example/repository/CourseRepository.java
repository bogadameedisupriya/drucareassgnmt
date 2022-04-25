package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drucare.Entity.Course;

public interface CourseRepository  extends CrudRepository<Course, String>{
	  public List<Course>  findByTopicId(String topicId);

}
