package com.example.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Rating;
import com.example.project.UserRating;

@RestController
@RequestMapping("/ratingsdata")

public class RatingResourceController {	
		
		@RequestMapping("/{movieId}")
		public Rating getRating(@PathVariable String movieId) {
			
			return new Rating( movieId,4);
		}
		@RequestMapping("/users/{userId}")
		public UserRating getUserRating(@PathVariable String userId) {
			List<Rating>  ratingList = Arrays.asList(new Rating("123",4),new Rating("5678", 3));
//		    return ratingList;
			UserRating userRating = new UserRating();
			userRating.setUserRating(ratingList);
			return userRating;
		}
		@RequestMapping("/hello")
		public String sayHello() {
			return "hello";
		}		
	}
