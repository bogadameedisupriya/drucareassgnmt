package com.example.Dao;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.Bean.Employee;
import com.example.Bean.Movie;



public interface MovieServiceDao {

	public	Movie getMovieInfo(  String movieId);
	
//	public boolean insertEmployeedetails(Employee insertEmployeeRequest);
}
