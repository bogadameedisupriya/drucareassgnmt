package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Bean.Employee;
import com.example.Bean.Movie;
import com.example.Dao.MovieServiceDao;
@Service
public class MovieServiceImpl  implements MovieService{
	
	@Autowired
	private MovieServiceDao service ;
	@Override
	public Movie getMovieInfo( String movieId) {
		return service.getMovieInfo(movieId) ;
		
	}
	
//public Boolean add( @RequestBody Employee insertemployee) {
//	return service.insertEmployeedetails(insertemployee);
//}
}
