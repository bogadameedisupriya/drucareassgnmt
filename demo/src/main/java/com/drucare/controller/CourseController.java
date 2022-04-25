package com.drucare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.Entity.Course;
import com.drucare.Entity.Topic;
import com.drucare.Service.CourseService;

@RestController
public class CourseController {
		@Autowired
		CourseService courseService;

		@RequestMapping("/topics/{id}/courses")
		public List<Course> getAllTheCourses(@PathVariable String id) {
			return courseService.getAllCourses(id);
		}
		@RequestMapping("/topics/{id}/courses/{courseId}")
		public Course getCourse(@PathVariable String courseId) {
			return courseService.getCourse(courseId);
		}
		@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
		public void addCourse(@RequestBody Course course, @PathVariable String  topicId) { 
			course.setTopic(new Topic(topicId,"",""));
			courseService.addCourse(course); 
		}

		@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
		public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String courseId) {
			course.setTopic(new Topic(topicId,"",""));
			courseService.updateCourse(course);
		}

		@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
		public void deleteCourse(@PathVariable String courseId) {
			 courseService.deleteCourse(courseId);
		}
	}


