package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.MovieService;
import com.example.Bean.Employee;
import com.example.Bean.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	 private MovieService movieService;	
	
		@GetMapping("/{movieId}")
		public Movie getMovieInfo(@PathVariable String movieId) {
			
			return movieService.getMovieInfo(movieId);
			
		}
		@RequestMapping("/hello")
		public String hello() {
			System.out.println("hello");
			return "hello";
		}
//		@PostMapping("/insertemployee")
//		public Boolean add(@RequestBody  Employee  insertemployee){
//			 return movieService.add(insertemployee);	
//		}
//		
		
		
	}