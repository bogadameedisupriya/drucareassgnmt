package com.drucare.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Student;

@Service
public class StudentService {
	List<Student>StudentList = 	new ArrayList<Student>();
	public List<Student> getAllStudent() {
		return StudentList;
	}
	public Student getStudent(String id) {
		// TODO Auto-generated method stub
	return StudentList.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addStudent(Student Student) {
		// TODO Auto-generated method stub
		StudentList.add(Student);

	}

	public void updateStudent(Student Student, String id) {
		// TODO Auto-generated method stub
		for(int i = 0; i< StudentList.size(); i++) {
			Student t = StudentList.get(i);
			if(t.getId().equals(id)){
				StudentList.set(i,Student );
			}
		}	
	}
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		StudentList.removeIf(t -> t.getId().equals(id));

		
	}
}

