package com.example.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.project.CatalogItem;
import com.example.project.Movie;
import com.example.project.Rating;
import com.example.project.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
		
		@Autowired
		private RestTemplate restTemplate ;

		@RequestMapping("/{userId}")
		public List<CatalogItem> getCatalog(@PathVariable String  userId) {
			List<Rating>  ratingList = Arrays.asList(new Rating("123",4),new Rating("5678", 3));
			
			UserRating userRating = restTemplate.getForObject("http://localhost:1001/ratingsdata/users/3",UserRating.class );
	System.out.println("******************output******************" +userRating);
			return userRating.getUserRating().stream()
					.map(rating -> {
				
						Movie movie = restTemplate.getForObject("http://localhost:1002/movies/"+rating.getMovieId(), Movie.class);
						return new CatalogItem(movie.getName(),"aliens description",rating.getRating());
					})
					.collect(Collectors.toList());

		}
	}

