package com.example.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Bean.Employee;
import com.example.Bean.Movie;



public interface MovieService {
	
	public Movie getMovieInfo( String movieId);


//	public Boolean add(Employee insertemployee);

}
